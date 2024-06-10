import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] valores = new int[n];
		
		for (int index = 0; index < n; index += 1) {
			System.out.print("Digite um numero: ");
			valores[index] = sc.nextInt();
		}
		
		int quantidadeDePares = 0;
		int valoresPares = 0;;
		double mediaPares = 0.0;
		for (int index=0; index<n; index+=1) {
			if (valores[index] % 2 == 0) {
				quantidadeDePares += valores[index];
				valoresPares+=1;
			}
		}
		
		if(valoresPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			mediaPares = (double) quantidadeDePares / valoresPares;
			System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
		}
		sc.close();
	}

}
