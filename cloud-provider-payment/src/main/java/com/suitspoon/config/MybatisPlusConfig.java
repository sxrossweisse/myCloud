package com.suitspoon.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author suxin
 * @package com.suitspoon.config
 * @date 2022/6/25 0:08
 * @description 用一句话描述
 */
@MapperScan(basePackages = "com.suitspoon.dao")
@Configuration
public class MybatisPlusConfig {
}
