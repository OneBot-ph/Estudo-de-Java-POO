package application;

import java.util.Scanner;
import java.time.ZoneId;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horas, minutos;
		Long dias;
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("=== Plataforma DEVSTREAM ===");
		
		System.out.print("Fuso Horário desejado: "+ ZoneId.systemDefault()+ "\n");

		System.out.println("");	
		
		System.out.print("Horário da live (UTC): ");
		String parse = sc.nextLine();
		
		Instant datalive = Instant.parse(parse);
		
		System.out.println("Horário da live no seu relógio: "+ fmt.format(datalive) + "\n");
		
//-----------------------
		
		Instant zonetime = Instant.now();
		
		Duration dif = Duration.between(zonetime, datalive);
		
		dias = dif.toDaysPart();
		horas = dif.toHoursPart();
		minutos = dif.toMinutesPart();

		
		
		if(dias < 0 && horas < 0 && minutos < 0) {
			System.out.println("Status: A live já começou à: "+ Math.abs(dias)+ " dias " + Math.abs(horas) + " horas e " + Math.abs(minutos) + " minutos");	
		}else {
				System.out.println("Status: A live começará em: "+ dias + " dias " + horas + " horas e " + minutos + " minutos");	
		}
		
		sc.close();
	}

}
