import java.util.Scanner;

public class PessoaMaisVelha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = scanner.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];		
		
		for(int index=0; index<n; index+=1) {
			System.out.println("Dados da " + (index + 1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[index] = scanner.next();
			System.out.print("Idade:  ");
			idades[index] = scanner.nextInt();
		}
		
		int maiorIdade = 0;
		maiorIdade = idades[0];
		int posicaoMaiorIdade = 0;
		
		for(int index=0; index<n; index+=1) {
			if(idades[index] > maiorIdade) {
				maiorIdade = idades[index];
				posicaoMaiorIdade = index;
			}
		}		
		
		System.out.printf("Pessoa mais velha: " + nomes[posicaoMaiorIdade]);
		
		scanner.close();
	}

}
