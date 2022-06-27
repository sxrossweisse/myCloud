package com.suitspoon.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author suxin
 * @package com.suitspoon.consul
 * @date 2022/6/27 23:45
 * @description 用一句话描述
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudConsulApplication {


    public static void main(String[] args) {
        SpringApplication.run(CloudConsulApplication.class, args);
    }
}
