package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {

	public Connection conectaDB() {
		Connection conexao = null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&password=";
			conexao = DriverManager.getConnection(url);
		}catch(SQLException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}
		return conexao;
	}
	
}
