package org.springframework.mytest;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author wgc
 * @Description
 * @Date 2020/5/9
 **/
public class PropertyConfigurerDemo {

	public static void main(String[] args) {
		ConfigurableListableBeanFactory bf=new XmlBeanFactory(new ClassPathResource
				("/mytest/BeanFactory.xml"));

		BeanFactoryPostProcessor bfpp=(BeanFactoryPostProcessor)bf.getBean("bfpp");
		bfpp.postProcessBeanFactory(bf);
		System.out.println("开始打印了======>>"+bf.getBean("simpleBean"));
	}

}

