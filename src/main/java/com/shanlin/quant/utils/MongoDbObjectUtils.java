package com.shanlin.quant.utils;

import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: luhonggang
 * @date: 2017/6/15
 * @time: 10:17
 * @since: 1.0
 *  判断传入的URL是否需要进行token验签的操作
 */
@Configuration
public class MongoDbObjectUtils {
    @Value("${spring.data.mongodb.host}")
    private   String url;
    @Value("${spring.data.mongodb.port}")
    private   int port;
    @Value("${spring.data.mongodb.database}")
    private  String databases;

    // 提供 Mongodb对象
    // 使用说明: 当某个类需要Mongodb对象的实例的时候,可将当前类通过如下的方式来使用:
    // @Autowired
    // private MongoDbObjectUtils mongoDbObjectUtils;
    // mongoDbObjectUtils.getMongoObject() 来获取一个mongodb的实例
    public  Mongo getMongoObject(){
        Mongo mongo = new Mongo(url,port);
        return mongo;
    }

}
