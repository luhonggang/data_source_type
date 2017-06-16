package com.shanlin.quant.dataSource.update;

/**
 * Created by chris on 2017/6/15.
 */


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScanPackage {
    /**
     *遍历包  并遍历子包
     */
    public static void scan(String packageName ,List<Class<?>> list) throws Exception{
        String path=getSrcPath()+packageToDir(packageName);
        File dir=new File(path);
        File[] files=dir.listFiles();
        Class<?> cla=null;
        for(File f:files){
            if(f.isDirectory()){
                String childName=packageName+"."+f.getName();
                scan(childName, list);

            }else{
                cla=Class.forName(packageName+"."+f.getName().split("\\.")[0]);
                list.add(cla);
            }
        }
    }
    /**
     获取当前路径
     */
    public static String getSrcPath() throws IOException{
        File file=new File("");
        String path=file.getCanonicalPath()+File.separator+"src";
        return path;
    }
    /**
     *package转换为路径格式
     */
    public static String packageToDir(String packageName){
        String[] array=packageName.split("\\.");
        StringBuffer sb=new StringBuffer();
        for(String str:array){
            sb.append(File.separator).append(str);
        }
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("输出当前的路径是: "+getSrcPath());
        List<Class<?>> list=new ArrayList<Class<?>>();
        scan("1990",list);//.1990.HKHSI.csv
        System.out.println(list.size());
        for(Class<?> cla:list){
            System.out.println(cla.getName());
        }
    }
}

