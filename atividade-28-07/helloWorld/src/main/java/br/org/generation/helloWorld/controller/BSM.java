package br.org.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")

public class BSM {
	
	@GetMapping
	
	public String bsm() {
		return "Mentalidade: Orientação ao futuro, Responsabilidade pessoal, Mentalidade de Crescimento, Persistência."
				+ " || Habilidades: Trabalho em Equipe, Orientação aos Detalhes, Proatividade, Comunicação.";
	}

}
