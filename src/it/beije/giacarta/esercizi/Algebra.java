package it.beije.giacarta.esercizi;

import java.util.Arrays;

public class Algebra {
	
	//nessuno deve poter istanziare la classe Algebra
	private Algebra() {}//blocco il costruttore
	
	//somma
//	public static long somma(long a, long b) {
//		return a + b;
//	}
	
	//somma
	public static long somma(long a1, long a2, long... addendi) {
		long somma = a1 + a2;
		for (long a : addendi) somma += a;// somma = somma + a;
		
		return somma;
	}
	public static double somma(double a1, double a2, double... addendi) {
		double somma = a1 + a2;
		for (double a : addendi) somma += a;// somma = somma + a;
		
		return somma;
	}

	//sottrazione
	public static long sottrazione(long minuendo, long sottraendo, long... sottraendi) {
		long sottrazione = minuendo - sottraendo;
		for (long s : sottraendi) sottrazione -= s;//sottrazione = sottrazione - s;
		return sottrazione;
	}
	public static double sottrazione(double minuendo, double sottraendo, double... sottraendi) {
		double sottrazione = minuendo - sottraendo;
		for (double s : sottraendi) sottrazione -= s;//sottrazione = sottrazione - s;
		return sottrazione;
	}


	public static void main(String[] args) {
		System.out.println(Algebra.somma(4,6,70));
		System.out.println(Algebra.sottrazione(42,6,5));
	}
}
