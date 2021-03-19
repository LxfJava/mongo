package com.study.mongo;

import com.study.mongo.business.dao.ServerManagementRepository;
import com.study.mongo.business.pojo.ServerParam;
import com.study.mongo.business.pojo.ServerManagement;
import com.study.mongo.business.pojo.ServerTopic;
import com.study.mongo.business.service.ServerManagementService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.assertj.core.util.Maps;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

/**
 * @author Li
 * @create 2021/3/18   11:03 下午
 */
@SpringBootTest
public class ServerManagementServiceTest {

  @Autowired
  private ServerManagementService db;

  @Autowired
  private ServerManagementRepository dao;

  @Autowired
  protected MongoTemplate mongoTemplate;

  @Test
  void test1() {
    ServerManagement ogj1 = new ServerManagement("1", "服务器001", "windows", "127.0.0.1",
        "192.168.0.1", "80", "MG", "1", null, null);
    db.saveServer(ogj1);

  }

  @Test
  void test2() {
    ServerManagement ogj1 = new ServerManagement("1", "服务器001", "windows", "127.0.0.1", "0.0.0.0", "00", "MG", "10000",
        null, null);
    db.updateServer(ogj1);
  }

  @Test
  void test3() {
    ServerManagement ogj1 = new ServerManagement("1", "服务器001", "windows", "127.0.0.1", "0.0.0.0", "00", "MG", "10000",
        null, null);
    db.updateServer(ogj1);
  }

  /**
   * 新增嵌套数据
   */
  @Test
  void test4() {
    ServerParam param = new ServerParam("00", "参数一", "参数数值1", "参数注释01");
    ServerTopic topic = new ServerTopic("99", "topic名称", "topic类型", "topic列表注释");
    Update update = new Update();
    update.push("param", param);
    update.push("topic", topic);
    Query query = new Query(Criteria.where("_id").is("2"));
    mongoTemplate.updateFirst(query, update, ServerManagement.class);
  }

  /**
   * 修改嵌套数据
   */
  @Test
  void test5() {
    Update update = new Update();
    update.set("param.$[].paramName", "AAAAAAAAAAAAA");
    Query query = new Query(Criteria.where("_id").is("1").and("param._id").is("00"));
    mongoTemplate.updateFirst(query, update, ServerManagement.class);
  }

  /**
   * 删除嵌套数据
   */
  @Test
  void test6() {
    Query query = Query.query(Criteria.where("_id").is("1"));
    Update update = new Update();
    HashMap<Object, Object> map = new HashMap<>();
//        map.put("_id","2");
    update.pull("param", map);
//        update.unset("param.$");
    mongoTemplate.updateMulti(query, update, ServerManagement.class);
  }


  /**
   * 新增
   */
  @Test
  void devTest01() {
    for (int i = 0; i < 5; i++) {
      List<ServerTopic> topicList = new ArrayList<>();
      List<ServerParam> paramList = new ArrayList<>();
      for (int j = 0; j < 3; j++) {
        String s = i + "" + j;
        topicList.add(new ServerTopic("id" + s, "name" + s, "type" + s, "re" + s));
        paramList.add(new ServerParam("id" + s, "name" + s, "pv" + s, "re" + s));
      }
      ServerManagement ogj1 = new ServerManagement("id" + i, "name" + i, "type" + i,
          "address" + i, "zookeeper" + i, "port" + i, "br" + i,
          "tc" + i, paramList, topicList);
      db.addDevServer(ogj1);
    }
  }


  /**
   * 删除
   */
  @Test
  void devTest02() {
    //删除嵌套数据
//    Query query = Query.query(Criteria.where("_id").is("id0"));
//    Update update = new Update();
//    Map<String, Object> map = new HashMap<>();
//    map.put("_id", "id00");
//    update.pull("serverParam", map);
//    mongoTemplate.updateMulti(query, update, ServerManagement.class);

    //删除主数据
//      db.delServerById("id0");
  }

  /**
   * 修改
   */

  @Test
  void devTest03() {
    //覆盖性修改
//      ServerManagement obj1 = new ServerManagement();
//      obj1.setId("id1");
//      obj1.setIpAddress("服务器地址");
//      obj1.setServerName("服务器名称");
//      db.updateServer(obj1);

//      //局部性修改
//      Query query = Query.query(Criteria.where("_id").is("id1"));
//      Update update = new Update();
//      update.set("serverName", "飞洒的减肥哈市的开奖号");
//      mongoTemplate.updateFirst(query, update, ServerManagement.class);

    //局部性修改嵌套数据
      Update update = new Update();
      update.set("serverParam.$[].paramName", "AAAAAAAAAAAAA");
      Query query = new Query(Criteria.where("_id").is("id2").and("serverParam._id").is("id20"));
      mongoTemplate.updateFirst(query, update, ServerManagement.class);
  }

}
