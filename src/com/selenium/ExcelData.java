package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis= new FileInputStream("E:\\excel.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("sheet1");
		XSSFRow row= sheet.getRow(1);
		XSSFCell cell=row.getCell(1);
		String value=cell.getStringCellValue();
		System.out.println(value);
	}
	
	

}
