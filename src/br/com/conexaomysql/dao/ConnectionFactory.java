package br.com.conexaomysql.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() throws SQLException {
		System.out.println("Conectando...");	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		throw new SQLException(e);
	}

	return DriverManager.getConnection("jdbc:mysql://127.0.0.1:8889/factorydao", "root", "root");
	}
}
