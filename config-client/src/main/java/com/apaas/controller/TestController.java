package com.apaas.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shilei
 * @DateTime: 2022/6/22 16:29
 * @Description : TODO
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${foo}")
    String foo;
    @Value("${democonfigclient.message}")
    String message;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }

    @RequestMapping(value = "/message")
    public String message(){
        return message;
    }
}
