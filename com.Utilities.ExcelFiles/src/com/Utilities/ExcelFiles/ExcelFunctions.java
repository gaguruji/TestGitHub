package com.Utilities.ExcelFiles;

import java.io.File;
import java.io.FileInputStream;
import a
public class ExcelFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fname = new File("D:\\JAVA\\JAVAAutomation\\Configuratrion\\Config.xlsx");
		FileInputStream fis = new FileInputStream(fname);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sSheetnno = wb.
	}

}
