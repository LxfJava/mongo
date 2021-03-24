package com.study.mongo.business.service.impl;

import com.study.mongo.business.dao.ParsingProtocolRepository;
import com.study.mongo.business.pojo.ParsingProtocol;
import com.study.mongo.business.service.ParsingProtocolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author Li
 * @create 2021/3/24   9:18 下午
 */
public class ParsingProtocolServiceImpl implements ParsingProtocolService {

    @Autowired
    private ParsingProtocolRepository repository;
    private ParsingProtocol parsingProtocol;


    @Override
    public ParsingProtocol addParsingProtocolService(ParsingProtocol parsingProtocol) {
        parsingProtocol.getParsingParam();


        return repository.save(parsingProtocol);
    }

    @Override
    public ParsingProtocol updateParsingProtocolService(ParsingProtocol parsingProtocol) {
        return repository.save(parsingProtocol);
    }

    @Override
    public void delParsingProtocolService(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ParsingProtocol> getParsingProtocolService(ParsingProtocol parsingProtocol, PageRequest pageRequest) {

        return null;
    }

    public static void main(String[] args) {
        ParsingProtocol parsingProtocol = new ParsingProtocol(1, "2", "3", "4", "5", null, null);
        eachProperties(parsingProtocol);

    }


    public static void eachProperties(Object model) {
        Field[] field = model.getClass().getDeclaredFields();
        try {
            for (int j = 0; j < field.length; j++) {
                String name = field[j].getName();
                System.out.println("attribute name:" + name);
                name = name.substring(0, 1).toUpperCase() + name.substring(1);
                Method method = model.getClass().getMethod("get" + name);
                System.out.println();
                System.out.println(method.invoke(model));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
