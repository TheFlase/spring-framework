package org.springframework.mytest;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wgc
 * @Description
 * @Date 2020/5/8
 **/
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(true);
		super.customizeBeanFactory(beanFactory);
	}
}
