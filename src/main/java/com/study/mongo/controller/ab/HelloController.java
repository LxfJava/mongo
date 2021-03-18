package com.study.mongo.controller.ab;

import com.study.mongo.business.domain.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: 16000
 * @create: 2021/3/18     14:04
 */
@Controller
public class HelloController {
//
//  @Autowired
//  MongoTemplate mongotemplate;

  @RequestMapping({"/index", "/"})
  public String index() {

//    Query query = new Query();
//    query.addCriteria(Criteria.where("name").is("酒仙"));
//    String name = mongotemplate.findOne(query, Param.class).getParamName();
//    System.out.println(name);

    return "index";
  }



}
