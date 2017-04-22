package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


public class ExcelServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("application/vnd.ms-excel");
		HSSFWorkbook wb = new HSSFWorkbook();
		Sheet sheet= wb.createSheet("sheet1");
		 Row r1= sheet.createRow(0);
		 Cell c1=r1.createCell(0);
		 c1.setCellValue("Company Name");
		 
		 Cell c2=r1.createCell(1);
		 c2.setCellValue("Website");
		 
		 Row r2=sheet.createRow(1);
		 Cell c3=r2.createCell(0);
		 
		 c3.setCellValue("oracle");
		 Cell c4=r2.createCell(1);
		 c4.setCellValue("www.oracle.com");
		 
		 ServletOutputStream sos= response.getOutputStream();
		 wb.write(sos);
		 sos.close();
		 
	}

	
}
