package LearnJavaFromStarting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadStudentExcel {
	
	public List<Student> readStudentData(String path,int sheetNo) {
		List<Student> studentList = new ArrayList<Student>();
		
		try {
			FileInputStream file = new FileInputStream(path);
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.getSheetAt(0);
			//sheet.get
			
			for(Row row: sheet) 
			{  
				Student student =new Student();
				student.setName(row.getCell(0).getStringCellValue());
				student.setRoll(row.getCell(1).getStringCellValue());
				student.setMob(row.getCell(2).getStringCellValue());
				studentList.add(student);
			}
				
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
		
		return studentList;
	}
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\kalya\\OneDrive\\Desktop\\Study\\READ_EXCEL\\Student.xlsx";
		
		ReadStudentExcel read = new ReadStudentExcel();
		List<Student> list = new ArrayList<Student>();
		list = read.readStudentData(path,0);
		
		for(Student s:list) {
			System.out.println(s);
		}
		
		
	}

}
