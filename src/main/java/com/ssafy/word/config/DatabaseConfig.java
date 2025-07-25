package com.ssafy.word.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author hissam
 */
@Configuration
@MapperScan(
		basePackages = "com.ssafy.word.model.mapper"
)
public class DatabaseConfig {}