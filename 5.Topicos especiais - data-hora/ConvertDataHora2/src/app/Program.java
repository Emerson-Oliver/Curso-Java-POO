package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		
		LocalDate data01 = LocalDate.parse("2022-07-20");
		LocalDateTime data02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant data03 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate resultado1 = LocalDate.ofInstant(data03, ZoneId.systemDefault());
		LocalDate resultado2 = LocalDate.ofInstant(data03, ZoneId.of("Portugal"));
		LocalDateTime resultado3 = LocalDateTime.ofInstant(data03, ZoneId.systemDefault());
		LocalDateTime resultado4 = LocalDateTime.ofInstant(data03, ZoneId.of("Portugal"));
		
		
		System.out.println("Resultado1 = " + resultado1);
		System.out.println("Resultado2 = " + resultado2);
		System.out.println("Resultado3 = " + resultado3);
		System.out.println("Resultado4 = " + resultado4);
		
		System.out.println("data01 dia = " + data01.getDayOfMonth());
		System.out.println("data02 mes = " + data01.getMonthValue());
		System.out.println("data02 mes = " + data01.getYear());
		System.out.println("data05 hora = " + data02.getHour());
		System.out.println("data05 hora = " + data02.getMinute());
	}

}
