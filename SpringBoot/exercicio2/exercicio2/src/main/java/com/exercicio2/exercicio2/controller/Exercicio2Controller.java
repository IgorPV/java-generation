package com.exercicio2.exercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio2")
public class Exercicio2Controller {

	@GetMapping
	public String obj() {
		return "Meus objetivos da semana são: aprender Spring e tentar começar a aplicar no projeto";
		
	}
	
}
