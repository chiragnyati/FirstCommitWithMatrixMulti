package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class PdfServlet extends HttpServlet {

       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("application/pdf");
		ServletOutputStream sos= response.getOutputStream();
		
		try{
			Document d= new Document();
			PdfWriter pw= PdfWriter.getInstance(d, sos);
		    d.open();
		    Paragraph p= new Paragraph();
		    p.add("list of some companies are given below");
		    Table t=new Table(2);
		    t.addCell("Company Name");
		    t.addCell("Website");
		    t.addCell("IBM");
		    t.addCell("www.ibm.com");
		    t.addCell("Apache");
		    t.addCell("www.apache.com");
		    d.add(p);
		    d.add(t);
		    d.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	

}
