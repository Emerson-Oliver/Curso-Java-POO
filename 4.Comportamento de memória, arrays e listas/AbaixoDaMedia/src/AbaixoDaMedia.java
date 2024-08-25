import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = scanner.nextInt();
		
		double[] valores = new double[n];
		
		for(int index=0; index<n; index+=1) {
			System.out.print("Digite um numero: ");
			valores[index] = scanner.nextDouble();
		}
		
		double valorMedio = 0.0;
		
		for(int index=0; index<n; index+=1) {
			valorMedio += valores[index] / n;
		}
		
		System.out.println();
		System.out.printf("Media do vetor = %.3f%n ", valorMedio);
		
		System.out.println("Elementos abaixo da media");
		double elementosAbaixoMedia = 0.0;		
		for(int index=0; index<n; index+=1) {
			if(valores[index] < valorMedio) {
				elementosAbaixoMedia = valores[index] ;
				System.out.println(elementosAbaixoMedia);
			}
		}	
		
		scanner.close();
	}

}
