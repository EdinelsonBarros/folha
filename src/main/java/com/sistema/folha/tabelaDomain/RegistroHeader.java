package com.sistema.folha.tabelaDomain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="pagamento")
public class RegistroHeader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	String id;
	
	private int orgcodigo;  // 5 digitos
	private String folcod; // 3 digitos
	private String movtipreg; // valor fixo 1
	private int hdrmesref; // 2 digitos
	private int hdranoref; // 4 digitos
	private int hdrtipopag; // 2 digitos
	private String hdrdespag; // alfanumerico
	private int hdrqtdcred; // no maximo sei numeros
	private BigDecimal hdrvlrcred; // duas casas decimais
	// String filler; espaços em brancos quando for gerar o arquivos
	
	public RegistroHeader() {
		super();
	}

	public RegistroHeader(int orgcodigo, String folcod, String movtipreg, int hdrmesref, int hdranoref, int hdrtipopag,
			String hdrdespag, int hdrqtdcred, BigDecimal hdrvlrcred) {
		super();
		this.orgcodigo = orgcodigo;
		this.folcod = folcod;
		this.movtipreg = movtipreg;
		this.hdrmesref = hdrmesref;
		this.hdranoref = hdranoref;
		this.hdrtipopag = hdrtipopag;
		this.hdrdespag = hdrdespag;
		this.hdrqtdcred = hdrqtdcred;
		this.hdrvlrcred = hdrvlrcred;
	}

	public int getOrgcodigo() {
		return orgcodigo;
	}

	public void setOrgcodigo(int orgcodigo) {
		this.orgcodigo = orgcodigo;
	}

	public String getFolcod() {
		return folcod;
	}

	public void setFolcod(String folcod) {
		this.folcod = folcod;
	}

	public String getMovtipreg() {
		return movtipreg;
	}

	public void setMovtipreg(String movtipreg) {
		this.movtipreg = movtipreg;
	}

	public int getHdrmesref() {
		return hdrmesref;
	}

	public void setHdrmesref(int hdrmesref) {
		this.hdrmesref = hdrmesref;
	}

	public int getHdranoref() {
		return hdranoref;
	}

	public void setHdranoref(int hdranoref) {
		this.hdranoref = hdranoref;
	}

	public int getHdrtipopag() {
		return hdrtipopag;
	}

	public void setHdrtipopag(int hdrtipopag) {
		this.hdrtipopag = hdrtipopag;
	}

	public String getHdrdespag() {
		return hdrdespag;
	}

	public void setHdrdespag(String hdrdespag) {
		this.hdrdespag = hdrdespag;
	}

	public int getHdrqtdcred() {
		return hdrqtdcred;
	}

	public void setHdrqtdcred(int hdrqtdcred) {
		this.hdrqtdcred = hdrqtdcred;
	}

	public BigDecimal getHdrvlrcred() {
		return hdrvlrcred;
	}

	public void setHdrvlrcred(BigDecimal hdrvlrcred) {
		this.hdrvlrcred = hdrvlrcred;
	}


	

	

}
