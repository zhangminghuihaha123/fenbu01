package com.zmh.service_Main.config;

import com.zmh.service_Main.Interceptor.webInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebInterCeptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        List list=new ArrayList();

        /*拦截所有请求，判断token是否合法*/
        registry.addInterceptor(webInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns(list);
    }


    @Bean
    public webInterceptor webInterceptor(){
        return new webInterceptor();
    }

}
