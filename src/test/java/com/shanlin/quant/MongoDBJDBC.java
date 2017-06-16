package com.shanlin.quant;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCursor;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
/**
 * 类注释
 *
 * @author: luhonggang
 * @date: 2017/6/16
 * @time: 10:38
 * @see: 链接到其他资源
 * @since: 1.0
 */
    public class MongoDBJDBC{
        public static void main( String args[] ){
            try{
                // 连接到 mongodb 服务
                MongoClient mongoClient = new MongoClient( "localhost" , 27017 );//10.5.202.166

                // 连接到数据库
                MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
                System.out.println("Connect to database successfully");

                MongoCollection<Document> collection = mongoDatabase.getCollection("test");
                System.out.println("集合 test 选择成功");
                //插入文档
                /**
                 * 1. 创建文档 org.bson.Document 参数为key-value的格式
                 * 2. 创建文档集合List<Document>
                 * 3. 将文档集合插入数据库集合中 mongoCollection.insertMany(List<Document>) 插入单个文档可以用 mongoCollection.insertOne(Document)
                 * */
                Document document = new Document("\"_id\"","\"20140616\"").
                        append("\"value\"",new Document("\"code\"", "\"HKHSI\"")).
                        append("\"i_date\"", "\"642614400\"").
                        append("\"time\"", "\"1990/5/14\"").
                        append("\"open\"", "\"2963.51\"").
                        append("\"higt\"", "\"2988.8101\"").
                        append("\"low\"", "\"2963.51\"").
                        append("\"close\"", "\"2976.4399\"").
                        append("\"vol\"", "\"0\"").
                        append("\"amount\"","\"0\"");
                //.append("info", new Document("x", 203).append("y", 102));
                List<Document> documents = new ArrayList<Document>();
                documents.add(document);
                collection.insertMany(documents);
                System.out.println("文档插入成功");
                FindIterable<Document> findIterable = collection.find();
                MongoCursor<Document> mongoCursor = findIterable.iterator();
                while(mongoCursor.hasNext()){
                    System.out.println("查询插入的记录:"+mongoCursor.next());
                }
            }catch(Exception e){
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            }
        }
    }

