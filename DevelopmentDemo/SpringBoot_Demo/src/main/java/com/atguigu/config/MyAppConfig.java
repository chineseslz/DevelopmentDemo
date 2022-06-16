package com.atguigu.config;

import com.atguigu.web.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    //添加拦截器对象，注入到容器中
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor interceptor = new LoginInterceptor();

        //指定拦截的请求地址
        String path[] = {"/user/**"};
        //指定不拦截的地址
        String excluedePath [] = {"/user/login"};
        registry.addInterceptor(interceptor).
                 addPathPatterns(path).
                 excludePathPatterns(excluedePath);
    }
}
