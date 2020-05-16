package org.springframework.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @Author wgc
 * @Description国际化测试
 * @Date 2020/5/12
 **/
public class MyMessageTest {
	public static void main(String[] args) {
		String[] configs = {"/mytest/BeanFactory.xml"};
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
		//①直接通过容器访问国际化信息
		Object[] params = {"John", new GregorianCalendar().getTime()};
		String str2 = ctx.getMessage("test",params,Locale.CHINA);
		String str1 = ctx.getMessage("test",params, Locale.US);
		System.out.println(str1);
		System.out.println(str2);

	}
}
