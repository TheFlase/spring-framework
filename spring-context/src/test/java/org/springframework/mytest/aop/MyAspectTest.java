package org.springframework.mytest.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wgc
 * @Description 测试自定义切面
 * @Date 2020/5/13
 **/
public class MyAspectTest {
	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("/mytest/aoptest.xml");
		TestBean testBean = (TestBean)cxt.getBean("Hi,man!Perfect test!");
		testBean.test();
	}
}
