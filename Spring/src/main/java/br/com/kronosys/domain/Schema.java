package br.com.kronosys.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="hst01_schema")
public class Schema implements Serializable
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long chave;
	
	private Date dataHora;
	private String nomeUsuario;
	private String descricao;
	
	@Override
	public int hashCode() {
		return Objects.hash(chave);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schema other = (Schema) obj;
		return Objects.equals(chave, other.chave);
	}

	public Long getChave() {
		return chave;
	}

	public void setChave(Long chave) {
		this.chave = chave;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Schema [chave=" + chave + ", dataHora=" + dataHora + ", nomeUsuario=" + nomeUsuario + ", descricao="
				+ descricao + "]";
	}
}