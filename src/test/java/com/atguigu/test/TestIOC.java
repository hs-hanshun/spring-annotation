package com.atguigu.test;

import com.atguigu.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/6/26 16:09
 * Description:
 */
public class TestIOC {
	@SuppressWarnings("resource")
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : definitionNames) {
			System.out.println(name);
		}
	}
}
