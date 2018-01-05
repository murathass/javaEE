package com.murathas.controllers;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddPassenger
 */
@WebServlet("/AddPassenger")
public class AddPassenger extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("/Views/add_passenger.jsp");
		view.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("errors", false);
		
		String firstname = request.getParameter("firstname");
		
		if (firstname.length() == 0) {
			System.out.println("empty first name error");
			
			request.setAttribute("errors", true);
			request.setAttribute("firstname_errors", true);
		}else {
			System.out.println("firstname: "+firstname);
		}
		
		
		
		String lastname = request.getParameter("lastname");
		
		if (lastname.length() == 0) {
			System.out.println("empty last name error");
			
			request.setAttribute("errors", true);
			request.setAttribute("lastname_errors", true);
		}else {
			System.out.println("lastname: "+lastname);
		}
		
		String dob_raw = request.getParameter("dob");
		String dobArray[] = dob_raw.split("\\/");
		
		String pattern = "^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(dob_raw);
		
		if(m.find()) {
			String day = dobArray[0];
			String month = dobArray[1];
			String year = dobArray[2];
			
			Calendar cal = Calendar.getInstance();
			
			cal.set(Calendar.YEAR, Integer.parseInt(year));
			cal.set(Calendar.MONTH, Integer.parseInt(month));
			cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
			
			Date dob = cal.getTime();
			
			System.out.println(dob);
		}else {
			System.out.println();
			System.err.println("Invalidate of birth date");
			request.setAttribute("errors",true);
			request.setAttribute("date_format_error",true);
		}
		
		
		String gender = request.getParameter("gender");
		
		
		if (gender.length() == 0) {
			System.out.println("empty gender error");
			
			request.setAttribute("errors", true);
			request.setAttribute("gendername_errors", true);
		}
		System.out.println(gender);
	}

}
