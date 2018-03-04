package com.hocoo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hocoo.actions.CustomerActionImplementation;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerActionImplementation cai = new CustomerActionImplementation();
		
		String formid = (String)request.getAttribute("formid");
		if(formid == "login") {
			
			String email = (String)request.getAttribute("email");
			String password = (String)request.getAttribute("password");
			boolean success = cai.loginCustomer(email, password);
			
			if(success)
				request.getRequestDispatcher("../WebContent/WEB-INF/customerhome.jsp").forward(request, response);
			request.getRequestDispatcher("invalidlogin.jsp").forward(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}

}
