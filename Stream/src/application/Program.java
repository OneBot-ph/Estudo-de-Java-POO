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
		long dias;
		
		// Formatação
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("=== Plataforma DEVSTREAM ===");
		
		System.out.print("Fuso Horário desejado: "+ ZoneId.systemDefault()+ "\n\n");

		System.out.print("Horário da live (UTC): ");
		String parse = sc.nextLine();

		// Instanciação  Global
		
		Instant datalive = Instant.parse(parse);
		
		// Formatação da hora global para hora Local, utilizando fmt
		
		System.out.println("Horário da live no seu relógio: "+ fmt.format(datalive) + "\n");
		
		// Cálculo para a diferença entre o horário da live e o local
		
		Instant zonetime = Instant.now();
		
		Duration dif = Duration.between(zonetime, datalive);
		
		dias = dif.toDaysPart();
		horas = dif.toHoursPart();
		minutos = dif.toMinutesPart();
		
		// Validação das datas (se negativo ou positivo)
		
		if(dif.isNegative()) {
			System.out.println("Status: A live já começou há: "
			+ Math.abs(dias)
			+ " dias " + Math.abs(horas) 
			+ " horas e "
			+ Math.abs(minutos) + " minutos");	
		}else {
				System.out.println("Status: A live começará em: "
				+ dias + " dias "
				+ horas + " horas e " 
				+ minutos + " minutos");	
		}
		
		sc.close();
	}

}
