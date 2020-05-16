package org.springframework.mytest.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author wgc
 * @Description 定义监听事件
 * @Date 2020/5/12
 **/
public class TestEvent extends ApplicationEvent {
	private static final long serialVersionUID = 7099057708183571937L;
	public String msg;
	public TestEvent(Object source) {
		super(source);
	}

	public TestEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}
	public void print(){
		System.out.println(msg);
	}
}
