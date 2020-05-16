package org.springframework.mytest.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wgc
 * @Description spring事件测试
 * @Date 2020/5/12
 **/
public class MyEventTest {
	public static void main(String[] args) {
		ApplicationContext context  =  new ClassPathXmlApplicationContext("/mytest/BeanFactory.xml");
		TestEvent event = new TestEvent ("hello","hi,wgc! This is my test's msg");
		context.publishEvent(event);
	}
}
