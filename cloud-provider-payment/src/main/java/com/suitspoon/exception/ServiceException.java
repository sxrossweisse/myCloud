package com.suitspoon.exception;

import com.suitspoon.enums.ErrorCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author suxin
 * @package com.suitspoon
 * @date 2022/6/25 0:14
 * @description 自定义业务异常
 */
@Getter
@Setter
@NoArgsConstructor
public class ServiceException extends RuntimeException {

    private Integer errorCode;

    private String errorMsg;

    private ErrorCodeEnum errorCodeEnum;


    public ServiceException(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public ServiceException(ErrorCodeEnum errorCodeEnum) {
        this.errorCodeEnum = errorCodeEnum;
    }

}
