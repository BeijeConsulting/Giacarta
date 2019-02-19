package it.beije.giacarta.gestionale;

public class Contratto {

	String tipologia; //aggiungere
	int durata;
	int stipendio;
	int livello;

	
	public Contratto(int durata, int stipendio, int livello) {
		this.durata = durata;
		switch(livello) {
		case 1:
			if(stipendio>1000 && stipendio<2000) this.stipendio = stipendio;
			break;
		case 2:
			if(stipendio>=2000 ) this.stipendio = stipendio;
		}
		
		this.livello = livello;
		
	}


	public int getDurata() {
		return durata;
	}


	public void setDurata(int durata) {
		this.durata = durata;
	}


	public int getStipendio() {
		return stipendio;
	}


	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}


	public int getLivello() {
		return livello;
	}


	public void setLivello(int livello) {
		this.livello = livello;
	}
	
	
	
	
	
}
