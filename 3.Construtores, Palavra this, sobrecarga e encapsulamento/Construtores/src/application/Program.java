package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Preco: ");
		double price = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantity = sc.nextInt();
		System.out.println();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println("Dados do Produto: " + product);
		System.out.println();
		System.out.print("Entre com a quantidade de produtos a ser adicionadas ao estoque: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		System.out.println();
		System.out.print("Entre com a quantidade de produtos a serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		sc.close();
	}
}