package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertDataIntoDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mkpits_student","root","");  
			//here sonoo is database name, root is username and password  
			PreparedStatement stmt=con.prepareStatement("insert into studentinfo values(?,?,?)");  
			stmt.setInt(1,3);//1 specifies the first parameter in the query  
			stmt.setString(2,"Panya");  
			stmt.setString(3, "male");
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");    
			con.close();  
			}catch(Exception e){ System.out.println(e);}
	
	}

}
