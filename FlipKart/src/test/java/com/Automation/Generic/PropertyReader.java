package com.Automation.Generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertyReader {
	static Properties prop= new Properties();
	public  static String username ,password ;
	public static void initProperty() {
		try {
			prop.load(new FileInputStream("C:\\Users\\rushi\\eclipse-workspace\\FlipKart\\src\\test\\resources\\config\\config.properties"));
			FileInputStream excel=new FileInputStream("C:\\Users\\rushi\\OneDrive\\Desktop\\abc.xlsx");
			Workbook wb = WorkbookFactory.create(excel);
	 username = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	  password= wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		}catch (Exception e)
		{
			e.printStackTrace();
			
		}}
		 public static String getProperty(String key) {
			return prop.getProperty(key);
		
	}
}