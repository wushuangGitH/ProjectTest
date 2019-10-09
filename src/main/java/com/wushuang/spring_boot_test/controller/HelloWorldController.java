package com.wushuang.spring_boot_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/hello.action")
	public String getHello() {
		return "hello springboot!!!";
	}

}
