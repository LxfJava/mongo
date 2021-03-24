package com.study.mongo.business.pojo;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @description:解析协议
 * @author: 16000
 * @create: 2021/3/19     15:08
 */
@Data
@Document(collection = "parsingProtocol")
@AllArgsConstructor
@NoArgsConstructor
public class ParsingProtocol implements Serializable {

  @Id
  private long id;

  private String protocolCode;

  private String protocolName;

  private String protocolEdition;

  private String protocolRemarks;

  private List<ParsingParam> connectParam;

  private List<ParsingParam> parsingParam;
}
