package com.mkpits.jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
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
       java.sql.PreparedStatement myStmt = null;
       
       try {
    	   // get sb connection
    	   myCon = dataSource.getConnection();
    	   
    	   // crete  sql for insert
    	   String sql = "insert into student(first_name,last_name,email) value(?,?,?)";
    	   myStmt = myCon.prepareStatement(sql);
    	   
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

	public Student_Model loadStudents(String theStudentId) {
		// TODO Auto-generated method stub
		Student_Model theStudent = null;
		Connection myCon = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		int studentId;
		try {
			// convert student id into integer
			studentId = Integer.parseInt(theStudentId);
			// get database connection
			myCon = dataSource.getConnection();
			// create sql to get select student
			String sql = "select * from student where id = ?";
			// create a prepared statement
			myStmt = (PreparedStatement) myCon.prepareStatement(sql);
			// set param from the student data
			myStmt.setInt(1,  studentId);;
			// execute statement
			myRs = myStmt.executeQuery();
			// retrive data from result set row
			if(myRs.next()) {
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
                // use the student during constructor
				theStudent = new Student_Model(studentId, firstName, lastName, email);
				
				
			}else {
				throw new Exception("Could not find studentid "+studentId);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(myCon, myStmt, myRs);
		}
		return theStudent;
	}

	public void updateStudent(Student_Model theStudent) throws Exception {
		Connection myCon = null;
		PreparedStatement myStmt = null;
		try {

			// get db connection

			myCon = dataSource.getConnection();

			// create sql to get update student
			String sql = "update student set first_name = ?,last_name = ?,email = ? where id = ?";

			// create a prepared statement
			myStmt = (PreparedStatement) myCon.prepareStatement(sql);

			// set params
			myStmt.setString(1, theStudent.getfName());
			myStmt.setString(2, theStudent.getlName());
			myStmt.setString(3, theStudent.getEmail());
			myStmt.setInt(4, theStudent.getId());

			// execute SQL statement
			myStmt.execute();

		} finally {
			close(myCon, myStmt, null);
		}

		
	}

	public void deleteStudent(String studentId) throws SQLException {
		Connection myCon = null;
		PreparedStatement myStmt = null;
		try {
			// convert student to integer
			int theStudentId = Integer.parseInt(studentId);

			// get db connection

			myCon = dataSource.getConnection();

			// create sql to get update student
			String sql = "delete from student where id = ?";

			// create a prepared statement
			myStmt = (PreparedStatement) myCon.prepareStatement(sql);
			
			//set params
			myStmt.setInt(1, theStudentId);
			
			//execute sql
			myStmt.execute();
		} finally {
			close(myCon, myStmt, null);
		}

	}
		
}

