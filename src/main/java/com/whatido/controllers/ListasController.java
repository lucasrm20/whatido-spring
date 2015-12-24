package com.whatido.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.whatido.models.ListaTarefas;

@Controller
@RequestMapping("/listas")
public class ListasController {
	
	@RequestMapping("/form")
	public ModelAndView form(ListaTarefas listaTarefas){
		ModelAndView modelAndView = new ModelAndView("listas/form");
		
		return modelAndView;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView gravar(ListaTarefas listaTarefas){
		System.out.println(listaTarefas);
		return new ModelAndView("redirect:listas/form");
	}

}
