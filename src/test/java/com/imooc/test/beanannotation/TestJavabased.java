package com.imooc.test.beanannotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.beanannotation.javabased.MyDriverManager;
import com.imooc.beanannotation.javabased.Store;
import com.imooc.beanannotation.javabased.StoreFanXing;
import com.imooc.test.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavabased extends UnitTestBase {
	
	public TestJavabased() {
		super("classpath*:spring-beanannotation.xml");
	}
	
	@Test
	public void test0() {
		Store store = super.getBean("getStringStore");//@bean的方法名，首字母小写
		System.out.println(store.getClass().getName());
	}
	
	@Test
	public void test1() {
		Store store = super.getBean("stringStore");
		System.out.println(store.getClass().getName());
	}
	
	@Test
	public void test2() {
		Store store = super.getBean("store");
		System.out.println(store.getClass().getName());
	}
	
	@Test
	public void testMyDriverManager() {
		MyDriverManager manager = super.getBean("myDriverManager");
		System.out.println(manager.getClass().getName());
	}
	
	@Test
	public void testScope() {
		Store store = super.getBean("store");
		System.out.println(store.hashCode());
		
		store = super.getBean("store");
		System.out.println(store.hashCode());
	}
	
	@Test
	public void testFanXing() {
		StoreFanXing store = super.getBean("fanXingTest");
	}
	
}
