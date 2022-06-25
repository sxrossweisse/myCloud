package com.suitspoon.provider.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author suxin
 * @package com.suitspoon.config
 * @date 2022/6/25 0:08
 * @description 用一句话描述
 */
@MapperScan(basePackages = "com.suitspoon.provider.dao")
@Configuration
public class MybatisPlusConfig {

}
