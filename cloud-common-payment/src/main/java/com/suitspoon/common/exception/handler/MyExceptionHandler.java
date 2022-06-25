package com.suitspoon.common.exception.handler;

import com.suitspoon.common.base.APIResult;
import com.suitspoon.common.enums.ErrorCodeEnum;
import com.suitspoon.common.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author suxin
 * @package com.suitspoon.exception.handler
 * @date 2022/6/25 0:17
 * @description 异常处理类
 */
@Slf4j
@Component
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    public APIResult globalException(Exception exception) {
        log.error("系统异常==> ", exception);
        return APIResult.failed(ErrorCodeEnum.SYSTEM_ERROR);
    }

    @ExceptionHandler(ServiceException.class)
    public APIResult serviceException(ServiceException serviceException) {
        log.error("业务异常==> 状态码：{}，异常信息：", serviceException.getErrorCode(), serviceException);
        return APIResult.failed(serviceException.getErrorCode(), serviceException.getMessage());
    }

}
