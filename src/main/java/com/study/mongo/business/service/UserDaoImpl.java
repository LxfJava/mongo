package com.study.mongo.business.service;

import com.study.mongo.business.domain.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

/**
 * @description:
 * @author: 16000
 * @create: 2021/3/18     17:55
 */

public class UserDaoImpl implements UserDao {
  @Autowired
  private MongoTemplate mongoTemplate;

  @Override
  public void saveUser(UserEntity user) {
    mongoTemplate.save(user);
  }

  @Override
  public UserEntity findUserByName(String userName) {
    Query query = new Query(Criteria.where("userName").is(userName));
    UserEntity user = mongoTemplate.findOne(query, UserEntity.class);
    return user;
  }
}
