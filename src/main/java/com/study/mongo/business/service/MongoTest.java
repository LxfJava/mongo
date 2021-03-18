package com.study.mongo.business.service;

import com.study.mongo.business.domain.UserEntity;
import java.util.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @description:
 * @author: 16000
 * @create: 2021/3/18     17:55
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoTest {
  @Autowired
  private UserDao userDao;

  @Autowired
  private UserRepository userRepository;

  @Test
  public void testSaveUser() {
    UserEntity user = new UserEntity();
    user.setId(88L);
    user.setUserName("XiaoMing");
    user.setPassWord("123456");
    userDao.saveUser(user);
  }

  @Test
  public void testFindUser01() {
    UserEntity user = userDao.findUserByName("XiaoMing");
    System.out.println(user);
  }

//  @Test
//  public void testFindUser02() {
//    UserEntity queryUser = new UserEntity();
//    queryUser.setUserName("XiaoMing");
//    Example<UserEntity> example = Example.of(queryUser);
//    Optional<UserEntity> optional = userRepository.findOne(example);
//    System.out.println(optional.get());
//  }
}
