package com.imooc.autowiring;

public class AutoWiringService {
	
	private AutoWiringDAO autoWiringDAO;
	
//	2 构造方法
	public AutoWiringService(AutoWiringDAO autoWiringDAO) {
		System.out.println("AutoWiringService 构造方法执行了");
		this.autoWiringDAO = autoWiringDAO;
	}

//	byName 和  byType是调用该方法，来装载autoWiringDAO  bean的
//	1 set方法
//	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
//		System.out.println("setAutoWiringDAO set方法执行了");
//		this.autoWiringDAO = autoWiringDAO;
//	}
	
	public void say(String word) {
		this.autoWiringDAO.say(word);
	}

}
