package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate data01 = LocalDate.now();
		LocalDateTime data02 = LocalDateTime.now();
		Instant data03 = Instant.now();

		LocalDate data04 = LocalDate.parse("2024-06-06");
		LocalDateTime data05 = LocalDateTime.parse("2024-06-06T01:30:26");
		Instant data06 = Instant.parse("2024-06-06T01:30:26Z");
		Instant data07 = Instant.parse("2024-06-06T01:30:26-03:00");

		LocalDate data08 = LocalDate.parse("06/06/2024", fmt1);
		LocalDateTime data09 = LocalDateTime.parse("06/06/2024 01:30", fmt2);
		
		LocalDate data10 = LocalDate.of(2024, 6, 6);
		LocalDateTime data11 = LocalDateTime.of(2024, 6, 6, 23, 29);

		System.out.println("Data 01 = " + data01);
		System.out.println("Data 02 = " + data02);
		System.out.println("Data 03 = " + data03);
		System.out.println("Data 04 = " + data04);
		System.out.println("Data 05 = " + data05);
		System.out.println("Data 06 = " + data06);
		System.out.println("Data 07 = " + data07);
		System.out.println("Data 08 = " + data08);
		System.out.println("Data 09 = " + data09);
		System.out.println("Data 10 = " + data10);
		System.out.println("Data 11 = " + data11);
	}

}
