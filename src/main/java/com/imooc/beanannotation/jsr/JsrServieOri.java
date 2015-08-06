package com.imooc.beanannotation.jsr;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class JsrServieOri {
	
//	方法1
	@Resource
	private JsrDAO jsrDAO;
	
//	方法2
//	@Resource
//	public void setJsrDAO(JsrDAO jsrDAO) {
//		this.jsrDAO = jsrDAO;
//	}

	public void save() {
		jsrDAO.save();
	}
	
}
