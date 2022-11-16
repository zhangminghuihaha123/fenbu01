package com.zmh.service_Main.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Configuration
@Component
public class FeignConfig {

    @Bean
    public Retryer retryer(){
        return new Retryer.Default(50, TimeUnit.SECONDS.toMillis(2),3);
    }
}
