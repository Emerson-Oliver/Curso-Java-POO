package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Livro livro = new Livro();
		
		System.out.println("Dados do Livro: ");
		System.out.print("Título: ");
		livro.titulo = sc.nextLine();
		System.out.print("Autor: ");
		livro.autor = sc.nextLine();
		System.out.print("Preço: ");
		livro.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		livro.quantidadeEmEstoque = sc.nextInt();
		System.out.println(livro.toString());		
		System.out.print("Informe a quantidade de livros a ser adiciona no estoque: ");
		int quantidade = sc.nextInt();
		livro.entradaLivroNoEstoque(quantidade);
		System.out.println(livro.toString());
		System.out.print("Informe a quantidade de livros a ser removida no estoque: ");
		quantidade = sc.nextInt();
		livro.saidaLivroNoEstoque(quantidade);
		System.out.println(livro.toString());
		sc.close();
	}

}
