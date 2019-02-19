package it.beije.giacarta.quiz;

public class Domanda implements StrutturaDomanda {

	private int id;
	private int chapter;
	private String testo;
	private String risposta;
	
	public Domanda(int id, int chapter, String testo, String risposta) {
		this.id = id;
		this.chapter = chapter;
		this.testo = testo;
		this.risposta = risposta;
	}
	
	public int getId() {
		return id;
	}
	
	public int getChapter() {
		return chapter;
	}
	
	public String getTesto() {
		return testo;
	}
	
	public String getRisposta() {
		return risposta;
	}
	
}
