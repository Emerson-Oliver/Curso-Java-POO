import java.util.Scanner;

public class SomaElementos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int valores[][] = new int[N][N];

		for (int i = 0; i < N; i += 1) {
			for (int j = 0; j < N; j += 1) {
				valores[i][j] = sc.nextInt();
			}
		}
		
		
		for (int i = 0; i < N; i += 1) {
			int soma = 0;
			for (int j = 0; j < N; j += 1) {
				soma+= valores[i][j];				
			}
			System.out.println(soma);
		}

		sc.close();

	}

}
