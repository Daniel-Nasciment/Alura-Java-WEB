package br.com.alura.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	// QUANDO A MÁQUINA VIRTUAL CARREGA A CLASSE, OS ATRIBUTOS E/OU BLOCOS STATICOS
	// SÃO CARREGADOS
	private static List<Empresa> lista = new ArrayList<>();

	private static Usuario u1 = new Usuario();

	static {

		Empresa emp1 = new Empresa();
		Empresa emp2 = new Empresa();

		emp1.setNome("ZUP");
		emp2.setNome("Nubank");

		lista.add(emp1);
		lista.add(emp2);

		u1.setLogin("daniel");
		u1.setSenha("1234");

	}

	public void adiciona(Empresa empresa) {
		System.out.println("Cadastrando nova empresa...");
		Banco.lista.add(empresa);
		System.out.println("Empresa cadastrada com sucesso!");
	}

	public List<Empresa> listaEmpresas() {
		return Banco.lista;
	}

	public Usuario buscaUsuario(String login, String senha) {

		if (u1.getLogin().equals(login) && u1.getSenha().equals(senha)) {
			return u1;
		}
		return null;
	}

}
