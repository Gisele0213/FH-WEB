package com.jt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("index")
	public String goIndex(){
		return "index";//WEB-INF/views/index/jsp
	}
	
	@RequestMapping("index")
	public String goNext(){
		return "index";//WEB-INF/views/index/jsp
	}
}
