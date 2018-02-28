package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhaGuolong on 2018/2/28.
 */

@RestController
@RequestMapping("/springboot")
public class HelloWorldController {
    @Value("${author.realname}")
    private String realname;

    @Value("${author.nickname}")
    private String nickname;

    @Value("${author.intro}")
    private String intro;

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String sayWorld(String name) {
//        return "Hello " + name + " realName:" + realname + ", nickName:" + nickname;
        return "Hello " + name + " intro:" + intro;
    }
}
