package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {	

		LocalDate data04 = LocalDate.parse("2024-06-06");
		LocalDateTime data05 = LocalDateTime.parse("2024-06-06T01:30:26");
		Instant data06 = Instant.parse("2024-06-06T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:MM").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		System.out.println("data04 = " + data04.format(fmt1));
		System.out.println("data04 = " + fmt1.format(data04));
		System.out.println("data04 = " + data04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("data04 = " + data04.format(fmt1));
		System.out.println("data05 = " + data05.format(fmt2));
		
		System.out.println("data06 = " + fmt3.format(data06));
		
		System.out.println("data05 = " + data05.format(fmt4));
		
		
	}

}
