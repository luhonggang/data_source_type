package com.shanlin.quant.dataSource.update;

/**
 * Created by chris on 2017/6/15.
 */
public interface DataSourceUpdate {

    public boolean needUpdate();

    public boolean runUpdate();

    public void doAfterUpdate();
}
