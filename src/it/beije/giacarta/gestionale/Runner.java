package it.beije.giacarta.gestionale;

public class Runner {

	public static void main(String[] args) {
//		Stagista s1 = new Stagista("Chiara", "Carlucci");
//		System.out.println(s1.getNome()+" "+s1.getCognome());
//		s1.impara();
//		
//		Stagista s2 = new Stagista("Michael", "Baronchelli");
//		System.out.println(s2.getNome()+" "+s2.getCognome());
		
		Stagista s3 = new Stagista("Giovanni", "Ciliento","01-08-1996","Torino",'M',"GVNCLT35","33312345","gio.cil@gmail.com",
				"facebook/giovanni.ciliento56");
		s3.setNumeroTelefono("3333359592");
		System.out.println(s3.toString());
		s3.setManager(true);
		System.out.println(s3.toString());
		
		Contratto c1 = new Contratto(6, 1200, 1);
		s3.addContratto(c1);
		Contratto c2 = new Contratto(6, 2400, 2);
		s3.addContratto(c2);
		
		HR personale = new HR("Chiara","Balsamini");
		personale.getStoricoContratti(s3);
		
		
	}
	
	
	
}
