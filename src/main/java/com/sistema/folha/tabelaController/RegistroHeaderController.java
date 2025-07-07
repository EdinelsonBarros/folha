package com.sistema.folha.tabelaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sistema.folha.services.RegistroHeaderService;
import com.sistema.folha.tabelaDomain.RegistroHeader;

@Controller
public class RegistroHeaderController {
	
	@Autowired
	RegistroHeaderService registroHeaderService;
	
	@RequestMapping("/registroHeader")
	public String registroHeaderView() {
		
		return "registroHeader";
	}
	
	@PostMapping("/saveHeader")
	public String registroHeader(RegistroHeader r) {
		String mensagem = registroHeaderService.saveHeader(r);
		return "registroHeader";
	}
	
	
	
	@RequestMapping("/registroTrailler")
	public String registroTrailler() {
		
		return "registroTrailler";
	}
	
	@RequestMapping("/registros")
	public String registros() {
		
		return "tabelaRegistrosDetalhados";
	}

}
