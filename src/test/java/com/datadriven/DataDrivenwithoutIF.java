package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenwithoutIF {

	
		public static void main(String[] args) throws IOException {
			
	        File f=new File("C:\\Users\\ELCOT\\SeleniumCourse\\Maven_Project\\ExcelFile.xlsx");
			
			FileInputStream fis= new FileInputStream(f);
			
		    Workbook w= new XSSFWorkbook(fis);
		
		    Sheet sheetAt = w.getSheetAt(0);
		
//		    int nrows = sheetAt.getPhysicalNumberOfRows();
//		    Row row = sheetAt.getRow(1);
//		    int numberOfCells = row.getPhysicalNumberOfCells();
//		    for(int i=0; i<numberOfCells;i++) {
//			    Cell cell = row.getCell(i);
//				CellType cellType = cell.getCellType();
//		    		   		 			                                                                  FOR PRINT PARTICULAR ROWS
//				 if(cellType.equals(CellType.STRING)) {
//					 String value = cell.getStringCellValue();
//					 System.out.println(value);
//				 }
//				 else if(cellType.equals(CellType.NUMERIC)) {
//					 double value = cell.getNumericCellValue();
//					 int num=(int) value;
//					 System.out.println(num);
//				     }}}}

//										int nrows = sheetAt.getPhysicalNumberOfRows();
//                                        for(int i=0; i<nrows;i++) {
//                                        Row row = sheetAt.getRow(1);
//                                        int numberOfCells = row.getPhysicalNumberOfCells();
//	                                    Cell cell = row.getCell(1);
//	                                    CellType cellType = cell.getCellType();              
//		   		 			                                                                              FOR PRINT PARTICULAR COLUMN
//	                                    if(cellType.equals(CellType.STRING)) { 
//		                                String value = cell.getStringCellValue();
//		                                System.out.println(value);
//	                                    }
//	                                    else if(cellType.equals(CellType.NUMERIC)) {
//	                                    	double value = cell.getNumericCellValue();
//	                                    	int num=(int) value;
//	                                    	System.out.println(num);
//	                                    }}}}

int nrows = sheetAt.getPhysicalNumberOfRows();
Row row = sheetAt.getRow(1);
int numberOfCells = row.getPhysicalNumberOfCells();
Cell cell = row.getCell(1);
CellType cellType = cell.getCellType();

																									   //FOR PRINT PARTICULAR CELL DATA
if(cellType.equals(CellType.STRING)) {
String value = cell.getStringCellValue();
System.out.println(value);
}
else if(cellType.equals(CellType.NUMERIC)) {
	double value = cell.getNumericCellValue();
	int num=(int) value;
	System.out.println(num);
}}}
		     
		





