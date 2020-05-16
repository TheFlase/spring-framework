package org.springframework.mytest.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author wgc
 * @Description 定义监听器
 * @Date 2020/5/12
 **/
public class TestListener implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof TestEvent){
			TestEvent testEvent = (TestEvent)event;
			testEvent.print();
		}
	}
}
