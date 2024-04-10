package com.mkpits.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;



/**
 * Servlet implementation class Test_Servlet
 */
@WebServlet("/Test_Servlet")
public class Test_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	// define datasource connection pool for resourece injection
	@Resource(name="jdbc/web_student_tracker")
	private DataSource datasource;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// set up the print writer
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		// get connection to the database
		Connection myCon = null;
		Statement myStmt =  null;
		ResultSet myRs = null;
		try {
			
				myCon = datasource.getConnection();
				// create a sql statement
				String sql = "select* from student";
				myStmt = myCon.createStatement();

				// execute sql query
				myRs = myStmt.executeQuery(sql);

				// process the result set
				while (myRs.next()) {
					String email = myRs.getString("email");
					out.println(email);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}

