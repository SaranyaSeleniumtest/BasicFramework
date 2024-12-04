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

public class Test {
	//This is git code
	

	public void select_Subcategory() {
		
	//Adding code to new repo
		
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
//		WebDriver driver;
//		WebDriverWait wait;
//		driver= new ChromeDriver();
//		driver.get("https://automationexercise.com/products");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		driver.findElement(By.xpath("//div[@class='productinfo text-center']//a[text()='Add to cart'  and  @data-product-id=1]")).click();
//		
//		  wait= new WebDriverWait(driver, Duration.ofSeconds(30)); //
//		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By. xpath("//div[@class='modal-body']//p[text()='Your product has been added to cart.']" ))));
//		
//		System.out.println(driver.findElement(By.xpath("//div[@class='modal-body']//p[text()='Your product has been added to cart.']")).getText());
//		driver.findElement(By.xpath("//div[@class='modal-footer']//button[text()='Continue Shopping']")).click();
//		driver.switchTo().defaultContent();
//		driver.findElement(By.linkText("View Product")).click();
//	
		generateemail();
		
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


}
