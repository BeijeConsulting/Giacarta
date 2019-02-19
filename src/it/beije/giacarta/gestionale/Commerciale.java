package it.beije.giacarta.gestionale;

public class Commerciale extends Dipendente {

	public Commerciale(String nome, String cognome, String dataNascita, String luogoNascita, 
			char sesso, String codiceFiscale, String numeroTelefono, String mail, String profiloSocial){
		super(nome, cognome, dataNascita, luogoNascita, sesso, codiceFiscale, numeroTelefono, mail, profiloSocial);
	}
	
	public Commerciale(String nome, String cognome){
		super(nome, cognome);
	}
	
	void gestisci() {
		System.out.println("Sto gestendo ... ");
	}
	
}
