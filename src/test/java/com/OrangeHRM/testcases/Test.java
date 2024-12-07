package com.OrangeHRM.testcases;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.OrangeHRM.Utilities.DriverFactory;

public class Test {
	//This is git code
	public static WebDriver driver;

	public void select_Subcategory() {
		
	}
	

	public static void gettablecell(String tableid,int col,String condition) {
		boolean txtfound=false;
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='"+tableid+"']//tbody//tr"));
	int rowcnt = rows.size();
	for (int row=1;row<=rowcnt;row++) {
		if(driver.findElement(By.xpath("//table[@id='"+tableid+"']//tbody//tr["+row+"]//td["+col+"]//a")).getText().equalsIgnoreCase(condition)) {
			System.out.println(driver.findElement(By.xpath("//table[@id='"+tableid+"']//tbody//tr["+row+"]//td["+col+"]//a")).getText());
			System.out.println(driver.findElement(By.xpath("//table[@id='"+tableid+"']//tbody//tr["+row+"]//td[3]//p")).getText());
			System.out.println(driver.findElement(By.xpath("//table[@id='"+tableid+"']//tbody//tr["+row+"]//td[5]//p")).getText());
			txtfound=true;
			break;
		}
		
		
	}
	}
	
	
	
	
	public void dropdownlst(List<WebElement> options,String compare) {
		try {
		System.out.println(options.size());
		
		for (WebElement ele : options) {
			if(ele.getText().equalsIgnoreCase(compare)) {
				ele.click();
			}
			
		}
		}catch(Exception e) {
			System.out.println("Exception "+e.getMessage());
		}
	}
	public static void main(String[] args) {
		
		WebDriverWait wait;
		driver= new ChromeDriver();
		driver.get("https://automationexercise.com/products");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[text()='Add to cart'  and  @data-product-id=2]")).click();
		
		  wait= new WebDriverWait(driver, Duration.ofSeconds(30)); //
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By. xpath("//div[@class='modal-body']//p[text()='Your product has been added to cart.']" ))));
//		
//		System.out.println(driver.findElement(By.xpath("//div[@class='modal-body']//p[text()='Your product has been added to cart.']")).getText());
//		driver.findElement(By.xpath("//div[@class='modal-footer']//button[text()='Continue Shopping']")).click();
//		driver.switchTo().defaultContent();
//		driver.findElement(By.linkText("View Product")).click();
//	
//		generateemail();
		driver.findElement(By.linkText("View Cart")).click();
//		 driver.findElement(By.linkText("Cart")).click();
		 gettablecell("cart_info_table",2,"Men Tshirt");
	}
	
	
	
	public static String generateemail() {
		Date dt= new Date();
		System.out.println(dt.toString().replaceAll("\\s","").replaceAll(":","_"));
		String newemail=dt.toString().replaceAll("\\s","").replaceAll(":","_")+"@gmail.com";
		System.out.println(newemail);
		return newemail;
	}
	
	
	public static String generateautomationscriptname() {
		Date dt= new Date();
		System.out.println(dt.toString().replaceAll("\\s","").replaceAll(":","_"));
		String newemail=dt.toString().replaceAll("\\s","").replaceAll(":","_")+"@gmail.com";
		System.out.println(newemail);
		return newemail;
	}
		
	public void testing() {
		
	}
	
	
//	
//	public static boolean performactionTable(int colcompare,String tableid_xpath,String condition,int getcol,String tagtype) {
//		//get row cnt
//		boolean valfound=false;
//		List<WebElement> rowele = driver.findElements(By.xpath(tableid_xpath+"//tbody//tr"));
//		int rowcnt = rowele.size();
//		for(int i=2 ;i<=rowcnt;i++) {
//			String exptext = driver.findElement(By.xpath(tableid_xpath+"//tbody//tr["+i+"]//td["+colcompare+"]")).getText();
//			if(exptext.equalsIgnoreCase(condition)) {
//
//				driver.findElement(By.xpath(tableid_xpath+"//tbody//tr["+i+"]//td["+getcol+"]//"+tagtype)).click();
//
//				valfound=true;
//
//				break;
//			}
//		}
//		Assert.fail(condition+" Value not found in webtable");
//		return valfound;
//
//	}
//
//	}
	
	

}
