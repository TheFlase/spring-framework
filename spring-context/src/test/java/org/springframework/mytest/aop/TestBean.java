package org.springframework.mytest.aop;

/**
 * @Author wgc
 * @Description aop测试
 * @Date 2020/5/12
 **/
public class TestBean {
	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void test(){
		System.out.println("test");
	}

}
