package it.beije.giacarta.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TwistCSV {
	
	public static List<String> turnCSV (List<String> strings){
		
		List<String> rubrica = new ArrayList<String>();
		rubrica.add("id,telefono,nome,cognome");
		StringBuilder sb = null;

		int id;
		String nome;
		String cognome;
		String telefono;
		boolean check = false;

		//ciclo sull'array di stringhe
		for (String row : strings) {
			if (check == false) {
				check = true;
				continue;
			}
//			System.out.println(row);

			sb =  new StringBuilder();

			//separo la riga nelle ulteriori stringhe separate da ',' 
			StringTokenizer tokenizer = new StringTokenizer(row, ",");

			//carico i valori nelle variabili di appoggio
			id = Integer.parseInt(tokenizer.nextToken());
			cognome = tokenizer.nextToken();
			nome = tokenizer.nextToken();
			telefono = tokenizer.nextToken();
			sb.append(id).append(',').append(telefono).append(',').append(nome).append(',').append(cognome).append(',');
			rubrica.add(sb.toString());

		}
		return rubrica;
	}

	public static void main(String[] args) throws Exception{

		List<String> strings = CSVutils.getFileAsStrings("E:\\rubrica.csv");		//ottengo l'array di stringhe contenente le righe del CSV
		
		System.out.println(ExtractCSV.writeCSV(turnCSV(strings),"E:\\rubrica_bis.csv"));		//prima viene ruotato il CSV nel modo scelto e in seguito viene
																								//scritto in un nuovo file CSV ritornando l'esito della scrittura in boolean
		
	}

}
