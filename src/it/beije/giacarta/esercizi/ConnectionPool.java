package it.beije.giacarta.esercizi;

public class ConnectionPool {
	
	private static Risorsa[] risorseDisponibili = new Risorsa[10];
	
	static {
		for (int i = 0; i < risorseDisponibili.length; i++) {
			risorseDisponibili[i] = new Risorsa(i);
		}
	}
	
	public static Risorsa getRisorsa() {
		for (int i = 0; i < risorseDisponibili.length; i++) {
			Risorsa risorsa = risorseDisponibili[i];
			if (risorsa.isDisponibile()) {
				risorsa.setDisponibile(false);
				return risorsa;
			}
		}
		
		return null;
	}
	
	public static void releaseRisorsa(Risorsa risorsa) {
		risorsa.setDisponibile(true);
	}

}

class Risorsa {
	private int index;
	private boolean disponibile;
	//private Connection conn;
	
	public Risorsa(int i) {
		this.index = i;
		this.disponibile = true;
	}

	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}

	public boolean isDisponibile() {
		return disponibile;
	}
	public void setDisponibile(boolean disponibile) {
		this.disponibile = disponibile;
	}
	
}
