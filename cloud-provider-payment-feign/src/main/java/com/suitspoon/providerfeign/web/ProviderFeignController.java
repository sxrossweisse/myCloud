package com.suitspoon.providerfeign.web;

import com.suitspoon.common.base.APIResult;
import com.suitspoon.providerfeign.feign.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suxin
 * @package com.suitspoon.providerfeign.web
 * @date 2022/6/29 12:24
 * @description 用一句话描述
 */
@RequestMapping("/provider")
@RestController
public class ProviderFeignController {


    private ProviderFeign providerFeign;

    @Autowired
    public void setProviderFeign(ProviderFeign providerFeign) {
        this.providerFeign = providerFeign;
    }

    @GetMapping("/feignDemo")
    public APIResult<Long> getByFeign(){
        return providerFeign.insertTest();
    }

}
