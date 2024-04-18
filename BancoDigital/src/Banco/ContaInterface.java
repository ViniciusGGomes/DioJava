package Banco;

public interface ContaInterface {
	boolean sacar(double valorSacar);
	double depositar(double ValorDepositar);
	boolean transferir(double ValorTransferir, Conta contaDestino);
	double obterSaldo();
	
}
