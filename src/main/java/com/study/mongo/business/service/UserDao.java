package com.study.mongo.business.service;

import com.study.mongo.business.domain.UserEntity;

public interface UserDao {
  void saveUser(UserEntity user);

  UserEntity findUserByName(String userName);
}
