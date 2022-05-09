package com.shilpa.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Dashboard extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        out.println("<html><body>");
        String userId = request.getParameter("userid");
        if (userId == null) {
            out.println("<h3>No UserId was found in hidden form field.</h3><br>");
        } else {
            out.println("<h3>UserId found in hidden form field: </h3>" + userId + "<br>");
            
        }
        out.println("</body></html>");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
