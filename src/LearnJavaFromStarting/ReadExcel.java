package LearnJavaFromStarting;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{

	public String getReaddata(String path,int sheetno, int colno, int rowno) 
	{
	
		String value="";
		try
		{
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetno);
			value=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		}
		catch(Exception e)
		{
			System.out.println("Issue in get read data "+e);
		}
		return value;
	
	}
	public static void main(String[] args) {
	
	
		ReadExcel ob = new ReadExcel();
		String path="C:\\Users\\kalya\\OneDrive\\Desktop\\Study\\READ_EXCEL\\VoterAadhar.xlsx";
		for(int i=0;i<=10;i++)
		{
		String data = ob.getReaddata(path, 0, 0, 1);
		System.out.println(data);
		}
	}
	

}

	

