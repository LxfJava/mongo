package com.study.mongo.business.domain;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @description:
 * @author: 16000
 * @create: 2021/3/12     14:12
 */
@Document(collection = "param")
public class Param {

  private String paramUuid;
  private String paramName;
  private String paramVal;
  private String paramRemarks;

  public Param() {
  }

  public Param(String paramUuid, String paramName, String paramVal, String paramRemarks) {
    this.paramUuid = paramUuid;
    this.paramName = paramName;
    this.paramVal = paramVal;
    this.paramRemarks = paramRemarks;
  }

  public String getParamUuid() {
    return paramUuid;
  }

  public Param setParamUuid(String paramUuid) {
    this.paramUuid = paramUuid;
    return this;
  }

  public String getParamName() {
    return paramName;
  }

  public Param setParamName(String paramName) {
    this.paramName = paramName;
    return this;
  }

  public String getParamVal() {
    return paramVal;
  }

  public Param setParamVal(String paramVal) {
    this.paramVal = paramVal;
    return this;
  }

  public String getParamRemarks() {
    return paramRemarks;
  }

  public Param setParamRemarks(String paramRemarks) {
    this.paramRemarks = paramRemarks;
    return this;
  }
}
