package com.study.mongo.business.dao;

import com.study.mongo.business.pojo.ParsingProtocol;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Li
 * @create 2021/3/24   9:16 下午
 */
public interface ParsingProtocolRepository extends MongoRepository<ParsingProtocol, Long> {
}
