package InterviewQuestions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	public static void main(String[] args) throws IOException {
		HashMap<String, String> getdata = getdata("Testing");
		String string = getdata.get("Email");
		System.out.println(string);
	}
	public static HashMap<String, String> getdata(String sheet) throws IOException {
		FileInputStream fis= new FileInputStream("src/main/resources/testdata/Testdata.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet(sheet);
		HashMap<String,String> hm= new HashMap<String,String>();
			int rowcnt=sh.getLastRowNum();
			int colcnt=sh.getRow(0).getLastCellNum();
			for(int row=1;row<=rowcnt;row++) {
				for(int col=1;col<=colcnt;col++) {
					sh.getRow(row).getCell(col).setCellType(CellType.STRING);
					hm.put(sh.getRow(0).getCell(col).getStringCellValue(),sh.getRow(row).getCell(col).getStringCellValue());
				}
			
			}	
			return hm;
	}

}
