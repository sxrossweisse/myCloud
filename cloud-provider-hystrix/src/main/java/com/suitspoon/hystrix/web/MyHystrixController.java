package com.suitspoon.hystrix.web;

import com.suitspoon.hystrix.service.MyHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suxin
 * @package com.suitspoon.hystrix.web
 * @date 2022/6/29 23:07
 * @description 用一句话描述
 */
@RequestMapping("/hystrix")
@RestController
public class MyHystrixController {


    private MyHystrixService myHystrixService;

    @Autowired
    public void setMyHystrixService(MyHystrixService myHystrixService) {
        this.myHystrixService = myHystrixService;
    }

    @GetMapping("/demo")
    public String getText(){
        return myHystrixService.getMyName();
    }


}
