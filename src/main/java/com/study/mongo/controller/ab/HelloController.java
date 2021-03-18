package com.study.mongo.controller.ab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: 16000
 * @create: 2021/3/18     14:04
 */
@Controller
public class HelloController {

  @RequestMapping({"/index", "/"})
  public String index() {
    return "index";
  }



}
