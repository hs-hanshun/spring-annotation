package com.hassan.test;

import com.hassan.circular.UserService;
import com.hassan.config.MainCircularConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularTest {

    @Test
    public void test() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainCircularConfig.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService);
    }
}
