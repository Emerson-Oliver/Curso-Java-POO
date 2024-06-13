import java.util.Scanner;

public class MinhaMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] numeros = new int[M][N];

		for (int i = 0; i < M; i += 1) {
			for (int j = 0; j < N; j += 1) {
				numeros[i][j] = sc.nextInt();

			}
		}

		System.out.println("Numeros Negativos: ");

		for (int i = 0; i < M; i += 1) {
			for (int j = 0; j < N; j += 1) {
				if (numeros[i][j] < 0) {
					System.out.println(numeros[i][j]);
				}
			}
		}

		sc.close();
	}

}
