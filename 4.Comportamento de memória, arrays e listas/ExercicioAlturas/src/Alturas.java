import java.util.Locale;
import java.util.Scanner;

public class Alturas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double somaDasAlturas = 0.0;
		double alturaMedia = 0.0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int index=0; index<n; index+=1) {
			System.out.println("Dados da " + (index + 1) + " pessoa: ");
			System.out.print("Nome: ");
			nomes[index] = sc.next();
			System.out.print("Idade: ");
			idades[index] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[index] = sc.nextDouble();
		}

		for (int index=0; index <n; index+=1) {			
			somaDasAlturas += alturas[index];					
		}
			
		alturaMedia = somaDasAlturas / n;
		
		int contagemPessoasMenorde6anos = 0;
		
		for(int index=0; index<n ; index+=1) {
			if(idades[index] < 16) {
				contagemPessoasMenorde6anos += 1; 
			}
		}
		
		double porcentagem = contagemPessoasMenorde6anos * 100.0 / n;		
		
		System.out.printf("Altura media: %.2f%n" , alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n" , porcentagem);
		
		for(int index=0; index<n; index+=1) {
			if(idades[index] < 16){
				System.out.println(nomes[index]);
			}
		}
		sc.close();
	}
}
