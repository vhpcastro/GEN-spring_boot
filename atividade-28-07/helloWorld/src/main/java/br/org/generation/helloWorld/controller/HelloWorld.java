package br.org.generation.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello") // define o endereço para acessar o projeto

public class HelloWorld {

	@GetMapping // usado para pegar a informação abaixo do endereço

	public String hello() {
		return "Hello World and... Hello Spring!"; // return é usado para retornar a informação na tela do usuário
	}

}
