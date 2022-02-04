package br.com.alura.modelo;

import java.util.Date;

public class Empresa {

	private String nome;

	private Date data = new Date();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + "]";
	}

}
