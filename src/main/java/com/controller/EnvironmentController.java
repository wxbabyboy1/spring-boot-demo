package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhaGuolong on 2018/2/28.
 */
@RestController
@RequestMapping("/t")
public class EnvironmentController {
    @Value("${environment.password}")
    private String password;

    @RequestMapping(value = "/t", method = RequestMethod.GET)
    public String sayWorld() {
        return password;
    }
}
