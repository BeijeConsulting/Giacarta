package it.beije.giacarta.gestionale;

public class ProgrammatoreCollaboratore extends Dipendente{

	String partitaIVA;
	
	public ProgrammatoreCollaboratore(String nome, String cognome, String dataNascita, String luogoNascita, 
			char sesso, String codiceFiscale, String numeroTelefono, String mail, String profiloSocial, String partitaIVA){
		super(nome, cognome, dataNascita, luogoNascita, sesso, codiceFiscale, numeroTelefono, mail, profiloSocial);
		this.partitaIVA = partitaIVA;
	}
	
	public ProgrammatoreCollaboratore(String nome, String cognome){
		super(nome, cognome);
	}
	
}
