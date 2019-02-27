package it.beije.giacarta.quiz;

import java.util.List;
import java.util.Scanner;


public class Esempio {

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
		
		List<Domanda> domande = Utils.readFileDomande("C:\\Users\\Mosca\\git\\Giacarta\\src\\it\\beije\\giacarta\\quiz\\domande.xml");
		
		Scanner s = new Scanner(System.in);
		for (Domanda d : domande) {
			System.out.println("Chapter " + d.getChapter() + " domanda " + d.getId());
			System.out.println(d.getTesto());
			Risposta risposta = d.getRisposta();

			String rispostaUtente = s.nextLine().trim().toUpperCase();
			risposta.setRispostaUtente(rispostaUtente);
			System.out.println("\n###############################################\n");
			
			//break;
		}
		s.close();
		
		
		//verifico risposte
		for (Domanda d : domande) {
			boolean corretta = controllaRisposta(d.getRisposta().getRispostaEsatta(), d.getRisposta().getRispostaUtente());
			
			System.out.println("DOMANDA " + d.getId() + " : la tua risposta : " + d.getRisposta().getRispostaUtente() + "\n");
			if (corretta) {
				System.out.println("ESATTO!!! :)");
			} else {
				System.out.println("La risposta esatta era " +  d.getRisposta().getRispostaEsatta() + " :(");
			}
			
			System.out.println("\n");
		}
		
	}

}
