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
		System.out.println();
		
		Product product = new Product(name, price);
		
		product.setName("Computador");
		System.out.println("Nome atualizado: "+ product.getName());
		
		product.setPrice(1200.00);
		System.out.println("Preco atualizado atualizado: "+ product.getPrice());
		
		System.out.println("Dados do Produto: " + product);
		System.out.println();
		System.out.print("Entre com a quantidade de produtos a ser adicionadas ao estoque: ");
		int quantity = sc.nextInt();
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