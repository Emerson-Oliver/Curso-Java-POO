package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Informe os dados do produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("Dados do Produto: " + produto.toString());
		
		System.out.print("Entre com a quantidade produtos a serem adicionados ao estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		System.out.println("Dados atualizados: " + produto.toString() );
		System.out.print("Entre com a quantidade produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		System.out.println("Dados atualizados: " + produto.toString() );		
		
		sc.close();
	}

}
