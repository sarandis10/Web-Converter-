package com.sarandis;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/conversion")
public class ServletMain extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int i= Integer.parseInt(request.getParameter("number1"));
		int j= Integer.parseInt(request.getParameter("number2"));
		
		double miles= i*0.62;
		double km=j*1.6;
		
		PrintWriter out =response.getWriter();
		out.println("the "+ i+" kilometers are in miles :" +miles);
		out.println("the "+ j +" miles are in kilometers: " +km);
		
	}

}
