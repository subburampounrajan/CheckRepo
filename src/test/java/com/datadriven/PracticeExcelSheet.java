package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcelSheet {
	
	public static void checkingData() throws IOException {
		

		File f=new File("C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project\\6c1-1.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fis);
		
		Sheet sheetAt = w.getSheetAt(0);
		
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for(int i=0;i<numberOfRows;i++){
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			
			for(int j=0;j<numberOfCells;j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				if(cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
					else if (cellType.equals(cellType.NUMERIC)){
						double numericCellValue = cell.getNumericCellValue();
						int num=(int) numericCellValue;
						System.out.println(num);	
						
					}
					
				}
				
			}
	
		}
	public static void main(String[] args) throws IOException {
		checkingData();
	}
	
		
	}	
	


