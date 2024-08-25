import java.util.Locale;
import java.util.Scanner;

public class SomaValores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma = 0.0, media = 0.0;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double[] valores = new double[n];
		
		
		for (int index = 0; index < valores.length; index += 1) {
			System.out.print("Digite um numero: ");
			valores[index] = sc.nextDouble();
			soma += valores[index];			
		}	
		
		System.out.print("Valores = ");
		for (int index = 0; index < valores.length; index += 1) {
			System.out.printf("%.1f " , valores[index]);
		}		
		
		for (int index = 0; index < valores.length; index += 1) {
			media += valores[index] / n; 
		}		
		
		System.out.println();	
		
		System.out.printf("Soma = %.2f%n ", soma);
		System.out.printf("Media = %.2f%n ", media);
		
		sc.close();		
	}

}
