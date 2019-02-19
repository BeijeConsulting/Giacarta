package it.beije.giacarta.gestionale;

public class HR extends Dipendente{

	public HR(String nome, String cognome, String dataNascita, String luogoNascita, 
			char sesso, String codiceFiscale, String numeroTelefono, String mail, String profiloSocial){
		super(nome, cognome, dataNascita, luogoNascita, sesso, codiceFiscale, numeroTelefono, mail, profiloSocial);
	}
	
	public HR(String nome, String cognome){
		super(nome, cognome);
	}
	
	void colloquio() {
		System.out.println("Sto facendo un colloquio ... ");
	}
	
	//piano crescita
	void getStoricoContratti(Dipendente dip) {
		System.out.println("Storico contratti di "+dip.getNome()+" "+dip.getCognome()+": \n"+dip.getContratti());
	}
	
}
