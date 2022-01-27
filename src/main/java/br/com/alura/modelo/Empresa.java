package br.com.alura.modelo;

public class Empresa {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + "]";
	}

}
