package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteDataFromDatabase {

	public static void main(String[] args) {


		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mkpits_student","root","");  
			//here sonoo is database name, root is username and password  
			PreparedStatement stmt=con.prepareStatement("delete from studentinfo where id=?");  
			stmt.setInt(1,2);  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records deleted");
		}catch(Exception e){ System.out.println(e);}
			
	}

}
