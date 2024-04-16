package Teste;
import Servicos.AparelhoTelefonico;
import Servicos.NavegadorNaInternet;
import Servicos.ReprodutorMusical;

public class Main {
	public static void main(String[] args) {
		
		AparelhoTelefonico telefone = new AparelhoTelefonico();
		
		System.out.println(telefone.getNomeCelular());
		telefone.nomeServico();
		telefone.atender();
		telefone.ligar();
		telefone.iniciarCorreioVoz();
		
		
		NavegadorNaInternet internet = new NavegadorNaInternet();
		
		System.out.println(internet.getNomeCelular());
		internet.nomeServico();
		internet.atualizarPagina();
		internet.adicionarNovaAba();
		internet.exibirPagina();
		
		
		ReprodutorMusical musica = new ReprodutorMusical();
		
		System.out.println(musica.getNomeCelular());
		musica.nomeServico();
		musica.selecionarMusica();
		musica.tocar();
		musica.pausar();
	}
}
