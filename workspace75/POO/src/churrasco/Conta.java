package churrasco;

public class Conta {    
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Método para sacar dinheiro
	public void sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
		} else {
			System.out.println("Saldo insuficiente para saque de R$" + valor);
		}
	}

	// Método para depositar dinheiro
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
	}

}
