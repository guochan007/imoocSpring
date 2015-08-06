package com.imooc.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;


public class MoocResource implements ApplicationContextAware  {
	
	private ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void resource() throws IOException {
//		1
//		Resource resource = applicationContext.getResource("classpath:config.txt");
//		2
//		Resource resource = applicationContext.getResource("file:E:\\workSpace\\imoocSpring\\src\\main\\resources\\config.txt");
//		3
//		Resource resource = applicationContext.getResource("url:http://111.111.113.23:8080/Jxkh");
//		4 这种方式，什么都不写，依赖与application的实现方式，本junit测试父类，是采用classpath的方式获取的application容器，所以此处实际上和方式1一样
		Resource resource = applicationContext.getResource("config.txt");
		
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}

}
