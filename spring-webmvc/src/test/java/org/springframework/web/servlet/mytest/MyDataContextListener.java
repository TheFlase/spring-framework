package org.springframework.web.servlet.mytest;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author wgc
 * @Description
 * @Date 2020/5/20
 **/
public class MyDataContextListener implements ServletContextListener {
	private ServletContext context = null;

	public MyDataContextListener() {
	}

	//该方法在ServletContext启动之后被调用，并准备好处理客户端请求
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		this.context = sce.getServletContext();
		context.setAttribute("myDate","This is my wgc's data");
	}

	//这个方法在ServletContext将要关闭的时候调用
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		this.context = null;
	}
}
