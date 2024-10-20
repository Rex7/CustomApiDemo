package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@PostMapping("/showmessage")
	public String showMesage() {
		return "Welcome User regis";
	}
	
	@PostMapping("/showmessage")
	public String docker() {
		return "Welcome docker build successfule regis";
	}

}
