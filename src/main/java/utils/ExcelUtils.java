package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	public static String getFieldFromSheet(String sheetName, String field) throws IOException
	{
		FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir")+"/src/test/resources/excelData/LoginData.xlsx"));
		@SuppressWarnings("resource")
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetName);
		for (int i=0 ; i < sheet.getRow(0).getLastCellNum(); i++)
		{
		if(sheet.getRow(0).getCell(i).getStringCellValue().equalsIgnoreCase(field))
			return sheet.getRow(1).getCell(i).getStringCellValue();
		}
		return null;
	}
}
