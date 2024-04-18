package Banco;
//Conta não pode ser instanciada
public abstract class Conta implements ContaInterface {
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	private static final int AGENCIA_PADRAO = 1;
	private static int contador = 1;
	
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = contador++;
		this.cliente = cliente;
	}


	public double getSaldo() {
		return saldo;
	}


	public int getAgencia() {
		return agencia;
	}


	public int getNumero() {
		return numero;
	}

	@Override
	
	public boolean sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public double depositar(double valor) {
		return saldo += valor;
	}

	public double obterSaldo() {
		return saldo;
	}
	
	public boolean transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
		return false;
		
	}


	@Override
	public String toString() {
		String s = "Titular: " + cliente.getNome() + "\n" ;
		s += "Agencia: " + agencia + "\n";
		s += "Número: " + numero + "\n";
		s += "Saldo: " + saldo + "\n";
		return s;
	}
	
	
	
}

