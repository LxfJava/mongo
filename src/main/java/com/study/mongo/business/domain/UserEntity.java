package com.study.mongo.business.domain;

import java.io.Serializable;

/**
 * @description:
 * @author: 16000
 * @create: 2021/3/18     17:53
 */

public class UserEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long id;
  private String userName;
  private String passWord;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassWord() {
    return passWord;
  }

  public void setPassWord(String passWord) {
    this.passWord = passWord;
  }

  @Override
  public String toString() {
    return "id: " + id + ",userName: " + userName + ",passWord: " + passWord;
  }
}
