package it.beije.giacarta.gestionale;

public class Formatore extends Dipendente{

	public Formatore(String nome, String cognome, String dataNascita, String luogoNascita, 
			char sesso, String codiceFiscale, String numeroTelefono, String mail, String profiloSocial){
		super(nome, cognome, dataNascita, luogoNascita, sesso, codiceFiscale, numeroTelefono, mail, profiloSocial);
	}
	
	public Formatore(String nome, String cognome){
		super(nome, cognome);
	}
	
	void insegna() {
		System.out.println("Sto insegnando ... ");
	}
}
