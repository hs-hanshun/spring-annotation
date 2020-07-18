package com.hassan.test;

import com.hassan.bean.Car;
import com.hassan.config.MainConfigDoCreateBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestCreateBean {

    @Test
    public void test() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigDoCreateBean.class);
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }
}
