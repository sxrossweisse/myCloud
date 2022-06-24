package com.suitspoon.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author suxin
 * @package com.suitspoon.enums
 * @date 2022/6/25 0:22
 * @description 用一句话描述
 */
@Getter
public enum ErrorCodeEnum {

    SYSTEM_ERROR(500, "系统异常");

    private Integer errorCode;

    private String errorMsg;

    ErrorCodeEnum(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


}
