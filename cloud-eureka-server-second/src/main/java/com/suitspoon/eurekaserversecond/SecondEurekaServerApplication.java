package com.suitspoon.eurekaserversecond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author suxin
 * @package com.suitspoon.eurekaserversecond
 * @date 2022/6/26 20:11
 * @description 用一句话描述
 */
@EnableEurekaServer
@SpringBootApplication
public class SecondEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondEurekaServerApplication.class, args);
    }
}
