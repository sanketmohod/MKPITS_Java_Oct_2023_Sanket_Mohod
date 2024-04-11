package com.mkpits.jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.jdbc.PreparedStatement;

public class StudentDbUtility {

	
	private DataSource dataSource;

	public StudentDbUtility(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Student_Model> getStudent() throws Exception{
		List<Student_Model> students = new ArrayList<Student_Model>();
		Connection myCon = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		try {
			myCon = dataSource.getConnection();
			// create a sql statement
			String sql = "select * from student order by id";
			myStmt = myCon.createStatement();

			// execute sql query
			myRs = myStmt.executeQuery(sql);

			// process the result set
			while (myRs.next()) {
				int id = myRs.getInt("id");
				String fName = myRs.getString("first_name");
				String lName = myRs.getString("last_name");
				String email = myRs.getString("email");

				// create new student object
				Student_Model tempStudent = new Student_Model(id, fName, lName, email);
				
				
				// add it to the list of student
				students.add(tempStudent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(myCon, myStmt, myRs);
		}
		return students;
	}

	private void close(Connection myCon, Statement myStmt, ResultSet myRs) {
		
		try {
			
			if (myRs != null) {
				myRs.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
			if (myCon != null) {
				myCon.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void addStudent(Student_Model theStudent) {
       Connection myCon = null;
       PreparedStatement myStmt = null;
       
       try {
    	   // get sb connection
    	   myCon = dataSource.getConnection();
    	   
    	   // crete  sql for insert
    	   String sql = "insert into student student(first_name, lastName, email) value(?,?,?)";
    	   myStmt = (PreparedStatement) myCon.prepareStatement(sql);
    	   
    	   //  set the param value  for the  student
    	   myStmt.setString(1,  theStudent.getfName());
    	   myStmt.setString(2,  theStudent.getlName());
    	   myStmt.setString(3,  theStudent.getEmail());
    	   
    	   // execute
            myStmt.execute();
       }catch(Exception e) {
    	   e.getStackTrace();
       }finally {
    	   close(myCon, myStmt, null);
       }
	}
}
