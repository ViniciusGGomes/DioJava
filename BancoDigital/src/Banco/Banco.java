package Banco;

import java.util.ArrayList;

//Método que liste todos os clientes.

import java.util.List;

public class Banco { 
	private String nome;
	private List<Conta> contas = new ArrayList<>();
	
	public void inicializarContas(List<Conta> contas) {
	    this.contas = contas;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
	
