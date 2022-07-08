package com.ryan.pessoa;

import org.springframework.stereotype.Component;

@Component
public class Pessoa {
	
	private String nome;
	private String descricao;
	
	public Pessoa() {
		System.out.println("Criando a instância de pessoa!");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", descricao=" + descricao + "]";
	}
}