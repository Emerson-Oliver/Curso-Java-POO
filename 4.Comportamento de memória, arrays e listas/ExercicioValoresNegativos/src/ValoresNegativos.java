import java.util.Locale;
import java.util.Scanner;

public class ValoresNegativos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n; 		
		
		System.out.print("Quantos numeros voce quer digitar: ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(int index=0; index<n; index+=1) {
			System.out.print("Digite um numero: ");
			vet[index] += sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS DIGITADOS:");
		for(int index=0; index<n; index+=1) {
			if(vet[index] < 0) {
				System.out.printf("%d\n" , vet[index]);
			}
		}		
		
		sc.close();
	}
}
