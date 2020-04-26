package org.springframework.mytag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @Author wgc
 * @Description //TODO
 * @Date 4/26/2020
 **/
public class TestNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("custom", new TestCustomBeanDefinitionParser());
    }

}