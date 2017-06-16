package com.shanlin.quant.dataSource;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 类注释
 *
 * @author: luhonggang
 * @date: 2017/6/16
 * @time: 14:55
 * @since: 1.0
 */
public class ReadCVSUtil extends  SecurityDataAdapter{
    public static void main(String[] args){
        File csv = new File("C:\\Users\\dell、\\Desktop\\工作\\securitydata_20170216\\S\\1992\\HKHSI.csv");  // CSV文件路径
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader(csv));
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        String line = "";
        String everyLine = "";
        try {
            List<String> allString = new ArrayList<String>();
            while ((line = br.readLine()) != null)  //读取到的内容给line变量
            {
                everyLine = line;
                //System.out.println(everyLine);
                allString.add(everyLine);
            }
            SecurityKLineData cvsData = null;
            SecurityDataAdapter sdata = new ReadCVSUtil();
            for(int i=1;i<allString.size();i++){
                //cvsData = sdata.getKLine(allString.get(i));
                System.out.println("股票代码是: "+allString.get(i));
            }
            System.out.println("csv表格中所有行数："+allString.size());
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public SecurityKLineData getKLine(Object o) {
        List<String> list = Arrays.asList(o.toString().split(","));
        SecurityKLineData securityKLineData = new SecurityKLineData();

//        securityKLineData.setCode(list.get(i));
//        securityKLineData.setDate();
//        securityKLineData.setTimeZone();
////         list = o.toString().split(",");
//        SecurityKLineData securityKLineData = new SecurityKLineData();
//        for(int i=0;i<list.size();i++){
//            System.out.println("输出的数据是: "+list.get(i));
//            securityKLineData.setCode(list.get(i));
//            securityKLineData.setAmount();
//        }
        return new SecurityKLineData();
    }
}
