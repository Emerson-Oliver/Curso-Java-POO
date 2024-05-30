package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Dados do funcionario: ");
		
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Funcionario: " + funcionario.toString());
		System.out.println("Informe a porcentagem para aumentar o salario: ");
		double aumentarSalario = sc.nextDouble();
		funcionario.aumentarSalario(aumentarSalario);
		System.out.println("Dados atualizados: " + funcionario.toString());
		
		sc.close();
	}

}
