package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtil {

	
	private DataSource dataSource;

	public StudentDbUtil(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Student> getStudent() throws Exception{
		List<Student> students = new ArrayList<Student>();
		Connection myCon = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		try {
			myCon = dataSource.getConnection();
			// create a sql statement
			String sql = "select * from student order by last_name";
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
				Student tempStudent = new Student(id, fName, lName, email);
				
				
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
			if (myCon != null) {
				myCon.close();
			}
			if (myStmt != null) {
				myStmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
