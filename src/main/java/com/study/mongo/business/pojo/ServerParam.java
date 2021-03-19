package com.study.mongo.business.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @description:服务器管理参数配置
 * @author: 16000
 * @create: 2021/3/12     14:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServerParam {
  private String id;
  private String paramName;
  private String paramVal;
  private String paramRemarks;
}
