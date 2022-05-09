package com.shilpa.loginLogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DashBoard extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
   
        
        HttpSession session=request.getSession(false);  
        String userId = null;
        if (session.getAttribute("userid") != null)
            userId =(String)session.getAttribute("userid");  
        if (userId == null ) {
            out.println("No UserId was found in session.<br>");
        } else {
            out.println("UserId obtained from session :" + userId + "<br>");
            out.println("<a href='Logout'><h3>Logout of session</h3></a><br>");
        }
     

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
