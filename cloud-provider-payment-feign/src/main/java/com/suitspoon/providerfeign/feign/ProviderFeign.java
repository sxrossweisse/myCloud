package com.suitspoon.providerfeign.feign;

import com.suitspoon.common.base.APIResult;
import com.suitspoon.providerfeign.feign.impl.ProviderFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author suxin
 * @package com.suitspoon.providerfeign.feign
 * @date 2022/6/29 12:22
 * @description 用一句话描述
 */
@Component
@FeignClient(value = "provider-service", fallback = ProviderFeignImpl.class)
public interface ProviderFeign {

    @GetMapping("/cloud-order/insert")
    APIResult<Long> insertTest();
}
