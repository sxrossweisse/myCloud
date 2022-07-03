package com.suitspoon.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author suxin
 * @package com.suitspoon.gateway
 * @date 2022/7/3 21:58
 * @description 用一句话描述
 */
@EnableEurekaClient
@SpringBootApplication
public class CloudGateWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGateWayApplication.class, args);
    }
}
