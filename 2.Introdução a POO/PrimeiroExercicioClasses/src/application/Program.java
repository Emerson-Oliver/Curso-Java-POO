package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com as medidas do retangulo: ");
		retangulo.largura = sc.nextDouble();
		retangulo.altura = sc.nextDouble();				
		
		System.out.printf("AREA = %.2f%n" , retangulo.area());
		System.out.printf("PERIMETRO = %.2f%n" , retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n" , retangulo.diagonal());
		
		sc.close();

	}

}
