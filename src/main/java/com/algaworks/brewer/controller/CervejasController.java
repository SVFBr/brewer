package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CervejasController {
	
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.GET)
	public String novo() {
		return "cerveja/CadastroCerveja";
	}

	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public void cadastrar() {
		
		System.out.println("log.cosole: cadastro de cerveja");
		
	}
	
}
