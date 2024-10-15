package com.booking;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary {
	public static String gatCellValue(String sheet, int row, int cell) throws IOException {
		FileInputStream fis = new FileInputStream("./MyFiles/MyExcelFile.xlsx");
		Workbook wb = new XSSFWorkbook(fis);
		String cellValue = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;

	}

}
