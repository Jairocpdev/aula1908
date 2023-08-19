package com.eclesia.siscontrol.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping ("/membros")

public class MembresiaController {
	
	@GetMapping
	
	public String abrirFrmMembro() {
		
		return "FormMembro.html";
		
		
	}
	
}