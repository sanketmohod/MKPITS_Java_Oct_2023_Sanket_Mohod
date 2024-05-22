package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateDataFromDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mkpits_student","root","");  
			//here sonoo is database name, root is username and password  
			PreparedStatement stmt=con.prepareStatement("update studentinfo set name=?, gender=? where id=?");  
			stmt.setString(1,"Kajal");//1 specifies the first parameter in the query i.e. name  
			stmt.setString(2, "female");
			stmt.setInt(3,2);  
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated");}catch(Exception e){ System.out.println(e);}
			
				
			
	}

}
