package com.study.mongo.business.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hamcrest.core.Is;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @description:
 * @author: 16000
 * @create: 2021/3/19     15:51
 */
@Data
@Document(collection = "kpiDefinition")
@AllArgsConstructor
@NoArgsConstructor
public class KpiDefinition implements Serializable {
  private String name;
  private String code;
  private String label;
  private String major;
  private String dataType;
  private String length;
  private String accuracy;
  private String dataUnit;
  private String displayName;
  private String isCompress;
  private String deadZoneVal;
  private String deadZoneMaxTimes;

}
