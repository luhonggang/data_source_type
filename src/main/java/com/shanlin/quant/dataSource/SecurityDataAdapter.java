package com.shanlin.quant.dataSource;

/**
 * Created by chrishuang on 2017/6/12.
 */
public abstract class SecurityDataAdapter<T> {


    public abstract SecurityKLineData getKLine(T t);


    public void storeKLine(T t){
        SecurityKLineData kline = getKLine(t);
        saveKline(kline);
    }

    public void  saveKline(SecurityKLineData kline){

    }
}



