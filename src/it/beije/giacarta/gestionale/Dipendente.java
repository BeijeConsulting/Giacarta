package it.beije.giacarta.gestionale;

import java.util.ArrayList;

public abstract class Dipendente {
	
	String nome;
	String cognome;
	String dataNascita;
	String luogoNascita;
	char sesso;
	String codiceFiscale;
	String numeroTelefono;
	String mail;
	String profiloSocial;
	boolean manager;
	ArrayList<Contratto> contratti;

	public Dipendente() {
		
	}
	
	public Dipendente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

	public Dipendente(String nome, String cognome, String dataNascita, String luogoNascita, 
			char sesso, String codiceFiscale, String numeroTelefono, String mail, String profiloSocial) {
		this.nome= nome;
		this.cognome= cognome;
		this.dataNascita= dataNascita;
		this.luogoNascita= luogoNascita;
		this.sesso= sesso;
		this.codiceFiscale= codiceFiscale;
		this.numeroTelefono= numeroTelefono;
		this.mail= mail;
		this.profiloSocial= profiloSocial;
		manager = false;
		contratti = new ArrayList<Contratto>();
	}
	
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getDataNascita() {
		return dataNascita;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}
	
	public char getSesso() {
		return sesso;
	}
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getProfiloSocial() {
		return profiloSocial;
	}
	public void setProfiloSocial(String profiloSocial) {
		this.profiloSocial = profiloSocial;
	}
	
	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}
	
	public void addContratto(Contratto c) {
		contratti.add(c);
	}
	
	public String getContratti() {
		StringBuilder b = new StringBuilder();
		for (Contratto c : contratti) {
			b.append("durata : ").append(c.durata).append(" | ");
			b.append("stipendio : ").append(c.stipendio).append(" | ");
			b.append("livello : ").append(c.livello).append("\n");
		}
		
		return b.toString();
	}
	
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("nome : ").append(nome).append(" | ");
		b.append("cognome : ").append(cognome).append(" | ");
		b.append("data di nascita : ").append(dataNascita).append(" | ");
		b.append("luogo di nascita : ").append(luogoNascita).append(" | ");
		b.append("sesso : ").append(sesso).append(" | ");
		b.append("codice fiscale : ").append(codiceFiscale).append(" | ");
		b.append("numero telefono : ").append(numeroTelefono).append(" | ");
		b.append("email : ").append(mail).append(" | ");
		b.append("profilo social : ").append(profiloSocial).append(" | ");
		b.append("manager : ").append(manager);
		
		return b.toString();
	}
	
}
