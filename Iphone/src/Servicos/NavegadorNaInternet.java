package Servicos;

import Celular.Iphone;

public class NavegadorNaInternet extends Iphone implements NavegadorAcoes {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
	}

	@Override
	public void nomeServico() {
		System.out.println("Navegador na internet");
		
	}

}
