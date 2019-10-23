package com.tyss.tysslibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class SpringController {
	@GetMapping("index")
	public String getIndex() {
		return "index";
	}
}
