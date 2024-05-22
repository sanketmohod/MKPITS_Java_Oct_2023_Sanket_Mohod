package com.mkpits.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BufferInsert {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mkpits_student","root","");  
			//here sonoo is database name, root is username and password  
			PreparedStatement stmt=con.prepareStatement("insert into studentinfo values(?,?,?)");
			System.out.println("Enter your id : ");
			int id = Integer.parseInt(br.readLine());
			stmt.setInt(1, id);//1 specifies the first parameter in the query  
			stmt.setString(2,"Panya");  
			stmt.setString(3, "male");
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");    
			con.close();  
			}catch(Exception e){ System.out.println(e);}

	}

}
