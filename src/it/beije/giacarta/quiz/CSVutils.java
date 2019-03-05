package it.beije.giacarta.quiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CSVutils {
	
//	CREATE TABLE rubrica (
//	  ID int NOT NULL AUTO_INCREMENT,
//	  nome VARCHAR(100),
//	  cognome VARCHAR(100),
//	  telefono VARCHAR(20),
//	  PRIMARY KEY (ID)
//	)

	public static List<String> getFileAsStrings(String pathFile) throws Exception {
		List<String> content = new ArrayList<String>();
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(pathFile));
			
			while(reader.ready()) {
				content.add(reader.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				reader.close();
			} catch (IOException ioException) {
				ioException.printStackTrace();
			}
		}
		
		return content;
	}
	
	public static void main (String[] args) throws Exception {
		//leggo il file e carico ciascuna riga in un array di stringhe
		List<String> strings = CSVutils.getFileAsStrings("C:\\temp\\rubrica.txt");

		int id;
		String nome;
		String cognome;
		String telefono;
		StringBuilder insert;
		Connection conn = null;
		Statement stmt = null;

		//ciclo sull'array di stringhe
		for (String row : strings) {
			System.out.println(row);
			
			//separo la riga nelle ulteriori stringhe separate da ';' 
			StringTokenizer tokenizer = new StringTokenizer(row, ";");
//			while (tokenizer.hasMoreTokens()) {
//				System.out.println(tokenizer.nextToken());
//			}
			
			//carico i valori nelle variabili di appoggio
			id = Integer.parseInt(tokenizer.nextToken());
			nome = tokenizer.nextToken();
			cognome = tokenizer.nextToken();
			telefono = tokenizer.nextToken();
			System.out.println("id : " + id);
			System.out.println("nome : " + nome);
			System.out.println("cognome : " + cognome);
			System.out.println("telefono : " + telefono);
			
			//preparo la query per l'inserimento
			insert = new StringBuilder("INSERT INTO rubrica (nome, cognome, telefono) VALUES ('");
			insert.append(nome).append("','");
			insert.append(cognome).append("','");
			insert.append(telefono).append("')");
			System.out.println(insert.toString());
			
			//mi connetto al DB e lancio la query
			try {
				conn = DButils.getConnection();
				stmt = conn.createStatement();
				stmt.execute(insert.toString());
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			} finally {
				try {
					stmt.close();
					conn.close();
				} catch (SQLException sqlException) {
					sqlException.printStackTrace();
				}
			}
			
			System.out.println();
		}
		
	}
	
//	public static void main (String[] args) throws Exception {
//		File file = new File("C:\\temp\\pippo.txt");
//		//System.out.println(file.exists());		
//		//FileWriter fw = new FileWriter(file);
//		
//		FileReader fileReader = null;
//		BufferedReader reader = null;
//		try {
//			fileReader = new FileReader(file);
//			reader = new BufferedReader(fileReader);
//			
//			while(reader.ready()) {
//				System.out.println(reader.readLine());
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw e;
//		} finally {
//			try {
//				reader.close();
//				fileReader.close();
//			} catch (IOException ioException) {
//				ioException.printStackTrace();
//			}
//		}
//	}

}
