package com.zyj.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class JspController {

	@GetMapping("/jsp")
	public String jsp(Map<String, Object> model) {
		return "result";
	}

	@RequestMapping("/jspError")
	public String JspError(Map<String, Object> model) {
		return "Error";
	}
}
