package com.sistema.folha.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.folha.repository.RegistroHeaderRepository;
import com.sistema.folha.tabelaDomain.HeaderDTO;
import com.sistema.folha.tabelaDomain.RegistroHeader;

@Service
public class RegistroHeaderService {

	@Autowired
	RegistroHeaderRepository headerRepository;
	
	public String saveHeader(HeaderDTO h) {
		
		RegistroHeader registroHeader = new RegistroHeader();
		registroHeader.setOrgcodigo(h.getOrgcodigo());
		registroHeader.setFolcod(h.getFolcod());
		registroHeader.setHdrmesref(h.getHdrmesref());
		registroHeader.setHdranoref(h.getHdranoref());
		registroHeader.setHdrtipopag(h.getHdrtipopag());
		registroHeader.setHdrdespag(h.getHdrdespag());
		registroHeader.setHdrqtdcred(h.getHdrqtdcred());
		
		try {	
			BigDecimal valueCred = new BigDecimal(h.getHdrvlrcred().replace(".", "").replace(",", "."));
			registroHeader.setHdrvlrcred(valueCred);
		} catch (Exception e) {
			return "Erro ao gravar registro verifique os dados enviados.";
		}
		
		
		
		try {
			headerRepository.save(registroHeader);
		} catch (Exception e) {
			return "Erro ao salvar regristro";
		}
		return "Cadastro realizado com sucesso.";
		
	}
}
