package com.suitspoon.web;


import com.suitspoon.common.APIResult;
import com.suitspoon.entity.CloudOrder;
import com.suitspoon.manager.CloudOrderManager;
import com.suitspoon.service.CloudOrderService;
import com.suitspoon.utils.StringUtil;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    public void setCloudOrderService(CloudOrderService cloudOrderService){
        this.cloudOrderService = cloudOrderService;
    }

    @GetMapping("/insert")
    public APIResult<Long> insertTest(){
        CloudOrder cloudOrder = new CloudOrder();
        String no = StringUtil.uuid32();
        log.info("打印uuid: {}", no);
        cloudOrder.setOrderNo(no);
        cloudOrderService.save(cloudOrder);
        return APIResult.ok(cloudOrder.getId());
    }
}

