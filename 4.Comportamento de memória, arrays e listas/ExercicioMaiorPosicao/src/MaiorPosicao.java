import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posicaoDoMaior = 0;		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] numerosDigitados = new double[n];
		
		for(int index=0; index<n; index+=1) {
			System.out.print("Digite um numero: ");
			numerosDigitados[index] = sc.nextDouble();
		}
		System.out.println();
		
		double maiorValor = 0.0;
		
		for(int index=0; index<n; index+=1) {
			if(numerosDigitados[index] > maiorValor) {
				maiorValor = numerosDigitados[index];
				posicaoDoMaior = index;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f\n", maiorValor);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicaoDoMaior);
		sc.close();

	}

}
