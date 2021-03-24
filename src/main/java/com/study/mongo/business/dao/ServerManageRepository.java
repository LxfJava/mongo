package com.study.mongo.business.dao;

import com.study.mongo.business.pojo.ServerManage;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * @author Li
 * @create 2021/3/18   10:14 下午
 */
public interface ServerManageRepository extends MongoRepository<ServerManage,String>{

}
