package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenRvCvPv{

	public static void readAllData() throws IOException {
		
		
		File f=new File("C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project\\ExcelFile.xlsx");
		
		FileInputStream fis= new FileInputStream(f);
		
	    Workbook w= new XSSFWorkbook(fis);
	
	    Sheet sheetAt = w.getSheetAt(0);
	
	    int nrows = sheetAt.getPhysicalNumberOfRows();
	
	    for(int i=0; i<nrows;i++) {
		Row row = sheetAt.getRow(i);
		int numberOfCells = row.getPhysicalNumberOfCells();
		 
	    for (int j=0;j<numberOfCells; j++) {
			 Cell cell = row.getCell(j);
			 CellType cellType = cell.getCellType();
			 
			 // if(i==2&&j==1) {
			    if(i==2){
			 // if(j==1){
			 
			 if(cellType.equals(CellType.STRING)) {
				 String value = cell.getStringCellValue();
				 System.out.println(value);
			 }
			 else if(cellType.equals(CellType.NUMERIC)) {
				 double value = cell.getNumericCellValue();
				 int num=(int) value;
				 System.out.println(num);
			     }
			     }
		 		 }
	             }
	}
public static void main(String[] args) throws IOException {
	readAllData();
}
	}


