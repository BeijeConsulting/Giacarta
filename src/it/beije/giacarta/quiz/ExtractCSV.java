package it.beije.giacarta.quiz;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ExtractCSV {
	
	private static Connection conn = null;
	
	//metodo che scrive il file csv a partire da una list di stringhe contenente le righe del csv
	public static boolean writeCSV(List<String> rubrica, String path) {
		boolean result = false;
		try
		{
			FileWriter fw = new FileWriter (path);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter outFile = new PrintWriter(bw);
			
			for (String ins : rubrica) {
				outFile.println(ins); 
//				System.out.println(ins);
			}

			outFile.close();
			result = true;
		}
		catch (FileNotFoundException exception){}
		catch (IOException exception){}
	
		return result;
	
	}

	public static void main(String[] args) {
		
		List<String> rubrica = new ArrayList<String>();
		rubrica.add("id,nome,cognome,telefono");
		Statement stmt = null;
		ResultSet rset= null;

		try {
			
			StringBuilder sb = null;
			conn = DButils.getConnection();

			String query = "SELECT * FROM rubrica";
			
			stmt = conn.createStatement();

			rset = stmt.executeQuery(query);

			while (rset.next()) {
				
				sb = new StringBuilder();
				sb.append(rset.getInt("id")).append(',');
				String nome = rset.getString("nome");
				sb.append(rset.getString("cognome")).append(',');
				sb.append(nome).append(',');
				sb.append(rset.getString("telefono"));
				
				rubrica.add(sb.toString());
			}

		}
		catch (SQLException se) {
			System.out.println("SQLError: " + se.getMessage() + " code: " + se.getErrorCode());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(writeCSV(rubrica,"E:\\rubrica.csv"));
		
		}

}
