package com.offcn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public Map<String,Object> showview(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("我爱JAVA ","Java正寻找时机爱我");
        return map;
    }
}
