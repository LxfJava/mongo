package com.study.mongo;

import com.study.mongo.business.domain.Param;
import com.study.mongo.business.domain.ParamService;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class MongoApplicationTests {

  @Autowired
  private ParamService paramService;

  @Test
  void contextLoads() {
    List<Param> all = paramService.getAll();
    System.out.println("========================================================");
    System.out.println(all);
    System.out.println("========================================================");

  }

}
