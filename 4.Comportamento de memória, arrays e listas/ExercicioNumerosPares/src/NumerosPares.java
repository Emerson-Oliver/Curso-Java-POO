import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int n, quantidadeDePares = 0;
			
			System.out.println("Quantos numeros voce vai digitar?");
			n = sc.nextInt();
			
			int numerosDigitados[] = new int[n];
			
			for(int index=0; index<n; index+=1) {
				System.out.print("Digite um numero: ");
				numerosDigitados[index] = sc.nextInt();
			}
			
			System.out.println();
			
			for(int index=0; index<n; index+=1) {
				if(numerosDigitados[index] % 2 == 0) {
					System.out.print(numerosDigitados[index] + " ");
				}
			}
			System.out.println();
			
			for(int index=0; index<n; index+=1) {
				if(numerosDigitados[index] % 2 == 0) {
					quantidadeDePares += 1;					
				}
			}
			System.out.println();
			System.out.println("Quantidade de pares = " + quantidadeDePares);
		sc.close();
	}

}
