package it.beije.esempi.visibilita;

public class Bird2 {
	
	public static void main(String[] args) {
		System.out.println("Bird2 START");
		Bird bird = new Bird();
		bird.floatInWater();
	}
	
	public String toString() {
		return "in Bird2";
	}
}
