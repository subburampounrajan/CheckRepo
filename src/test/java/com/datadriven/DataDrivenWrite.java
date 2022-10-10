package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenWrite {

 public static void writeDataDriven() throws IOException {
	 
	 File f=new File("C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project\\ExcelFile.xlsx");
	 
	 FileInputStream fis=new FileInputStream(f);
	 
	 Workbook w=new XSSFWorkbook(fis);
	 
	 Sheet createSheet = w.createSheet("Data");
	 
	 Row createRow = createSheet.createRow(0);
	 
	 Cell createCell = createRow.createCell(0);
	 
	 createCell.setCellValue("subbu");
	 
	 w.getSheet("Data").getRow(0).createCell(1).setCellValue("34");
	 
	 w.getSheet("Data").createRow(1).createCell(0).setCellValue("bhama");
	 
	 w.getSheet("Data").getRow(1).createCell(1).setCellValue("30");
	 
	 w.getSheet("Data").createRow(2).createCell(0).setCellValue("sanjana sree");
	 
	 w.getSheet("Data").getRow(2).createCell(1).setCellValue("4");
	 
	 w.getSheet("Data").createRow(3).createCell(0).setCellValue("sugumar");
	 
	 w.getSheet("Data").getRow(3).createCell(1).setCellValue("31");
	 
	 FileOutputStream fos=new FileOutputStream(f);
	 
	 w.write(fos);
	 
	 w.close();
}
 
 public static void main(String[] args) throws IOException {
	 writeDataDriven();
}
	}


