package it.beije.esercizi;


public class ContaLettereEsclusivo {

	public static void main(String[] args) {
		String s = args[0];
		
		int c;
		String lettere = s; //new String(s);
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			c = 0;
			
			//approccio esclusivo
			if (lettere.contains(Character.toString(x))) {
				//ciclo ogni volta sulla stringa
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == x) c++;
				}
				
				System.out.println(x + " : " + c);
				
				lettere = lettere.replace(Character.toString(x), "");
			}			
		}
	}
}
