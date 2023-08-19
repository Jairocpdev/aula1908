package com.eclesia.siscontrol.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/funcionarios")

public class FuncionarioController {

	@GetMapping
	public String abrirFrmFunc() {
		
		return "frmfunc";
		
	
	}
	
	
}
