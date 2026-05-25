package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.Instant;

import java.time.format.DateTimeFormatter;

public class DataHora {

	public static void main(String[] args) {

//------------------------
		
		int yyyy = 1998, mm = 12, dd = 02;
		
		
		LocalDate d000 = LocalDate.of(yyyy, mm, dd);
		
		System.out.println("d000 = "+ d000.toString());
		
		LocalDateTime d002 = LocalDateTime.of(2077, 12, 3, 1, 30);
		
		System.out.println("d002 = "+ d002.toString());
		
//------------------------
		
		LocalDate d01 = LocalDate.now();
		
		System.out.println("d01 = "+ d01.toString());
		
		LocalDateTime d02 = LocalDateTime.now();
			
		System.out.println("d02 = "+ d02.toString());
		
		Instant d03 = Instant.now();
		
		System.out.println("d03 = "+ d03.toString());
		
//------------------------

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d04 = LocalDate.parse("20/12/2006 01:30", fmt1);
		
		System.out.println("d04 = "+ d04.toString());
		
//------------------------

		LocalDate d05 = LocalDate.parse("2006-12-20"); 
		
		System.out.println("d05 = "+ d05.toString());
		
		LocalDateTime d06 = LocalDateTime.parse("1983-10-25T15:35:30");
		
		System.out.println("d06 = "+ d06.toString());
		
		Instant d07 = Instant.parse("1001-07-29T09:00:15Z");
		
		System.out.println("d07 = "+ d07.toString());
		
		Instant d08 = Instant.parse("1200-12-20T16:12:45-03:00");
		
		System.out.println("d08 = "+ d08.toString());
		
//------------------------

		Instant d09 = Instant.parse("1983-03-12T12:45:15Z");
		
		LocalDateTime d10 = LocalDateTime.ofInstant(d09, ZoneId.systemDefault());
		
		System.out.println("d10 = "+ d10.toString());

//------------------------
		
		System.out.println("//------------------------\n");
		
		System.out.println("d06 = "+ d06.toString());
		
		System.out.println("");
		
		System.out.println("d06 em getDayOfMonth = "+ d06.getDayOfMonth());
		
		System.out.println("d06 gssetMonthValue = "+ d06.getMonthValue());
		
		System.out.println("d06 getYear = "+ d06.getYear());
		
		System.out.println("d06 = getHour "+ d06.getHour());
		
		System.out.println("d06 em getMinute = "+ d06.getMinute());
		
		System.out.println("//------------------------\n");

//------------------------
		
		System.out.println("Cálculos\n");
		
		LocalDate cal01 = d05.plusDays(7); 
		
		System.out.println("cal01 = "+ cal01.toString());
		
		LocalDate cal02 = d05.minusDays(8);
		
		System.out.println("cal02 = "+ cal02.toString());
		
		LocalDateTime cal03 = d06.plusHours(2);
		
		System.out.println("cal03 = "+ cal03.toString());
		
		LocalDateTime cal04 = d06.plusMinutes(12);
		
		System.out.println("cal04 = "+ cal04.toString());
		
		
		
		
	}

}
