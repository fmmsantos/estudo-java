package com.eventoApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eventoApp.Models.Evento;
import com.eventoApp.repository.EventoRepository;



    @Controller
    public class EventoController {
    	@Autowired // uma Dependencia
    	private EventoRepository er;
    	
    	
	@RequestMapping(value="/cadastrarEvento",method=RequestMethod.GET)
	public String form() {
		
		return "evento/formEventos";
	}
	
	@RequestMapping(value="/cadastrarEvento",method=RequestMethod.POST)
	public String form(Evento evento) {
		er.save(evento);
		return "redirect:/cadastrarEvento";
	}
	
	@RequestMapping("/eventos")
	public ModelAndView listaEventos() {
		ModelAndView model = new ModelAndView("index");
		Iterable<Evento> eventos = er.findAll();
		model.addObject("eventos",eventos);
		return model;
	}
		
	@RequestMapping("/{id}")
	public ModelAndView detalhesEvento(@PathVariable("id") long id) {
		Evento evento = er.findById(id);
		ModelAndView model = new ModelAndView("evento/detalhesEvento");
		model.addObject("evento",evento);
		
		return model;
		
	}
	

}
