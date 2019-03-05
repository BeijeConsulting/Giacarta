package it.beije.esempi.visibilita.altropackage;

import it.beije.esempi.visibilita.Bird;

public class Swan extends Bird{

	// floatInWater()
	
	public void swim() {
		floatInWater(); // package access to superclass
	}
	public void helpOtherSwanSwim() {
		Swan other = new Swan();
		other.floatInWater(); // package access to superclass
	}
	public void helpOtherBirdSwim() {
		Bird other = new Bird();
		other.floatInWater(); // DOES NOT COMPILE
	}
	
	public String toString() {
		return "in Swan";
	}
	
	public static void main(String[] args) {
		Swan swan = new Swan();
		swan.swim();
		swan.helpOtherSwanSwim();
		swan.helpOtherBirdSwim();
	}

}
