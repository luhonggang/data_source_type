package com.shanlin.quant.dataSource.update;

import java.util.ArrayList;
import java.util.List;
import com.shanlin.quant.dataSource.update.ScanPackage;

/**
 * Created by chris on 2017/6/15.
 */
public class DataSourceUpdateFactory {

    private List<DataSourceUpdate> updater = new ArrayList<DataSourceUpdate>();

    public List<DataSourceUpdate> initUpdater() throws Exception{
        List<Class<?>> list=new ArrayList<Class<?>>();
        ScanPackage.scan("com.shanlin.quant.dataSource.update.impl",list);
        for(Class<?> cla:list){
            System.out.println(cla.getName()+"   superClass is:"+cla.getSuperclass());
            Object obj = cla.forName(cla.getName()).newInstance();
            if (obj instanceof DataSourceUpdate){
                DataSourceUpdate dsu = (DataSourceUpdate)obj;
                this.updater.add(dsu);
            }
        }
        return this.updater;
    }

    public void runUpdate(){
        if (updater.size() <= 0)
                return;

        for (DataSourceUpdate dsu: updater) {
            if(dsu.needUpdate()){
                // do update
                boolean runResult = dsu.runUpdate();
                if(!runResult){
                    // log
                }
                // do after update
                dsu.doAfterUpdate();
            }
        }

    }
}
