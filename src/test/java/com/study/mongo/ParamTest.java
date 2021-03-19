package com.study.mongo;

import com.study.mongo.business.pojo.Param;
import com.study.mongo.business.dao.ParamDao;
import com.study.mongo.business.service.ParamService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * @description:
 * @author: 16000
 * @create: 2021/3/19     10:44
 */
@SpringBootTest
class ParamTest {

  @Autowired
  private ParamService paramService;
  @Autowired
  private ParamDao dao;

  @Test
  void test01() {
    List<Param> all = paramService.getAll();
    System.out.println("========================================================");
//    System.out.println(all);
    all.forEach(item -> System.out.println(item));
    System.out.println("========================================================");
  }

  @Test
  void test02() {
    for (int i = 0; i < 5; i++) {
      Param param = new Param("0" + i, "Name" + i, "val" + i, "remarks" + i);
      paramService.saveParam(param);
    }
  }

  @Test
  void test03() {
    Param param = new Param("00", "Name", "val", "remarksTestAddOr");
    paramService.updateParam(param);
    Param all = paramService.getParamById("00");
    System.out.println("========================================================");
    System.out.println(all);
    System.out.println("========================================================");
  }

  @Test
  public void testPagingAndSortingRepository() {
    //pageNo从0开始
    int pageNo = 2;
    int size = 3;
    PageRequest of = PageRequest.of(1, 2);
    Page<Param> page = dao.findAll(of);
    System.out.println("当前页数:" + (page.getNumber() + 1));
    System.out.println("当前页的记录数:" + page.getNumberOfElements());
    System.out.println("每页记录数:" + page.getSize());
    System.out.println("总记录数:" + page.getTotalElements());
    System.out.println("总页数:" + page.getTotalPages());
    System.out.println("记录:" + page.getContent());
  }

}