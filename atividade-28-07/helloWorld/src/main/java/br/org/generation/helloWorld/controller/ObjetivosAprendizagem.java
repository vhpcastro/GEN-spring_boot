package br.org.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")

public class ObjetivosAprendizagem {
	
	@GetMapping
	
	public String obj () {
		return "Spring Boot e manipulação de tabelas no MySQL.";
	}

}
