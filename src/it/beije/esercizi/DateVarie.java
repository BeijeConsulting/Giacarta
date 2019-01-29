package it.beije.esercizi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

public class DateVarie {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		
		int giorno = Integer.parseInt(args[0]);
		int mese = new Integer(args[1]);
		int anno = Integer.parseInt(args[2]);
		
		//int differenzaGiorni = Integer.parseInt(args[3]);
		
		LocalDate data = LocalDate.of(anno, mese, giorno);
		System.out.println(data);
		
		//data = data.plusDays(differenzaGiorni);
		System.out.println(data);
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
		System.out.println(dateTimeFormatter.format(data));
		System.out.println(data.format(dateTimeFormatter));
		
		System.out.println(data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN));
	}
}
