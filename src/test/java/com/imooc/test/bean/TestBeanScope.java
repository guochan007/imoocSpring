package com.imooc.test.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.bean.BeanScope;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {
	
	public TestBeanScope() {
		super("classpath*:spring-beanscope.xml");
	}
	
	@Test
	public void testSay() {
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();
		
		BeanScope beanScope2 = super.getBean("beanScope");
		beanScope2.say();
//		这俩一样
	}
	
	@Test
	public void testSay2() {
		BeanScope beanScope  = super.getBean("beanScope");
		beanScope.say();
//		和上面不一样
	}
//	由于单元测试，每个test方法加载，都有其相应的生命周期，before、after，所以这里的
//	testSay 和testSay2，会分别创建两个spring context容器
}
