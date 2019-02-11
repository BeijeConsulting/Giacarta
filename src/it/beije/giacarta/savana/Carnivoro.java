package it.beije.giacarta.savana;

public interface Carnivoro {
	
	public abstract void mangioCarne();
	
	public default void mangioInteriora() {
		System.out.println("mangio la trippa...");
	}

}
