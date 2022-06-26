package com.suitspoon.eurekaserverthird;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author suxin
 * @package com.suitspoon.eurekaserverthird
 * @date 2022/6/26 20:12
 * @description 用一句话描述
 */
@EnableEurekaServer
@SpringBootApplication
public class ThirdEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThirdEurekaServerApplication.class, args);
    }
}
