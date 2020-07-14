package com.hassan.test;

import com.hassan.aop.MathCalculator;
import com.hassan.config.MainConfigOfAOP;
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
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
		String[] definitionNames = applicationContext.getBeanDefinitionNames();
		for (String name : definitionNames) {
			System.out.println(name);
		}
		MathCalculator calculator = (MathCalculator) applicationContext.getBean("calculator");
		calculator.div(10, 2);
	}
}
