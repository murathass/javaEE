package com.example.test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testServlet")
public class testServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		writer.append("<html>");
		writer.append("<head>");
		writer.append("</head>");
		writer.append("<body>");
		writer.append("<h1 style=\"color:red\";>Hellü World</h1>");
		writer.append("</body>");
		writer.append("</html>");
	}

}
