package com.pgm.test;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mavenpgm extends HttpServlet {
	public void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException
	  {
	    ServletOutputStream out = res.getOutputStream();
	    res.setContentType("text/html");
	    out.println("<html><head><title>Basic Form Processor Output</title></head>");
	    out.println("<body>");
	    out.println("<h1>Here is your Form Data</h1>");
	    //extract the form data here
	    String n = req.getParameter("name");
	    String p = req.getParameter("e-mail");
	    String tel = req.getParameter("ph-no");
	 
	    //output the data into a web page
	    out.println("Your name is "  + n);
	    out.println("<br>Your e-mail is "  + p);
	    out.println("<br>Your ph-no is "  + tel);
	    
}
}

