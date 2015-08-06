package com.imooc.test.ioc.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



import com.imooc.ioc.interfaces.OneInterface;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface1_1 extends UnitTestBase {

//	实现父类构造函数，传入xml位置
	public TestOneInterface1_1() {
		super("classpath*:spring-ioc.xml");//这种写法super（），之前没见过
	}
	
	@Test
	public void testSay() {
		OneInterface oneInterface = super.getBean("oneInterface");
		oneInterface.say("This is a test.");
	}

}
