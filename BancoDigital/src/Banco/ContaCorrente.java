package Banco;

class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String s = "Conta Corrente" + "\n";
		s += super.toString();
		return s;
	}

	
}
