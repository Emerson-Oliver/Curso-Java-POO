package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate data01 = LocalDate.parse("2022-07-20");
		LocalDateTime data02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant data03 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeeklocalDate = data01.minusDays(7);
		LocalDate nextWeeklocalDate = data01.plusDays(7);
		
		LocalDateTime pastWeeklocalDateTime = data02.minusDays(7);
		LocalDateTime nextWeeklocalDateTime = data02.plusDays(7);
		

		Instant pastWeekInstant = data03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = data03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeeklocalDate = " +  pastWeeklocalDate);
		System.out.println("nextWeeklocalDate = " +  nextWeeklocalDate);
		System.out.println("pastWeeklocalDateTime = " +  pastWeeklocalDateTime);
		System.out.println("nextWeeklocalDateTime = " +  nextWeeklocalDateTime);
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeeklnstant = " + nextWeekInstant);
		
		Duration tempo1 = Duration.between(pastWeeklocalDateTime, data02);
		
		System.out.println("Tempo1 dias = " + tempo1.toDays());
	

	}

}
