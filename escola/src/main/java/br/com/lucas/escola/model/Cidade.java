package br.com.lucas.escola.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Lucas Moreira
 *
 */

@Table(name = "cidade")
@Entity
public class Cidade implements Serializable{

	private static final long serialVersionUID = -3775795490089212176L;

	@Id
	@Column(name = "COD_CIDADE")
	private Integer idCidade;
	
	@Column(name = "SIGLAUF")
	private String siglaUf;
	
	@Column(name = "NOME")
	private String nomeCidade;
	
	@Column(name = "CODIGO_MUNICIPIO")
	private String codMunicipio;
	
	@Column(name = "ID")
	private String id;
	
	@Column(name = "COD_MUN")
	private String codMunicipio2;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "ID_UF")
	private Uf uf;

	public Integer getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Integer idCidade) {
		this.idCidade = idCidade;
	}

	public String getSiglaUf() {
		return siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getCodMunicipio() {
		return codMunicipio;
	}

	public void setCodMunicipio(String codMunicipio) {
		this.codMunicipio = codMunicipio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodMunicipio2() {
		return codMunicipio2;
	}

	public void setCodMunicipio2(String codMunicipio2) {
		this.codMunicipio2 = codMunicipio2;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codMunicipio == null) ? 0 : codMunicipio.hashCode());
		result = prime * result
				+ ((codMunicipio2 == null) ? 0 : codMunicipio2.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((idCidade == null) ? 0 : idCidade.hashCode());
		result = prime * result
				+ ((nomeCidade == null) ? 0 : nomeCidade.hashCode());
		result = prime * result + ((siglaUf == null) ? 0 : siglaUf.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
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
		Cidade other = (Cidade) obj;
		if (codMunicipio == null) {
			if (other.codMunicipio != null)
				return false;
		} else if (!codMunicipio.equals(other.codMunicipio))
			return false;
		if (codMunicipio2 == null) {
			if (other.codMunicipio2 != null)
				return false;
		} else if (!codMunicipio2.equals(other.codMunicipio2))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idCidade == null) {
			if (other.idCidade != null)
				return false;
		} else if (!idCidade.equals(other.idCidade))
			return false;
		if (nomeCidade == null) {
			if (other.nomeCidade != null)
				return false;
		} else if (!nomeCidade.equals(other.nomeCidade))
			return false;
		if (siglaUf == null) {
			if (other.siglaUf != null)
				return false;
		} else if (!siglaUf.equals(other.siglaUf))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}
}