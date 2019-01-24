package it.beije.esercizi;

public class ContaLettere {

	public static void main(String[] args) {
		String s = args[0];
		
		int c;
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			c = 0;
			
			//ciclo ogni volta sulla stringa
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == x) c++;
			}
			
//			//utilizzo indexOf(...) per la ricerca diretta sulla stringa
//			int fromIndex = 0;
//			int index = s.indexOf(x, fromIndex);
//			while (index != -1) {
//				c++;
//				fromIndex = index + 1;
//				index = s.indexOf(x, fromIndex);
//			}
			
			System.out.println(x + " : " + c);
		}
	}
}
