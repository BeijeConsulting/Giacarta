package it.beije.esercizi;

public class Loop {

	public static void main(String[] args) {// pippo pluto paperino topolino minnie
//		for (String c : args) {//for each
//			System.out.println(c);
//			if (c.equals("paperino")) {
//				break;
//			}
//		}
//		
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//			if (args[i].equals("paperino")) {
//				//break;
//				i = args.length; //forzo uscita da ciclo
//			}
//		}
//		
//		int i = 0;
//		boolean trovato = false;
//		while (!trovato && i < args.length) {
//			System.out.println(args[i]);
//			if (args[i].equals("paperino")) {
//				trovato = true;
//			}
//			i++;
//		}
//		
//		int j = 0;
//		do {
//			System.out.println(args[j]);
//		} while (!args[j++].equals("paperino") && j < args.length);
//
//		j = 0;
//		trovato = false;
//		do {
//			System.out.println(args[j]);
//			if (args[j++].equals("paperino")) {
//				trovato = true;
//			}
//		} while (!trovato && j < args.length);
//		
//
//		//stampo FINO a paperino
//		int y = 0;
//		while (!args[y].equals("paperino") && y < args.length) {
//			System.out.println(args[y]);
//			y++;
//		}

		for (int i = 0; i < args.length; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(args[i]);
		}

	}

}
