package com.suitspoon.common.base;

import com.alibaba.fastjson.annotation.JSONField;
import com.suitspoon.common.enums.ErrorCodeEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author suxin
 * @package com.suitspoon.common
 * @date 2022/6/25 0:09
 * @description 通用响应类
 */
@Getter
@Setter
@NoArgsConstructor
public class APIResult<T> {

    @JSONField(ordinal = 1)
    private Integer code = 200;

    @JSONField(ordinal = 2)
    private Boolean success = true;

    @JSONField(ordinal = 3)
    private String message;

    @JSONField(ordinal = 4)
    private T Data;

    @JSONField(ordinal = 5)
    private Long currentTime = System.currentTimeMillis();

    private APIResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static <T> APIResult<T> ok() {
        return new APIResult<>();
    }

    public static <T> APIResult<T> ok(T data) {
        APIResult<T> result = new APIResult<>();
        result.setData(data);
        return result;
    }

    public static <T> APIResult<T> failed(Integer code, String message) {
        APIResult<T> result = new APIResult<>();
        result.setCode(code);
        result.setMessage(message);
        result.setSuccess(false);
        return result;
    }

    public static <T> APIResult<T> failed(ErrorCodeEnum errorCodeEnum) {
        return new APIResult<>(errorCodeEnum.getErrorCode(), errorCodeEnum.getErrorMsg());
    }
}
