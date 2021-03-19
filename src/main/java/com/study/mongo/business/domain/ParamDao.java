package com.study.mongo.business.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @description:
 * @author: 16000
 * @create: 2021/3/19     10:32
 */

public interface ParamDao extends MongoRepository<Param, String> {

}
