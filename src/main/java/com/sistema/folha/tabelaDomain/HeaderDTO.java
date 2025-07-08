package com.sistema.folha.tabelaDomain;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class HeaderDTO {
	
	
	private int orgcodigo; // 5 digitos

	private int folcod; // 3 digitos
	
	private int hdrmesref; // 2 digitos
	
	private int hdranoref; // 4 digitos

	
	private int hdrtipopag; // 2 digitos

	private String hdrdespag; // alfanumerico

	
	private int hdrqtdcred; // no maximo sei numeros

	
	private String hdrvlrcred; // duas casas decimais

	public HeaderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public HeaderDTO(int orgcodigo, int folcod, int hdrmesref, int hdranoref, int hdrtipopag, String hdrdespag,
			int hdrqtdcred, String hdrvlrcred) {
		super();
		this.orgcodigo = orgcodigo;
		this.folcod = folcod;
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

	public int getFolcod() {
		return folcod;
	}

	public void setFolcod(int folcod) {
		this.folcod = folcod;
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

	public String getHdrvlrcred() {
		return hdrvlrcred;
	}

	public void setHdrvlrcred(String hdrvlrcred) {
		this.hdrvlrcred = hdrvlrcred;
	}

	
	
}
