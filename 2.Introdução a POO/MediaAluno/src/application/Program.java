package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Aluno aluno = new Aluno();
		System.out.println("Nome do aluno:");
		aluno.nome = sc.nextLine();
		System.out.println("Notas do aluno:");
		aluno.nota1Trimestre = sc.nextDouble();
		aluno.nota2Trimestre = sc.nextDouble();
		aluno.nota3Trimestre = sc.nextDouble();	
		
		if(aluno.mediaFinal() >=60) {
			System.out.printf("Media Final: %.2f%n" , aluno.mediaFinal());
			System.out.println("Aprovado");
		}
		else {
			System.out.printf("Media Final: %.2f%n " , aluno.mediaFinal());
			System.out.println("Reprovado");
			System.out.printf("Faltam: %.2f%n" , aluno.notaRestante(), " Pontos");
		}

		sc.close();
	}

}
