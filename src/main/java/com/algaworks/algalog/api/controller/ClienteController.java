package com.algaworks.algalog.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class ClienteController {
	
	@GetMapping		
	public String listar() {
		return "teste";
	}

}
