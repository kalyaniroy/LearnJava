package excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelreader {
	
	
	
	public String readExcelData(String path,int sheetNo,int column,int row) {
		String data ="";
		
		try {
			FileInputStream file = new FileInputStream(path);
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(sheetNo);
			data = sheet.getRow(row).getCell(column).getStringCellValue();	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return data;
	}
	
	
	public static void main(String[] args) {
		
		Excelreader reader = new Excelreader();
		String path = "C:\\Users\\kalya\\eclipse-workspace\\LearnJava\\src\\TestExcelFile\\TestExcel.xlsx";
		
		String value = reader.readExcelData(path, 0, 4, 1);
		
		System.out.println(value);
	}

}
