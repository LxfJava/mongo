package com.study.mongo.business.dao;

import com.study.mongo.business.pojo.ServerManagement;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * @author Li
 * @create 2021/3/18   10:14 下午
 */
public interface ServerManagementRepository extends MongoRepository<ServerManagement,String>{

}
