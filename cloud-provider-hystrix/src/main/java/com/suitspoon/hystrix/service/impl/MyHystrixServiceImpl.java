package com.suitspoon.hystrix.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.suitspoon.hystrix.service.MyHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author suxin
 * @package com.suitspoon.hystrix.service.impl
 * @date 2022/6/29 22:50
 * @description 用一句话描述
 */
@Slf4j
@Service
@DefaultProperties(defaultFallback = "globalError")
public class MyHystrixServiceImpl implements MyHystrixService {

    @HystrixCommand
    @Override
    public String getMyName() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            log.error("你这睡觉有问题啊");
        }
        return "在下法外狂徒！张三！";
    }

    public String globalError(){
        return "这回真的是全局异常了啊啊";
    }

}
