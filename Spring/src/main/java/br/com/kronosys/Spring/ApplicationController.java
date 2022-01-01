package br.com.kronosys.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController 
{
	@GetMapping 
	public String hello() {
		return getHeader();
	}
	
	public String getHeader() {
		StringBuffer sb = new StringBuffer("");
		sb.append("<h1>Loading...</h1>");
		return sb.toString();
	}
}