package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Entre com as medidas do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Entre com as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();		
		
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = (Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c)));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = (Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c)));
		
		System.out.printf("Area de X : %.2f%n", areaX);
		System.out.printf("Area de Y : %.2f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior area: X");
		}
		else {
			System.out.println("Maior area: Y");
		}
		
		sc.close();

	}

}
