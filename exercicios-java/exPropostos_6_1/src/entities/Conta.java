package entities;

public class Conta {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta(int numeroConta, String nomeTitular) {
		
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		
	}
	
	public Conta(int numeroConta, String nomeTitular, double depositoInicial) {
		
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
		
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double quantia) {
		
		saldo += quantia;
		
	}

	public void saque(double quantia) {
		
		saldo -= quantia + 5;
		
	}
	
	public String toString() {
		
		return "Conta: " 
				+ numeroConta
				+ ", Titular: "
				+ nomeTitular
				+ ", Saldo: R$ "
				+ String.format("%.2f", saldo);
		
	}
	
}
