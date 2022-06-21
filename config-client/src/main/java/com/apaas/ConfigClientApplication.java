package com.apaas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: shilei
 * @DateTime: 2022/6/21 17:41
 * @Description : TODO
 */
@SpringBootApplication
@RestController
//@EnableDiscoveryClient
@EnableEurekaClient
public class ConfigClientApplication {

    //http://t.zoukankan.com/baby123-p-11949744.html bootstrap.properties application.yml区别
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

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
