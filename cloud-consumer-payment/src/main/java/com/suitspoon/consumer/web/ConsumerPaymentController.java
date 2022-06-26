package com.suitspoon.consumer.web;

import com.suitspoon.common.base.APIResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author suxin
 * @package com.suitspoon.consumer.web
 * @date 2022/6/25 17:50
 * @description 用一句话描述
 */
@Slf4j
@RestController
@RequestMapping("/consumer")
public class ConsumerPaymentController {

    private static final String PROVIDER_REQUEST = "http://PROVIDER-SERVICE/cloud-order/insert";

    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/createOrder")
    public APIResult createOrder() {
        return restTemplate.getForObject(PROVIDER_REQUEST, APIResult.class);
    }
}
