package Servicos;

import Celular.Iphone;

public class ReprodutorMusical extends Iphone implements MusicaAcoes{



	@Override
	public void nomeServico() {
		System.out.println("Reprodutor Musical");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
		
	}

}
