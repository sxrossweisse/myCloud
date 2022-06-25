package com.suitspoon.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suxin
 * @package com.suitspoon.consumer
 * @date 2022/6/25 17:47
 * @description 用一句话描述
 */
@SpringBootApplication
@RestController
public class ConsumerPaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerPaymentApplication.class, args);
    }

    @GetMapping("/consumer/hello/{param}")
    public String consumerHello(@PathVariable("param") String param) {
        return "consumer hello : " + param;
    }

}
