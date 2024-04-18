package Banco;

public class Main {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.setNome("Vinicius");
		
		Cliente c2 = new Cliente();
		c2.setNome("Junior");
		
		Conta cc = new ContaCorrente(c1);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(c2);
		cc.transferir(100, poupanca);

		System.err.println(cc);
		System.err.println(poupanca);
				
		
	}
		
	
}
