package com.suitspoon.manager.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suitspoon.dao.CloudOrderDAO;
import com.suitspoon.entity.CloudOrder;
import com.suitspoon.manager.CloudOrderManager;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author suxin
 * @since 2022-06-25
 */
@Component
public class CloudOrderManagerImpl extends ServiceImpl<CloudOrderDAO, CloudOrder> implements CloudOrderManager {

}
