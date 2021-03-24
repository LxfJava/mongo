package com.study.mongo.business.service;

import com.study.mongo.business.pojo.ParsingProtocol;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * @author Li
 * @create 2021/3/24   9:08 下午
 */
public interface ParsingProtocolService {
    /**
     * 新增解析协议
     *
     * @param parsingProtocol
     * @return ParsingProtocol
     */
    ParsingProtocol addParsingProtocolService(ParsingProtocol parsingProtocol);

    /**
     * 修改解析协议
     * @param parsingProtocol
     * @return ParsingProtocol
     */
    ParsingProtocol updateParsingProtocolService(ParsingProtocol parsingProtocol);

    /**
     * 删除解析协议
     * @param id
     */
    void delParsingProtocolService(Long id);

    /**
     * 查询解析协议
     * @param parsingProtocol
     * @param pageRequest
     * @return ParsingProtocol
     */
    List<ParsingProtocol> getParsingProtocolService(ParsingProtocol parsingProtocol, PageRequest pageRequest);


}
