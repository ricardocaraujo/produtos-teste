package br.com.testes.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	
	@RequestMapping("/teste")
	public String olaMundo() {
		
		return "ok";
	}

}
