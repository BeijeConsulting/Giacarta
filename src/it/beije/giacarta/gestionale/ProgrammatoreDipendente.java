package it.beije.giacarta.gestionale;

public class ProgrammatoreDipendente extends Dipendente{

	public ProgrammatoreDipendente(String nome, String cognome, String dataNascita, String luogoNascita, 
			char sesso, String codiceFiscale, String numeroTelefono, String mail, String profiloSocial){
		super(nome, cognome, dataNascita, luogoNascita, sesso, codiceFiscale, numeroTelefono, mail, profiloSocial);
	}
	
	public ProgrammatoreDipendente(String nome, String cognome){
		super(nome, cognome);
	}
	
	
}
