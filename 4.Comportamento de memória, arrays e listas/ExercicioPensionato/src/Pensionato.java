import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent rent = new Rent("Maria", "maria@gmail.com");

		System.out.print("Quantos quartos seram alugados? ");
		int n = sc.nextInt();

		Rent[] vect = new Rent[10];

		for (int index = 1; index <= n; index += 1) {
			System.out.println();
			System.out.println("Aluguel #" + index + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int roomNumber = sc.nextInt();

			Rent rnt = new Rent(name, email);

			vect[roomNumber] = rnt;
		}
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int index = 0; index < 10; index += 1) {
			if (vect[index] != null) {
				System.out.println(index + ": " + vect[index]);
			}
		}
		sc.close();
	}

}
