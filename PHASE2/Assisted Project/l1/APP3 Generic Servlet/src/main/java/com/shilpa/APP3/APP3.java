package com.shilpa.APP3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class APP3
 */
@WebServlet("/APP3")
public class APP3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        
        PrintWriter out = response.getWriter();
        out.print("<h3>Displaying Full Name</h3>");
        out.print("<hr>");
    out.println("<html><body>");
    out.println("Your full name is " + fname + " " + lname);
    out.println("</body></html>");
    out.print("<hr>");


	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
