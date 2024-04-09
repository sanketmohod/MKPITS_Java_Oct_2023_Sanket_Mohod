package com.mkpits.mvc;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MVCServlet
 */
@WebServlet("/MVCServlet")
public class MVCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MVCServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get data from studenutil helper class
		List<Student> students = StudentUtil.getStudents();
		// AAD DATA TO DATA OBJECT
		request.setAttribute("student_list", students);
		// get request dispathcher
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view_student_data.jsp");
				// forword request
		dispatcher.forward(request, response);
				
	}

}
