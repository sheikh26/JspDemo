package com.Servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ccom.service.MarksheetService;

import com.Vo.MarksheetVo;

public class MarksheetCtl extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op=request.getPaparameter("operation");
		try{
		String Rollno=request.getPaparameter("rollNo");
		String Name=request.getPaparameter("name");
		int chemistry=Integer.parseInt(request.getPaparameter("chemistry"));
		int physics=Integer.parseInt(request.getPaparameter("physics"));
		int maths=Integer.parseInt(request.getPaparameter("Maths"));
		
			
			System.out.println("inside marksheetctlAAAAAAAAAAAAAAAAAAAAAA");
			MarksheetVo vo= new MarksheetVo();
			vo.setRollNo(Rollno);
			vo.setName(Name);
			vo.setChemistry(chemistry);
			vo.setPhysics(physics);
			vo.setMaths(maths);
			
			MarksheetService service= new MarksheetService();
			if ("Add".equalsIgnoreCase(op)) {
				service.add(vo);
				System.out.println("inside marksheetctl");
	RequestDispatcher requestDispatcher=request.getRequestDispatcher("/Marksheet.jsp");		
		requestDispatcher.forward(request, response);
		
		
		//requestDispatcher.include(request, response);
			}
			if ("Delete".equalsIgnoreCase(op)) {
				service.delete(vo);
				System.out.println("inside marksheetctl");
	RequestDispatcher requestDispatcher=request.getRequestDispatcher("/Marksheet.jsp");		
		requestDispatcher.forward(request, response);
	}
			if ("Update".equalsIgnoreCase(op)) {
				service.update(vo);
				System.out.println("inside marksheetctl");
	RequestDispatcher requestDispatcher=request.getRequestDispatcher("/Marksheet.jsp");		
		requestDispatcher.forward(request, response);
			}
			if("Get".equalsIgnoreCase(op)){
				vo=service.get(vo);
				request.setAttribute("get", vo);
				System.out.println("inside marksheetctl");
	RequestDispatcher requestDispatcher=request.getRequestDispatcher("/Marksheet.jsp");
	requestDispatcher.forward(request, response);
				
			}
		}
	catch (Exception e) {
		// TODO: handle exception
	}
			
			

		

	
	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	doGet(request, response);
	}

}
