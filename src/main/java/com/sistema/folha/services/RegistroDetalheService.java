package com.sistema.folha.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.folha.repository.RegistroDetalheRepository;
import com.sistema.folha.tabelaDomain.RegistroDetalhe;

@Service
public class RegistroDetalheService {
	
	@Autowired
	RegistroDetalheRepository registroDetalheRepository;
	
	
	public String saveRegistroDetalhe(RegistroDetalhe r) {
		r.setMovtipreg(2);
		registroDetalheRepository.save(r);
		
		return "Registro salvo com sucesso";
	}
	

}
