package br.com.ryan.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController 
{
	@GetMapping @ResponseBody
	public String hello()
	{
		return getHeader();
	}
	
	public String getHeader()
	{
		StringBuffer sb = new StringBuffer("");
		
		sb.append("<h1>Olá Mundo!</h1>");
		sb.append("<p>Aprenderemos Spring, para cima deles.</p>");
		sb.append("<hr /><footer>Sem Copy - 2021.</footer>");
		
		return sb.toString();
	}
}