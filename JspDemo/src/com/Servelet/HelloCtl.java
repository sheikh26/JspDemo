package com.Servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloCtl extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("Hello java");
		
		
		String op=request.getPaparameter("operation");
		String firstName =request.getPaparameter("firstName");
		String lastName =request.getPaparameter("lastName");
		if(op.endsWith("Submit")){
			System.out.println(firstName+" "+lastName);
		}
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
