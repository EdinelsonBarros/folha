package com.sistema.folha.tabelaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sistema.folha.services.RegistroHeaderService;
import com.sistema.folha.tabelaDomain.HeaderDTO;

import jakarta.validation.Valid;

@Controller
public class RegistroHeaderController {
	
	@Autowired
	RegistroHeaderService registroHeaderService;
	
	@RequestMapping("/registroHeader")
	public String registroHeaderView(Model model) {
		model.addAttribute("headerDTO", new HeaderDTO());
		return "registroHeader";
	}
	
	@PostMapping("/saveHeader")
	public String registroHeader(@Valid @ModelAttribute HeaderDTO r, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute(r);
			model.addAttribute("erro", "Registro não foi gravado. Todos os campos são obrigatórios.");
			return "registroHeader";
		}
		
		String mensagem = registroHeaderService.saveHeader(r);
		model.addAttribute("mensagem",mensagem);
		
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
