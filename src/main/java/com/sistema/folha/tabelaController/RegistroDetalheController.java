package com.sistema.folha.tabelaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.sistema.folha.services.RegistroDetalheService;
import com.sistema.folha.tabelaDomain.RegistroDetalhe;



@Controller
public class RegistroDetalheController {

	@Autowired
	RegistroDetalheService registroDetalherService;
	
	@RequestMapping("/registroDetalhe")
	public String registroDetalhe() {
		
		return "registroDetalhe";
	}
	
	@PostMapping("/saveRegistroDetalhe")
	public String registroHeader(RegistroDetalhe r, Model model) {
		String mensagem = registroDetalherService.saveRegistroDetalhe(r);
		model.addAttribute("mensagem", "Registro gravado com sucesso!");
		return "registroDetalhe";
	}
}
