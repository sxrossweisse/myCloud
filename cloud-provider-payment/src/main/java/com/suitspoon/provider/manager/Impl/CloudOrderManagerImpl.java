package com.suitspoon.provider.manager.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.suitspoon.provider.entity.CloudOrder;
import com.suitspoon.provider.dao.CloudOrderDAO;
import com.suitspoon.provider.manager.CloudOrderManager;
import org.springframework.stereotype.Component;

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
