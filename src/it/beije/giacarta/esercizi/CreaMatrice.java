package it.beije.giacarta.esercizi;

import java.util.Arrays;

public class CreaMatrice {

	public static void main(String[] args) {
		//inizializzo array
		char[][] array = new char[args.length][];
		
		//for (int i = 0; i < args.length; i++) {
		for (int i = 0; i < array.length; i++) {//vanno bene entrambe
			array[i] = new char[args[i].length()];
			
			for (int j = 0; j < args[i].length(); j++) {
				array[i][j] = args[i].charAt(j);
			}
			
			System.out.println(Arrays.toString(array[i]));
		}
	}

}
