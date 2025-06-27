package com.sistema.folha.tabelaController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistroHeaderController {
	
	@RequestMapping("/registroHeader")
	public String registroHeader() {
		
		return "registroHeader";
	}
	
	@RequestMapping("/registroDetalhe")
	public String registroDetalhe() {
		
		return "registroDetalhe";
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
