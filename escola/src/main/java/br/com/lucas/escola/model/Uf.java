package br.com.lucas.escola.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Entity
@Table(name = "uf")
public class Uf implements Serializable{

	private static final long serialVersionUID = -5421949359587649735L;

	@Id
	@Column(name = "SIGLAUF")
	private String siglaUf;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "SIGLA_UF")
	private String siglaUf2;

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getSiglaUf2() {
		return siglaUf2;
	}
	
	public void setSiglaUf2(String siglaUf2) {
		this.siglaUf2 = siglaUf2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((siglaUf == null) ? 0 : siglaUf.hashCode());
		result = prime * result
				+ ((siglaUf2 == null) ? 0 : siglaUf2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Uf other = (Uf) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (siglaUf == null) {
			if (other.siglaUf != null)
				return false;
		} else if (!siglaUf.equals(other.siglaUf))
			return false;
		if (siglaUf2 == null) {
			if (other.siglaUf2 != null)
				return false;
		} else if (!siglaUf2.equals(other.siglaUf2))
			return false;
		return true;
	}

	
	
}
