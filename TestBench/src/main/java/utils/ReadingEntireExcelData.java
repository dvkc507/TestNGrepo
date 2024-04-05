package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingEntireExcelData {

	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public XSSFSheet ReadingEntireExcelData() throws IOException {
		fis = new FileInputStream("./TestData/UIData.xlsx");
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		return sheet;
	}
	
	
	
}
