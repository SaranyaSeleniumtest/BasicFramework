package com.OrangeHRM.testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablecode {
	
	
	public static void gettablecell(String tableid,int col,String condition, int getcol) {
		boolean txtfound=false;
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='"+tableid+"']//tbody//tr"));
	int rowcnt = rows.size();
	for (int row=2;row<=rowcnt;row++) {
		if(driver.findElement(By.xpath("//table[@id='"+tableid+"']//tbody//tr["+row+"]//td["+col+"]")).getText().equalsIgnoreCase(condition)) {
			System.out.println(driver.findElement(By.xpath("//table[@id='"+tableid+"']//tbody//tr["+row+"]//td["+getcol+"]")).getText());

			txtfound=true;
			break;
		}
		
		
	}
	}
	
	public static String dynamictbl(String condition) {
		String tbldata=null;
		tbldata=driver.findElement(By.xpath("//table[@id='customers']//tbody//tr/td[text()='"+condition+"']/preceding-sibling::td")).getText();
		//table[@id='customers']//tbody//tr/td[text()='Maria Anders']/preceding-sibling::td
		return tbldata;
	}
	public static  WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		//driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		gettablecell("customers",2,"Francisco Chang",1);
//		System.out.println(dynamictbl("Francisco Chang"));
//		driver.quit();
		
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		//https://www.h2kinfosys.com/blog/handling-dynamic-web-tables-using-selenium-webdriver/
	}

}
