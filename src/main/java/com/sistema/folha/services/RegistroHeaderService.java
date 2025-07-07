package com.sistema.folha.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.folha.repository.RegistroHeaderRepository;
import com.sistema.folha.tabelaDomain.RegistroHeader;

@Service
public class RegistroHeaderService {

	@Autowired
	RegistroHeaderRepository headerRepository;
	
	public String saveHeader(RegistroHeader r) {
		r.setMovtipreg(1);
		headerRepository.save(r);
		
		return "Cadastro realizado por sucesso.";
		
	}
}
