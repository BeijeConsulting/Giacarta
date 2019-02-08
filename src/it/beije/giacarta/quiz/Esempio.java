package it.beije.giacarta.quiz;

import java.util.Scanner;

public class Esempio {

	static String domanda = "Which of the following can replace line 2 to make this code compile? (Choose all that apply)\n\n"+
"\t1: import java.util.*;\n"+
"\t2: // INSERT CODE HERE\n"+
"\t3: public class Imports {\n"+
"\t4:   public void method(ArrayList<String> list) {\n"+
"\t5:     sort(list);\n"+
"\t6:   }\n"+
"\t7: }\n\n"+
"A. import static java.util.Collections;\n"+
"B. import static java.util.Collections.*;\n"+
"C. import static java.util.Collections.sort(ArrayList<String>);\n"+
"D. static import java.util.Collections;\n"+
"E. static import java.util.Collections.*;\n"+
"F. static import java.util.Collections.sort(ArrayList<String>);\n";
	
	static String rispostaEsatta = "BE";
	
	public static boolean controllaRisposta(String rispostaEsatta, String risposta) {
		for (int i = 0; i < risposta.length(); i++) {
			char c = risposta.charAt(i);
			if (c == ' ' || c == ',') continue;
			if (rispostaEsatta.indexOf(c) < 0) {
				return false;//se non trovo la risposta termino il ciclo
			} else {
				//tolgo risposta esatta da elenco risposte esatte per evitare duplicati
				rispostaEsatta = rispostaEsatta.replace(Character.toString(c), "");
			}
		}
		
		return rispostaEsatta.length() == 0;
	}
			
	public static void main(String[] args) {
		System.out.println(domanda);
		Scanner s = new Scanner(System.in);
		String risposta = s.nextLine().trim().toUpperCase();
		
		boolean corretta = controllaRisposta(rispostaEsatta, risposta);
		
		System.out.println("\nla tua risposta : " + risposta + "\n");
		if (corretta) {
			System.out.println("ESATTO!!! :)");
		} else {
			System.out.println("La risposta esatta era " + rispostaEsatta + " :(");
		}
		
		s.close();
	}

}
