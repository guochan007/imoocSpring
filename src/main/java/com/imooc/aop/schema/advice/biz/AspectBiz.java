package com.imooc.aop.schema.advice.biz;

public class AspectBiz {
	
	public void biz() {
		System.out.println("AspectBiz biz.");
//		假装抛出一个异常
//		throw new RuntimeException();
	}
	
	/**
	 * 
	 * @param bizName 名称
	 * @param times 次数
	 */
	public void init(String bizName, int times) {
		System.out.println("AspectBiz init : " + bizName + "   " + times);
	}

}
