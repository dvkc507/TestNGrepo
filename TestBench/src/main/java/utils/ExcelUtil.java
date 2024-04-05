package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;


public class ExcelUtil {
	File file;
	public FileInputStream fis;
	XSSFWorkbook workbook;
    XSSFSheet sheet;
	public XSSFSheet excelDataProvider() throws IOException {
	file = new File("./TestData/UIData.xlsx");
	fis = new FileInputStream(file);
	workbook= new XSSFWorkbook(fis);
	sheet = workbook.getSheet("Sheet1");
		return sheet;
	}
	public String getStringData() throws IOException {
		XSSFSheet sh1 = excelDataProvider();
		String str= sh1.getRow(0).getCell(0).getStringCellValue();
		return str;
	}
	public int getNumericData() throws IOException {
		XSSFSheet sh2 = excelDataProvider();
		//return type of getNumericCellValue is double
		double val =sh2.getRow(0).getCell(1).getNumericCellValue();
		return (int) val;
	}
	public void closingConnections() throws IOException {
		fis.close();
		workbook.close();
	}
}
