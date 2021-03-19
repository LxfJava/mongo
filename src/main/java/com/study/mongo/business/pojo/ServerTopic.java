package com.study.mongo.business.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @description:服务管理topic列表
 * @author: 16000
 * @create: 2021/3/12     14:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServerTopic implements Serializable {

  private String id;
  private String topicName;
  private String topicType;
  private String topicRemarks;

}
