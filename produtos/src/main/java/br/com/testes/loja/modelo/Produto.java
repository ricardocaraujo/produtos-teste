package br.com.testes.loja.modelo;

import javax.validation.constraints.Size;

public class Produto {
	
	@Size(min=5)
	private String nome;
	private String descricao;
	private double preco;
	
	
	public Produto(String nome, String descricao, double preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
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
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	
}
