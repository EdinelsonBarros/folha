package com.sistema.folha.tabelaDomain;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RegistroDetalhe {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	String id;
	
	private int orgcodigo;
	private int folcod;
	private int movtipreg;
	private String lcomatrgdf; 
	private String lconomserv;
	private int lcovlrcred;
	private int lcoageconta;
	private int lcoconta;
	private String lcodgvconta;
	private int tpgtpconta;
	private int lcobancopag;
	private int lcoagepag;
	private String lcoufebanco;
	private long lcocpf;
	
	public RegistroDetalhe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public RegistroDetalhe(int orgcodigo, int folcod, int movtipreg, String lcomatrgdf, String lconomserv,
			int lcovlrcred, int lcoageconta, int lcoconta, String lcodgvconta, int tpgtpconta, int lcobancopag,
			int lcoagepag, String lcoufebanco, long lcocpf) {
		super();
		this.orgcodigo = orgcodigo;
		this.folcod = folcod;
		this.movtipreg = movtipreg;
		this.lcomatrgdf = lcomatrgdf;
		this.lconomserv = lconomserv;
		this.lcovlrcred = lcovlrcred;
		this.lcoageconta = lcoageconta;
		this.lcoconta = lcoconta;
		this.lcodgvconta = lcodgvconta;
		this.tpgtpconta = tpgtpconta;
		this.lcobancopag = lcobancopag;
		this.lcoagepag = lcoagepag;
		this.lcoufebanco = lcoufebanco;
		this.lcocpf = lcocpf;
	}



	public String getId() {
		return id;
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



	public String getLcomatrgdf() {
		return lcomatrgdf;
	}



	public void setLcomatrgdf(String lcomatrgdf) {
		this.lcomatrgdf = lcomatrgdf;
	}



	public String getLconomserv() {
		return lconomserv;
	}



	public void setLconomserv(String lconomserv) {
		this.lconomserv = lconomserv;
	}



	public int getLcovlrcred() {
		return lcovlrcred;
	}



	public void setLcovlrcred(int lcovlrcred) {
		this.lcovlrcred = lcovlrcred;
	}



	public int getLcoageconta() {
		return lcoageconta;
	}



	public void setLcoageconta(int lcoageconta) {
		this.lcoageconta = lcoageconta;
	}



	public int getLcoconta() {
		return lcoconta;
	}



	public void setLcoconta(int lcoconta) {
		this.lcoconta = lcoconta;
	}



	public String getLcodgvconta() {
		return lcodgvconta;
	}



	public void setLcodgvconta(String lcodgvconta) {
		this.lcodgvconta = lcodgvconta;
	}



	public int getTpgtpconta() {
		return tpgtpconta;
	}



	public void setTpgtpconta(int tpgtpconta) {
		this.tpgtpconta = tpgtpconta;
	}



	public int getLcobancopag() {
		return lcobancopag;
	}



	public void setLcobancopag(int lcobancopag) {
		this.lcobancopag = lcobancopag;
	}



	public int getLcoagepag() {
		return lcoagepag;
	}



	public void setLcoagepag(int lcoagepag) {
		this.lcoagepag = lcoagepag;
	}



	public String getLcoufebanco() {
		return lcoufebanco;
	}



	public void setLcoufebanco(String lcoufebanco) {
		this.lcoufebanco = lcoufebanco;
	}



	public long getLcocpf() {
		return lcocpf;
	}



	public void setLcocpf(long lcocpf) {
		this.lcocpf = lcocpf;
	}



	
	
	
	 

}
