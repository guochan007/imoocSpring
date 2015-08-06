package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class MoocApplicationContext1 implements ApplicationContextAware  {
	
	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
//		将容器传进来，可以使用
		this.applicationContext=applicationContext;
		System.out.println("MoocApplicationContext : " + applicationContext.getBean("moocApplicationContext").hashCode());
	}
	
}
