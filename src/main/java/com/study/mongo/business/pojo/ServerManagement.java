package com.study.mongo.business.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author Li
 * @create 2021/3/18   10:04 下午
 */
@Data
@Document(collection = "serverManagement")
@AllArgsConstructor
@NoArgsConstructor
public class ServerManagement implements Serializable {
    private String id;
    private String serverName;
    private String serverType;
    private String ipAddress;
    private String zookeeperAddress;
    private String port;
    private String belongResource;
    private String isTclEncryptedOrColony;
}
