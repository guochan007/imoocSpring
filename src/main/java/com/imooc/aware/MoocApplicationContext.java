package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class MoocApplicationContext implements ApplicationContextAware  {
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		System.out.println("MoocApplicationContext 容器为 : " + applicationContext.getBean("moocApplicationContext").hashCode());
	}
	
}
