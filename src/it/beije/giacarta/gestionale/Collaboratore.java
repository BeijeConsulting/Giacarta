package it.beije.giacarta.gestionale;

public class Collaboratore extends Programmatore {

	public Collaboratore(String nome, int id, String cell, String mail, String indirizzo, String linguaggi, char grado, String specializzazione, String cliente, int giorni) {					//costruttore
		super(nome, id, cell, mail, indirizzo, linguaggi, grado, specializzazione, cliente, giorni);
	}
	
	//gestione paghe partita iva

}