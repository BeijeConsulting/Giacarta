package it.beije.giacarta.gestionale;

import java.time.Period;

public class Programmatore extends Dipendente{
	private String linguaggi;
	private char grado;
	private String specializzazione;
	private String cliente;
	private Period contratto;																	//periodo contratto in giorni mancanti alla fine, bisogna contare anche ferie, permessi e malattie
	
	public Programmatore(String nome, int id, String cell, String mail, String indirizzo, String linguaggi, char grado, String specializzazione, String cliente, int giorni) {					//costruttore
		super(nome, id, cell, mail, indirizzo);
		addLinguaggi(linguaggi);
		setGrado(grado);
		setSpecializzazione(specializzazione);
		setCliente(cliente);
		setContratto(giorni);
	}

	public String getLinguaggi() {																//metodi get e set
		return linguaggi;
	}
	
	public void addLinguaggi(String linguaggi) {												//fatto a stringbuilder a causa di eccezioni per appendere i vari linguaggi di programmaziine man mano
		StringBuilder s = new StringBuilder();
		s.append(linguaggi);
		this.linguaggi = s.toString();
	}

	public char getGrado() {
		return grado;
	}

	public void setGrado(char grado) {
		if(grado != 'S'|| grado != 'M' || grado != 's'|| grado != 'm') {
			grado = 'J';
		} else if(grado == 'S'|| grado == 's') {
			grado = 'S';
		} else {
			grado = 'M';
		}	
		this.grado = grado;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Period getContratto() {
		return contratto;
	}

	public void setContratto(int giorni) {
		this.contratto = Period.ofDays(giorni);
	}
	
//	public void scalaGiorni() {																	//togli un giorno ogni volta che viene chiamato
//		this.contratto.minusDays(1);
//	}

}


