package com.imooc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {
	
	public void defautInit() {
		System.out.println("Bean defautInit.");
	}
	
	public void defaultDestroy() {
		System.out.println("Bean defaultDestroy.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean destroy.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean afterPropertiesSet.");
	}
	
	public void start() {
		System.out.println("Bean start.");
	}
	
	public void stop() {
		System.out.println("Bean stop.");
	}
	
//	Bean afterPropertiesSet.
//	Bean start.
//	
//	Bean destroy.
//	Bean stop.
	
//	三种配置都有的话，全局配置的不起作用，通过实现接口的方法先执行，在bean里定义的init-method="start" destroy-method="stop"最后执行
//	如果定义了全局的方法，但是在这里没有定义相应的方法，项目运行是不会报错；但是如果在xml中对单个bean定义了初始化方法，而这里没有定义相应的方法的话，会报错
	
}
