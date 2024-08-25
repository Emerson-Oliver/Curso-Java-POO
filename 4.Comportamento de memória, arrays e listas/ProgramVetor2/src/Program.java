import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		Produto[] vet = new Produto[n];
		
		for (int index=0; index<vet.length; index+=1) {
			scanner.nextLine();
			String nome = scanner.nextLine();
			double preco = scanner.nextDouble();
			
			vet[index] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		for (int index=0; index<vet.length; index+=1) {
			soma += vet[index].getPreco();
		}
		
		double media = soma / n;
		
		System.out.printf("Preço medio = %.2f%n", media);
		
		
		scanner.close();
	}

}
