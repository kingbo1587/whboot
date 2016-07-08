package com.woohood.whboot.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Value("${hello.rivulet}")
	private String msg;

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World222!" + msg;
	}

	@RequestMapping("hello")
	String first() {
		return "hello";
	}

}
