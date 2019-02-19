package it.beije.giacarta.gestionale;

public class Dipendente {
	
	private String nome;																				//dettagli anagrafica base di ogni dipendente
	private int id;
	private String cell;
	private String mail;
	private String indirizzo;
	
	
	public Dipendente(String nome, int id, String cell, String mail, String indirizzo) {				//costruttore di tutti i parametri
		this.nome = nome;
		this.id = id;
		this.cell = cell;
		this.mail = mail;
		this.indirizzo = indirizzo;
	}
	
	
	public String getNome() {																			//metodi get & eventuali set dei vari parametri
		return nome;
	}
	
	public int getId() {
		return id;
	}
	
	public String getCell() {
		return cell;
	}
	
	protected void setCell(String cell) {
		this.cell = cell;
	}
	
	public String getMail() {
		return mail;
	}
	
	protected void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	
	protected void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	

}