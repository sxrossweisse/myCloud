package com.suitspoon.provider.web;


import com.suitspoon.common.base.APIResult;
import com.suitspoon.provider.entity.CloudOrder;
import com.suitspoon.provider.service.CloudOrderService;
import com.suitspoon.provider.utils.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author suxin
 * @since 2022-06-25
 */
@Slf4j
@RestController
@RequestMapping("/cloud-order")
public class CloudOrderController {

    private CloudOrderService cloudOrderService;

    private DiscoveryClient discoveryClient;

    @Autowired
    public void setCloudOrderService(CloudOrderService cloudOrderService) {
        this.cloudOrderService = cloudOrderService;
    }

    @Autowired
    public void setDiscoveryClient(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/insert")
    public APIResult<Long> insertTest() {
        int i = 10/0;
        CloudOrder cloudOrder = new CloudOrder();
        String no = StringUtil.uuid32();
        log.info("打印uuid: {}", no);
        cloudOrder.setOrderNo(no);
        cloudOrderService.save(cloudOrder);
        return APIResult.ok(cloudOrder.getId());
    }

    @GetMapping("/discovery")
    public APIResult<Void> listDiscovery() {
        List<String> services = discoveryClient.getServices();
        services.forEach(x -> log.info("打印服务名字: {}", x));

        List<ServiceInstance> instances = discoveryClient.getInstances("PROVIDER-SERVICE");
        instances.forEach(x -> log.info("打印服务HOST：{}， 服务端口：{}，服务实例: {}", x.getHost(), x.getPort(), x.getInstanceId()));
        return APIResult.ok();
    }
}

