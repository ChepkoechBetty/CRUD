package com.springboot.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeIntController {
	@GetMapping("/hello")
	public String hello(@RequestParam(name="name",defaultValue="World") String name) {
		return String.format("Hello,%s",name);
		
	}
	@GetMapping("/sayhello")
	public String sayHello() {
		String uri="http://localhost:8095/hello";
		RestTemplate restTemplate=new RestTemplate();
		String result=restTemplate.getForObject(uri, String.class);
		return result;
		
	}
}
