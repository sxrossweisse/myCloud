package com.suitspoon.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author suxin
 * @package com.suitspoon.consumer.config
 * @date 2022/6/25 17:50
 * @description 用一句话描述
 */
@Configuration
public class MyRestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
