//package com.study.mongo.controller.st;
//
//import com.mongodb.ServerAddress;
//import com.mongodb.client.MongoClient;
//import java.util.ArrayList;
//import java.util.List;
//import org.apache.logging.log4j.Logger;
//import org.mybatis.logging.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.MongoDbFactory;
//
///**
// * @description:
// * @author: 16000
// * @create: 2021/3/18     17:50
// */
//
////@Configuration
//public class MongoConfig {
////
////  private static final Logger logger = (Logger) LoggerFactory.getLogger(MongoConfig.class);
////
////  // 覆盖容器中默认的MongoDbFacotry Bean
//////  @Bean
//////  @Autowired
//////  public MongoDbFactory mongoDbFactory(MongoSettingsProperties properties) {
////////
////////    // 客户端配置（连接数，副本集群验证）
////////    MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
////////    builder.connectionsPerHost(properties.getMaxConnectionsPerHost());
////////    builder.minConnectionsPerHost(properties.getMinConnectionsPerHost());
////////    if (properties.getReplicaSet() != null) {
////////      builder.requiredReplicaSetName(properties.getReplicaSet());
////////    }
////////    builder.threadsAllowedToBlockForConnectionMultiplier(
////////        properties.getThreadsAllowedToBlockForConnectionMultiplier());
////////    builder.serverSelectionTimeout(properties.getServerSelectionTimeout());
////////    builder.maxWaitTime(properties.getMaxWaitTime());
////////    builder.maxConnectionIdleTime(properties.getMaxConnectionIdleTime());
////////    builder.maxConnectionLifeTime(properties.getMaxConnectionLifeTime());
////////    builder.connectTimeout(properties.getConnectTimeout());
////////    builder.socketTimeout(properties.getSocketTimeout());
////////    // builder.socketKeepAlive(properties.getSocketKeepAlive());
////////    builder.sslEnabled(properties.getSslEnabled());
////////    builder.sslInvalidHostNameAllowed(properties.getSslInvalidHostNameAllowed());
////////    builder.alwaysUseMBeans(properties.getAlwaysUseMBeans());
////////    builder.heartbeatFrequency(properties.getHeartbeatFrequency());
////////    builder.minHeartbeatFrequency(properties.getMinHeartbeatFrequency());
////////    builder.heartbeatConnectTimeout(properties.getHeartbeatConnectTimeout());
////////    builder.heartbeatSocketTimeout(properties.getHeartbeatSocketTimeout());
////////    builder.localThreshold(properties.getLocalThreshold());
////////    MongoClientOptions mongoClientOptions = builder.build();
////////
////////    // MongoDB地址列表
////////    List<ServerAddress> serverAddresses = new ArrayList<ServerAddress>();
////////    for (String address : properties.getAddress()) {
////////      String[] hostAndPort = address.split(":");
////////      String host = hostAndPort[0];
////////      Integer port = Integer.parseInt(hostAndPort[1]);
////////      ServerAddress serverAddress = new ServerAddress(host, port);
////////      serverAddresses.add(serverAddress);
////////    }
////////
////////    logger.info("serverAddresses:" + serverAddresses.toString());
//////
//////    // 连接认证
//////    // MongoCredential mongoCredential = null;
//////    // if (properties.getUsername() != null) {
//////    // 	mongoCredential = MongoCredential.createScramSha1Credential(
//////    // 			properties.getUsername(), properties.getAuthenticationDatabase() != null
//////    // 					? properties.getAuthenticationDatabase() : properties.getDatabase(),
//////    // 			properties.getPassword().toCharArray());
//////    // }
//////
//////    // 创建认证客户端
//////    // MongoClient mongoClient = new MongoClient(serverAddresses, mongoCredential, mongoClientOptions);
//////
//////    // 创建非认证客户端
////////    MongoClient mongoClient = new MongoClient(serverAddresses, mongoClientOptions);
////////
////////    // 创建MongoDbFactory
////////    MongoDbFactory mongoDbFactory = new SimpleMongoDbFactory(mongoClient, properties.getDatabase());
////////    return mongoDbFactory;
////////  }
//}