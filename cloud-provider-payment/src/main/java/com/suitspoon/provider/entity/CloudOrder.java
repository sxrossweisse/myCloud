package com.suitspoon.provider.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author suxin
 * @since 2022-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "CloudOrder对象", description = "订单表")
public class CloudOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ID_WORKER)
    private Long id;

    @ApiModelProperty(value = "订单流水号")
    private String orderNo;


}
