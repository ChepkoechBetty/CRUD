package com.springboot.backend.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	public String Hello( String name) {
		return String.format("Hello,%s",name);
	}

}
