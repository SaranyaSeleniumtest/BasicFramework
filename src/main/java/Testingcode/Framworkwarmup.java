package Testingcode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Framworkwarmup {
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public static Framworkwarmup frame;
	public static  RemoteWebDriver driver;
	public static void main(String[] args) throws IOException {
		 driver= new ChromeDriver();
		String getpropertydata = getpropertydata("testdataloc");
		System.out.println(getpropertydata);
//		driver.get("https://automationexercise.com/");
//		driver.manage().window().maximize();
//		screen();
		 frame= new Framworkwarmup("Login");
	}
	
		public static String getpropertydata(String input) throws IOException {
			Properties prop= new Properties();
			String file=System.getProperty("user.dir")+"/src/main/resources/config.properties";
			FileInputStream fis= new FileInputStream(file);
			prop.load(fis);
			return prop.getProperty(input);
		}
		
		
		public Framworkwarmup(String sheetname) throws IOException {
			String path=System.getProperty("user.dir")+getpropertydata("testdataloc");
			System.out.println(path);
			FileInputStream excelfile=new FileInputStream(path);
			 wb= new XSSFWorkbook();
			 sheet = wb.getSheet(sheetname);
			
			System.out.println(sheetname);
			int rowcnt = sheet.getLastRowNum();
			int columcount = sheet.getRow(0).getLastCellNum();
			
			String cellvalue = sheet.getRow(1).getCell(1).toString();
			System.out.println(cellvalue);
			
			for(int row=1;row<=rowcnt;row++) {
				for(int col=1;col<columcount;col++) {
				String cell = sheet.getRow(row).getCell(row).toString();
				System.out.println(cell);
			}
			}
		}
		
		
		
		public static void screen() throws IOException {
			TakesScreenshot capture= (TakesScreenshot)driver;
			File source = capture.getScreenshotAs(OutputType.FILE);
			SimpleDateFormat format= new SimpleDateFormat("dd-mm-yyyy-hh-mm-ss");
			String pattern = format.format(new Date());
			String screenshotpath=System.getProperty("user.dir")+"/Reports/AutomationExecution-"+pattern+".png";
			File dest = new File(screenshotpath);
			FileUtils.copyFile(source, dest);
			
		}
		
		
		

}

