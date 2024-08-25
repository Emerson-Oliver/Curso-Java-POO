import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		double[] vect = new double[n];
		
		
		for(int index=0; index<n; index+=1) {
			vect[index] = scanner.nextDouble();			
		}
		
		double soma = 0.0;
		for(int index=0; index<n; index+=1) {			
			soma += vect[index];
		}
		
		double idadeMedia = soma / n;
		
		System.out.printf("Idade media: %.2f", idadeMedia);
		
		scanner.close();

	}

}
