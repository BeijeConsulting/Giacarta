package it.beije.giacarta.savana;

public interface Erbivoro {
	
	public default void mangioErba() {
		System.out.println("L'insalata è buona");
	}
	
}
