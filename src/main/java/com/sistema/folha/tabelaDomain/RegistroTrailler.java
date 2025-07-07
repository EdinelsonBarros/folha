package com.sistema.folha.tabelaDomain;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RegistroTrailler {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	String id;
	
	private int orgcodigo;
	private int folcod;
	private int movtipreg;
	private int trlqtdcred;
	private BigDecimal trlvlrcred;
	
	public RegistroTrailler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistroTrailler(int orgcodigo, int folcod, int movtipreg, int trlqtdcred, BigDecimal trlvlrcred) {
		super();
		this.orgcodigo = orgcodigo;
		this.folcod = folcod;
		this.movtipreg = movtipreg;
		this.trlqtdcred = trlqtdcred;
		this.trlvlrcred = trlvlrcred;
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
		this.movtipreg = movtipreg;
	}

	public int getTrlqtdcred() {
		return trlqtdcred;
	}

	public void setTrlqtdcred(int trlqtdcred) {
		this.trlqtdcred = trlqtdcred;
	}

	public BigDecimal getTrlvlrcred() {
		return trlvlrcred;
	}

	public void setTrlvlrcred(BigDecimal trlvlrcred) {
		this.trlvlrcred = trlvlrcred;
	}

	public String getId() {
		return id;
	}


	
}
