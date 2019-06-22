package com.config.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class RestControllerTest {

	@Value("${welcome.message:Hello}")
	private String home;
	
	@RequestMapping("/")
	public String gethome() {
		return home;
	}
}
