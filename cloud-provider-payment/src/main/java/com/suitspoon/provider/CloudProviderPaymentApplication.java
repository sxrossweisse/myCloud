package com.suitspoon.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suxin
 * @package com.suitspoon
 * @date 2022/6/24 0:54
 * @description 用一句话描述
 */
@EnableEurekaClient
@RestController
@SpringBootApplication
public class CloudProviderPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPaymentApplication.class, args);
    }

    @GetMapping("/hello/{param}")
    public String hello(@PathVariable("param") String param) {
        return "hello" + param;
    }

}
