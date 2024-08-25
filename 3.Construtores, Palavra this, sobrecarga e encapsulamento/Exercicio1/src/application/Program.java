package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrentAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CurrentAccount account;

		System.out.print("Entre com o numero da conta: ");
		int number = sc.nextInt();
		System.out.print("Entre com o titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Existe deposito Inicial (s/n)?: ");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.print("Entre com o valor inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new CurrentAccount(number, holder, initialDeposit);
		}
		else {
			account = new CurrentAccount(number, holder);
		}
		
		System.out.println("Dados atualizados: " + account);
		System.out.print("Entre com um valor para deposito: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Dados atualizados: " + account);
		
		System.out.print("Entre com um valor para saque: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Dados atualizados: " + account);
		sc.close();

	}

}
