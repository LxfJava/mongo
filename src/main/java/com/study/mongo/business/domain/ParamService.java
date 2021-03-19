package com.study.mongo.business.domain;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;




import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: 16000
 * @create: 2021/3/19     10:32
 */
@Service
public class ParamService {

  @Autowired
  private ParamDao paramDao;

  /**
   * 保存记录
   */
  public void saveParam(Param param) {
    paramDao.save(param);
  }


  /**
   * 查询所有信息
   */
  public List<Param> getAll() {
    List<Param> all = paramDao.findAll();
    return all;
  }

  /**
   * 查询一条记录
   */
  public Param getParamById(String id) {
    Param param = paramDao.findById(id).get();
    return param;
  }

  /**
   * 修改一条记录
   */
  public void updateParam(Param param) {
    paramDao.save(param);
    //    PageRequest PageRequest = new PageRequest(pageNo, size,sort);
    PageRequest.of(1, 2);
  }


}
