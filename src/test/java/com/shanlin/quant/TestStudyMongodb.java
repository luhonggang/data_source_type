package com.shanlin.quant;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 类注释
 *
 * @author: luhonggang
 * @date: 2017/6/14
 * @time: 19:45
 * @see: 链接到其他资源
 * @since: 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudyMongodb {

    @Value("${spring.data.mongodb.host}")
    private String url;

    @Value("${spring.data.mongodb.port}")
    private int port;
    @Value("${spring.data.mongodb.database}")
    private String databases;

    @Test
    public  void test(){
       // System.out.println("输出获取的对象是: "+ MatchTokenUtils.url);
    }
}
