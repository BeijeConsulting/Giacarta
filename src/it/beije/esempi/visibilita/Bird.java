package it.beije.esempi.visibilita;

public class Bird {

	public void floatInWater() { // protected access
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "in Bird";
	}
}
