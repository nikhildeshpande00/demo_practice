package com.Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;   //declare globaly becoz we have to use outside the method
 
	//step 1 create construtor
	public	ExcelDataProvider() throws Exception{

		String path="C:\\Users\\ADMIN\\eclipse-workspace\\DEMO\\TestData\\TestData.xlsx";
		FileInputStream fis=new FileInputStream(path);
		 wb=new XSSFWorkbook(fis);

}
	
	public String getExcelData(String sheetname,int row,int cell) {
	
	return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
//we create object of this method into Base class

