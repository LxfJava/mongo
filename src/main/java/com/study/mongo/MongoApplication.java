package com.study.mongo;

import com.spring4all.mongodb.EnableMongoPlus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongoPlus
public class MongoApplication {

  public static void main(String[] args) {
    SpringApplication.run(MongoApplication.class, args);
  }

}
