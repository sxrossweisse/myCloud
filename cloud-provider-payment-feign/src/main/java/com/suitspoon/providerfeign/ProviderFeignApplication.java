package com.suitspoon.providerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author suxin
 * @package com.suitspoon.providerfeign
 * @date 2022/6/29 12:21
 * @description 用一句话描述
 */
@SpringBootApplication
@EnableFeignClients
public class ProviderFeignApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProviderFeignApplication.class, args);
    }

}
