import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		int n;
		
		System.out.println("Quantos valores vai ter cada vetor?");
		n = scanner.nextInt();
		
		int vetorA[] = new int[n];
		int vetorB[] = new int[n];
		int vetorResultado[] = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for(int index=0; index<n; index+=1) {			
			vetorA[index] = scanner.nextInt();			
		}
		System.out.println("Digite os valores do vetor B:");
		for(int index=0; index<n; index+=1) {			
			vetorB[index] = scanner.nextInt();			
		}
		System.out.println("Vetor resultante: ");
		for(int index=0; index<n; index+=1) {
			vetorResultado[index] = vetorA[index] + vetorB[index];
			System.out.println(vetorResultado[index]);
		}
		scanner.close();
	}

}
