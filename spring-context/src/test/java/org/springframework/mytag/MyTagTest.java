package org.springframework.mytag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wgc
 * @Description
 * @Date 4/26/2020
 **/
public class MyTagTest {
    public static void main(String[] args) {
//        String xml = "classpath:test.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
//        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { xml });
        System.out.println(context.getBean("testCustom"));
    }
}
