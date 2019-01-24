package it.beije.esercizi;

public class ContaLettereInclusivo {

	public static void main(String[] args) {
		String s = args[0];
		
		int c;
		String lettere = "";
		
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			c = 0;
			
			//approccio inclusivo
			if ( ! lettere.contains(Character.toString(x)) ) {
				//ciclo ogni volta sulla stringa
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == x) c++;
				}
				
				System.out.println(x + " : " + c);
				
				lettere += x;
			}
		}
	}
}
