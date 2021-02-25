package com.tyzc.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Deacription TODO
 * @Author 陆小军
 * @Date 2021/1/20 14:02
 * @Version 1.0
 **/
@Configuration
public class FallBackConfig {
    @Bean
    public Logger.Level feignLogger() {
        return Logger.Level.FULL;
    }
}
