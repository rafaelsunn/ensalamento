package br.com.lucas.escola.model;

import java.util.EnumSet;
import java.util.Set;

public enum VeiculoPublicacao {

	AMIGO("0", "Amigo"),
	REDE_SOCIAL("1", "Rede Social"),
	PANFLETO("2", "Panfleto"),
	TV("3", "Televisão"),
	RADIO("4", "Rádio");
	
	private VeiculoPublicacao(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public String codigo;	
	public String descricao;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Set<VeiculoPublicacao> getVeiculoPublicacao() {
		return EnumSet.of(AMIGO, REDE_SOCIAL, PANFLETO, TV, RADIO);
	}
	
}
