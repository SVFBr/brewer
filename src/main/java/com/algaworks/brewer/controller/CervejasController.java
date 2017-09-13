package com.algaworks.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.algaworks.brewer.model.Cerveja;

@Controller
public class CervejasController {

	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.GET)
	public String novo() {
		return "cerveja/CadastroCerveja";
	}

	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {

		if (result.hasErrors()) {
			model.addAttribute("mensagem", "Erro no formulário");
			System.out.println("LOG : Validação NOK");
			return "cerveja/CadastroCerveja";
		} else {
			attributes.addFlashAttribute("mensagem", "Erro no formulário");
			System.out.println(">>>>> LOG " + cerveja.getSku() + " " + cerveja.getNome());
			return "redirect:/cervejas/novo";
		}

	}

}
