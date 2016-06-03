package org.jboss.resteasy.JuneFirst;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloJune extends HttpServlet{
   /**
	 * 
	 */
	private static final long serialVersionUID = -3014434748135025399L;

	@Override
	public void init() throws ServletException{
		super.init();
	}
	
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello June !!\n JuneFirst!! </h1>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,IOException{
	         this.doGet(request, response);
        }
	
	@Override
	public void destroy(){
		super.destroy();
	}


}
