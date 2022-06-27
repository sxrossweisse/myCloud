package com.suitspoon.consul.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author suxin
 * @package com.suitspoon.consul.web
 * @date 2022/6/27 23:50
 * @description 用一句话描述
 */
@RestController
@RequestMapping("/cloud-provider")
public class MyConsulController {

    @GetMapping("/consul")
    public String myConsul(){
        return UUID.randomUUID().toString();
    }
}
