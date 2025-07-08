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
	
	@NotEmpty
	@Size(max = 5)
	private int orgcodigo; // 5 digitos
	@NotEmpty
	private int folcod; // 3 digitos
	@NotEmpty
	private int hdrmesref; // 2 digitos
	@NotEmpty
	private int hdranoref; // 4 digitos

	@NotEmpty
	private int hdrtipopag; // 2 digitos
	@NotEmpty
	@Size(max = 20)
	private String hdrdespag; // alfanumerico

	@NotEmpty
	@Size(max = 6)
	private int hdrqtdcred; // no maximo sei numeros

	@NotEmpty
	private String hdrvlrcred; // duas casas decimais

	public HeaderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HeaderDTO(@NotEmpty @Size(max = 5) int orgcodigo, @NotEmpty int folcod, @NotEmpty int hdrmesref,
			@NotEmpty int hdranoref, @NotEmpty int hdrtipopag, @NotEmpty @Size(max = 20) String hdrdespag,
			@NotEmpty @Size(max = 6) int hdrqtdcred, @NotEmpty String hdrvlrcred) {
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
