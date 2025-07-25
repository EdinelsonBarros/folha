package com.sistema.folha.tabelaDomain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.DecimalMin;

@Entity(name = "pagamento")
public class RegistroHeader {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	String id;

	@Min(0)
	@Max(99999)
	private int orgcodigo; // 5 digitos

	@Min(9)
	@Max(999)
	private int folcod; // 3 digitos

	private int movtipreg; // valor fixo 1

	@Min(9)
	@Max(99)
	private int hdrmesref; // 2 digitos

	@Min(9)
	@Max(9999)
	private int hdranoref; // 4 digitos

	@Min(9)
	@Max(99)
	private int hdrtipopag; // 2 digitos

	@NotBlank
	@Size(max = 20)
	private String hdrdespag; // alfanumerico

	@Min(9)
	@Max(999999)
	private int hdrqtdcred; // no maximo sei numeros

	@NotNull
	@Digits(integer = 12, fraction = 2)
	@DecimalMin(value = "0.00", inclusive = false)
	private BigDecimal hdrvlrcred; // duas casas decimais
	// String filler; espaços em brancos quando for gerar o arquivos

	public RegistroHeader() {
		super();
	}

	public RegistroHeader(int orgcodigo, int folcod, int movtipreg, int hdrmesref, int hdranoref, int hdrtipopag,
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

	public int getFolcod() {
		return folcod;
	}

	public void setFolcod(int folcod) {
		this.folcod = folcod;
	}

	public int getMovtipreg() {
		return movtipreg;
	}

	public void setMovtipreg(int movtipreg) {
		this.movtipreg = 1;
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
		this.hdrdespag = hdrdespag.replaceAll("[^\\p{L}\\p{N}\\s]", "");
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
