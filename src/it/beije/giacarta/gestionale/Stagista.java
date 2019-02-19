package it.beije.giacarta.gestionale;

public class Stagista extends Dipendente {

	public Stagista(String nome, String cognome, String dataNascita, String luogoNascita, 
			char sesso, String codiceFiscale, String numeroTelefono, String mail, String profiloSocial){
		super(nome, cognome, dataNascita, luogoNascita, sesso, codiceFiscale, numeroTelefono, mail, profiloSocial);
	}
	
	public Stagista(String nome, String cognome){
		super(nome, cognome);
	}
	
	void impara() {
		System.out.println("Sto imparando Java ... ");
	}
	
}
