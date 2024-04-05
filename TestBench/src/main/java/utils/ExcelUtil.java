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
		/* the below file and using path directly in fis
		 * In terms of functionality and performance, both approaches are equivalent.
		 * The choice between them depends on your specific use case and coding style
		 * preferences. If you need to perform additional operations on the file (e.g.,
		 * checking its existence, getting its absolute path), using a File object can
		 * be beneficial. Otherwise, directly passing the file path to FileInputStream
		 * can be more concise.
		 */
	//file = new File("./TestData/UIData.xlsx");
	fis = new FileInputStream("./TestData/UIData.xlsx");
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
