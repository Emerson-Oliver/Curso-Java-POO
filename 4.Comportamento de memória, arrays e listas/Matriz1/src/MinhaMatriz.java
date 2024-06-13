import java.util.Scanner;

public class MinhaMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(); // reprensenta a quantidade de linhas
		int N = sc.nextInt(); // reprensenta a quantidade de colunas
		
		int[][] mat = new int[M][N];
		
		for(int i=0; i<M; i+=1) {
			for(int j=0; j<N; j+=1){
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<M; i+=1) {
			for(int j=0; j<N; j+=1) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
