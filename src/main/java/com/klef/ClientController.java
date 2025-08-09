package com.klef;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController 
{
	@GetMapping("/")
	public String home() {
		return "CI/CD cloud devops";
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "Jenkins Demo";
	}
	
	@GetMapping("/test")
	public String test() {
		return "testing for a purpose";
	}
	
	

}
