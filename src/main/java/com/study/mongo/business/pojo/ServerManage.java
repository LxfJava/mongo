package com.study.mongo.business.pojo;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @author Li 服务其管理
 * @create 2021/3/18   10:04 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "serverManage")
public class ServerManage implements Serializable {
    private String id;
    private String serverName;
    private String serverType;
    private String ipAddress;
    private String zookeeperAddress;
    private String port;
    private String belongResource;
    private String isTclEncryptedOrColony;
    private List<ServerParam> serverParam;
    private List<ServerParam> serverTopic;
}
