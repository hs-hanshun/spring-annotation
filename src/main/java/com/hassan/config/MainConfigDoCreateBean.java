package com.hassan.config;

import com.hassan.bean.Car;
import com.hassan.bean.ColorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfigDoCreateBean {


    //@Scope("prototype")
    @Bean(initMethod="init",destroyMethod="detory")
    public Car car(){
        return new Car();
    }

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
