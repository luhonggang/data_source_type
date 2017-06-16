package com.shanlin.quant.dataSource;

import java.util.List;

/**
 * Created by chrishuang on 2017/6/12.
 */
public class SecurityData {
    private List<SecurityKLineData> kline;
    private SecurityExRightsInfo securityExRightsInfo;


    public List<SecurityKLineData> getKline() {
        return kline;
    }

    public void setKline(List<SecurityKLineData> kline) {
        this.kline = kline;
    }

    public SecurityExRightsInfo getSecurityExRightsInfo() {
        return securityExRightsInfo;
    }

    public void setSecurityExRightsInfo(SecurityExRightsInfo securityExRightsInfo) {
        this.securityExRightsInfo = securityExRightsInfo;
    }
}
