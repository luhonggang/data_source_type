package com.shanlin.quant.dataSource.init;

import com.mongodb.Mongo;
import com.shanlin.quant.dataSource.update.DataSourceUpdate;

/**
 * 类注释
 * @author: luhonggang
 * @date: 2017/6/16
 * @time: 11:18
 * @since: 1.0
 */
public class ShCvsInitDataFormat implements DataSourceUpdate {

    @Override
    public boolean needUpdate() {
        return false;
    }

    @Override
    public boolean runUpdate() {
        return false;
    }

    @Override
    public void doAfterUpdate() {

    }
}
