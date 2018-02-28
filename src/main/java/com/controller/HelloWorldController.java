package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhaGuolong on 2018/2/28.
 */

@RestController
@RequestMapping("/springboot")
public class HelloWorldController {
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String sayWorld(String name) {
        return "Hello " + name;
    }
}
