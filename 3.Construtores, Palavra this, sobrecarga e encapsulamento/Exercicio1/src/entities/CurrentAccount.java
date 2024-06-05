package entities;

public class CurrentAccount {
	private int number;
	private String holder;
	private double openingBalance;

	public CurrentAccount(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public CurrentAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getholder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}
	
	public void deposit(double  amount) {
		openingBalance += amount;
	}
	
	public void withdraw(double  amount) {
		openingBalance -= amount + 5.0;
	}
	
	public String toString() {
		return "Conta Corrente: " + number + ", " + " Titular: " + holder + ", " + "Saldo R$: " + String.format("%.2f", openingBalance);
	}
}
