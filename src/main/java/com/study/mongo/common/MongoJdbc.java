package com.study.mongo.common;

import com.mongodb.ServerAddress;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;

/**
 * @description:
 * @author: 16000
 * @create: 2021/3/18     16:26
 */

public class MongoJdbc {
  private static final Log log = LogFactory.getLog(MongoJdbc.class);
  public static ServerAddress seed = new ServerAddress("lixiaofei.mongodb.rds.aliyuncs.com", 3717);
  public static String username = "user44497896";
  public static String password = "Mongo123";
  public static String DEFAULT_DB = "admin";
  public static String DEMO_DB = "Student";
  public static String DEMO_COLL = "col";


  public static void main(String[] args) {
//    MongoClientURI connectionString = new MongoClientURI("mongodb://" + username + ":" + password + "@" + seed + "/" + DEFAULT_DB);
//    MongoClient mongoClient = new MongoClient(connectionString);
//    SimpleMongoDbFactory factory = new SimpleMongoDbFactory(mongoClient, DEMO_DB);
//    MongoTemplate template = new MongoTemplate(factory);
  }
}
