package com.suitspoon.provider.utils;

import java.util.UUID;

/**
 * @author suxin
 * @package com.suitspoon.utils
 * @date 2022/6/25 0:45
 * @description 用一句话描述
 */
public class StringUtil {

    public static String uuid32(){
        return UUID.randomUUID().toString().replace("-", "");
    }


}
