package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingEntireExcelData {

	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public Object[][] ReadingEntireExcelData() throws IOException {
		fis = new FileInputStream("./TestData/UIData2.xlsx");
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
		//getLastCellNum(); returns last index, in java indexing starts from 0, always better to use getPhysicalNumberOfRows you will get correct no of rows
		int LasrRowNumber = sheet.getPhysicalNumberOfRows();
		int LastCellNum = sheet.getRow(0).getLastCellNum();
		Object[][] testData = new Object[LasrRowNumber][LastCellNum];
		//we are excluding the column header so staring from 1
		for(int i=1;i<LasrRowNumber;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<LastCellNum;j++) {
				testData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();				
			}
		}
		return testData;
	}
	public void clearing() throws IOException {
		if(fis!=null) {
		fis.close();
		}
		if(wb!=null) {
		wb.close();
		}
	}
	
	
	
}
