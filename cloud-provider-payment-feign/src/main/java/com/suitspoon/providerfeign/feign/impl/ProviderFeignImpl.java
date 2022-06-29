package com.suitspoon.providerfeign.feign.impl;

import com.suitspoon.common.base.APIResult;
import com.suitspoon.providerfeign.feign.ProviderFeign;
import org.springframework.stereotype.Component;

/**
 * @author suxin
 * @package com.suitspoon.providerfeign.feign.impl
 * @date 2022/6/29 23:31
 * @description 用一句话描述
 */
@Component
public class ProviderFeignImpl implements ProviderFeign {

    @Override
    public APIResult<Long> insertTest() {
        return APIResult.failed(500, "服务不保熟了~");
    }
}
