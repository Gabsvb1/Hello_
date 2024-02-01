package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello world!!";
	}
	
	@GetMapping("/listaBsm")
	public String listaBSM() {
		return "Responsabilidade Pessoal, "
				+ "\n Mentalidade de Crescimento, "
				+ "\n Orientação ao futuro, "
				+ "\n Persistência, "
				+ "\n Comunicação, "
				+ "\n Atenção aos detalhes, "
				+ "\n Atenção aos detalhes, "
				+ "\n Trabalho em equipe, "
				+ "\n Persistência, ";
	}
	
	@GetMapping("/listaObjetivos")
	public String listaObjetivos() {
		return " 1) Finalizar projeto integrador da Softex, "
				+ "\n 2) Criar um fluxo de organização de trabalho para o PI da Generation, "
				+ "\n 3) Realizar minhas atividades com empenho; ";
	
}}

