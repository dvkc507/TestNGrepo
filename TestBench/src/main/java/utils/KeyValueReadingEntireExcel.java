package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class KeyValueReadingEntireExcel {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public Object[][] keyValueReadingExcel() throws IOException {
		 Object[][] testData = null;
	        try {
	        	fis = new FileInputStream("./TestData/UIData2.xlsx");
	            wb = new XSSFWorkbook(fis);
	            sheet = wb.getSheet("Sheet1");
	            int rowCount = sheet.getLastRowNum();
	            int columnCount = sheet.getRow(0).getLastCellNum();
	            testData = new Object[rowCount][1];
	            for (int i = 0; i < rowCount; i++) {
	                XSSFRow row = sheet.getRow(i + 1);
	                HashMap<String, String> dataMap = new HashMap<>();
	                for (int j = 0; j < columnCount; j++) {
	                    XSSFCell cell = row.getCell(j, XSSFRow.MissingCellPolicy.CREATE_NULL_AS_BLANK);
	                    String cellValue = cell.toString().trim();
	                    String header = sheet.getRow(0).getCell(j).toString().trim();
	                    dataMap.put(header, cellValue);
	                }
	                testData[i][0] = dataMap;
	            }
	            wb.close();
	            fis.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return testData;
	}

	public void clearing() throws IOException {
		if (fis != null) {
			fis.close();
		}
		if (wb != null) {
			wb.close();
		}
	}
}
