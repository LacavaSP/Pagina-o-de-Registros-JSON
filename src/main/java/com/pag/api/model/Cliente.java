package com.pag.api.model;

import javax.persistence.*;

@Entity
@Table(name = "cliente_data")
public class Cliente {
	
	@Id
	@Column(nullable = false, name = "CPF")
	private String cpf;
	@Column(nullable = false, name = "nome_cliente")
	private String nome;
	@Column(nullable = false, name = "idade_cliente")
	private int idade;
	@Column(nullable = false, name = "cidade_cliente")
	private String cidade;
	@Column(nullable = false, name = "estado_cliente")
	private String estado;
	@Column(nullable = false, name = "ativo")
	private boolean ativo;
	
	public Cliente() {}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
}
