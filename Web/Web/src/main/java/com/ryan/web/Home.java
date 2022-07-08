package com.ryan.web;

import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home implements Serializable {
	
	@GetMapping
	@ResponseBody
	public String getHome() {
		return "Hello WRLD!";
	}
}