package location.master.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import location.master.requetes.Requetes;

public class ClientModif {
	
public void modifier(String cin,int codecate,String nom,String prenom,String adresse,int tel) {
		
		Connection conn = null;
		Statement selectStatement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/location","root","");
			System.out.println("�a passe");
			 
			selectStatement = conn.createStatement();

			selectStatement.executeUpdate(Requetes.REQUETE_MODIFER_CLIENT(cin, codecate, nom, prenom, adresse, tel));
			
			
		} catch (ClassNotFoundException e) {
			e.getCause();
			System.err.println("Le driver JDBC pour MYSQL est introuvable");
		} catch (SQLException e) {
			e.getCause();
			System.err
					.println("Un probleme de connexion est sourvenu, v�rfier la chaine de connexion 8");
		}
}

}
