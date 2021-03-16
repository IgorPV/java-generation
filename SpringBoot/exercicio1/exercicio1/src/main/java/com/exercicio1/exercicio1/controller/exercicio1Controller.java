package com.exercicio1.exercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio1")
public class exercicio1Controller {

	@GetMapping
	public String skills() {
		return "Tive que ter persistência e mentalidade de crescimento para aprender os comandos de Spring!";
	}
	
	
}

