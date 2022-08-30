package cn.itcast.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class DefaultFeignConfinguration {

    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.BASIC;
    }

}
