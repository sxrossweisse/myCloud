package com.suitspoon.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author suxin
 * @package com.suitspoon.hystrix
 * @date 2022/6/29 22:27
 * @description 用一句话描述
 */
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class ProviderHystrixApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrixApplication.class, args);
    }

}
