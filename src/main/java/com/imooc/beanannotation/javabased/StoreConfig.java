package com.imooc.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {
	
//	@Bean
//	public Store getStringStore(){
//		return new StringStore();
//	}
	
//	@Bean
//	public Store stringStore() {
//		return new StringStore();
//	}
	
//	@Bean(name="store")
//	public Store stringStore() {
//		return new StringStore();
//	}
	
//	@Bean(name = "store", initMethod="init", destroyMethod="destroy")
//	public Store stringStore() {
//		return new StringStore();
//	}
	
	
/*	@Value("${url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	@Bean
	public MyDriverManager myDriverManager() {
		return new MyDriverManager(url, username, password);
	}*/
	
	
/*	@Bean(name="store")
	@Scope(value="prototype")
//	还可以指定代理方式
//	@Scope(value="prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
	public Store stringStore() {
		return new StringStore();
	}*/
	
	
//	基于泛型的自动装配
	@Autowired
	private StoreFanXing<String> s1;
	
	@Autowired
	private StoreFanXing<Integer> s2;
	
	@Bean
	public StringStoreFanXing stringStoreFanXing() {
		return new StringStoreFanXing();
	}
	
	@Bean
	public IntegerStoreFanXing integerStoreFanXing() {
		return new IntegerStoreFanXing();
	}
	
	@Bean(name = "fanXingTest")
	public StoreFanXing fanXingTest() {
		System.out.println("s1 : " + s1.getClass().getName());
		System.out.println("s2 : " + s2.getClass().getName());
		return new StringStoreFanXing();
	}

}
