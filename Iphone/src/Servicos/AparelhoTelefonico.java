package Servicos;

import Celular.Iphone;

public class AparelhoTelefonico extends Iphone implements TelefoneAcoes{

	@Override
	public void nomeServico() {
		System.out.println("Aparelho telefonico");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciou o correio de voz");
		
	}
	
	

}
