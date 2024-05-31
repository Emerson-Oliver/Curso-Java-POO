package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.print("Entre com o raio: ");
		double radius = sc.nextDouble();
		
		double c = calculator.circumference(radius);
		double v = calculator.volume(radius);	
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor de PI: %.2f%n", calculator.PI);
		
		sc.close();		
	}	

}
