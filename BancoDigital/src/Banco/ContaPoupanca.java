package Banco;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String s = "Conta Poupanca" + "\n";
		s += super.toString();
		return s;
	}

}
