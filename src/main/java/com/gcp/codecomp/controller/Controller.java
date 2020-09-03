package com.gcp.codecomp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Controller {
	
	@GetMapping("/")
	public String get() {
		System.out.println("Hit at API / received");
		return "Hello World of GCP platform";
	}
	
	@GetMapping("/hit")
	public void getTotal() {
		System.out.println("Hit at the API /hit received");
	}

}
