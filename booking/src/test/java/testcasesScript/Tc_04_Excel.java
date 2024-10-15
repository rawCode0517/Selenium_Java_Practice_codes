package testcasesScript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.booking.ExcelLibrary;
import com.booking.TestBase;

public class Tc_04_Excel extends TestBase {
	
	@Test
	public void m1() throws IOException {
//		String data=ExcelLibrary.gatCellValue("Sheet1", 0, 0);
//		FileInputStream fis= new FileInputStream("./MyFiles/MyExcelFile.xlsx");
//		Workbook wb = new XSSFWorkbook(fis);
//		String cellValue=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(ExcelLibrary.gatCellValue("Sheet1", 0, 0));
	}

}
