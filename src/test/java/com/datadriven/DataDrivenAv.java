package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenAv {

	public static void main(String[] args) throws IOException {
		
        File f=new File("C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project\\ExcelFile.xlsx");
		
		FileInputStream fis= new FileInputStream(f);
		
	    Workbook w= new XSSFWorkbook(fis);
	
	    Sheet sheetAt = w.getSheetAt(0);
	
	    int nrows = sheetAt.getPhysicalNumberOfRows();
	   // int numberOfCells = nrows.getPhysicalNumberOfCells();     ----------------> its not correct
	    for(int i=0; i<nrows;i++) {
		Row row = sheetAt.getRow(i);
		
		int nCells = row.getPhysicalNumberOfCells();
		 	 for (int j=0;j<nCells; j++) {
			 Cell cell = row.getCell(j);
			 
			 CellType cellType = cell.getCellType();			 
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

