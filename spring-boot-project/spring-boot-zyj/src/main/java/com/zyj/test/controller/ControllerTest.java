package com.zyj.test.controller;

import com.zyj.test.config.MyConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	@Autowired
	private MyConfigBean myConfigBean;

	@RequestMapping("/query")
	public String query(){
		System.out.println(this.myConfigBean.getPort());
		return "test";
	}
}
