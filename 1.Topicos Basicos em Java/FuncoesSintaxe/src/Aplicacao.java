import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com 3 numeros:");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();

		int maior = max(numero1, numero2, numero3);
		
		showResult(maior);

		/* if(numero1 > numero2 && numero1 > numero3) {
				System.out.println("Maior = " + numero1);
			}
			else if(numero2 > numero3) {
				System.out.println("Maior = " + numero2);
			}
			else {
				System.out.println("Maior = " + numero3);
			} */

		sc.close();
	}

	public static int max(int a1, int b2, int c3) {
		int aux;
		if (a1 > b2 && a1 > c3) {
			aux = a1;
		} else if (b2 > c3) {
			aux = b2;
		} else {
			aux = c3;
		}

		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Maior = " + value);
	}
}
