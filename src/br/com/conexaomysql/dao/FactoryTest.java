package br.com.conexaomysql.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class FactoryTest {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta.");
		connection.close();
		
		//ConnectionFactory conn = new ConnectionFactory();
		//conn.getConnection();
	}

}
