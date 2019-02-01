package com.eventoApp.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/teste")
	public String teste() {
		return "teste";
	}

}