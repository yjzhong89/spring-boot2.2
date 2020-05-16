package com.zyj.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {
	@RequestMapping("/query")
	public String query(){
		return "test";
	}
}
