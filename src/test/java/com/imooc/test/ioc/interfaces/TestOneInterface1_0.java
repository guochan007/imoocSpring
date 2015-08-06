package com.imooc.test.ioc.interfaces;

import com.imooc.ioc.interfaces.OneInterface;
import com.imooc.ioc.interfaces.OneInterfaceImpl;

public class TestOneInterface1_0 {

	public static void main(String[] args) {
		OneInterface oneInterface=new OneInterfaceImpl();
//		spring对该bean的创建在项目src/main/resources/spring-ioc.xml文件中
		oneInterface.say("hello");
	}

}
