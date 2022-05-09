package com.shilpa.APP1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetHandler
 */
@WebServlet("/GetHandler")
public class GetHandler extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.print("<hr>");
        out.print("<h3>Welcome to Get Handler</h3>");
		out.print("<hr>");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        out.println("Enterd Name is=" + name + "<br> Address is =" + address);
        out.println("</body></html>");
		out.print("<hr>");

	}
	

}
