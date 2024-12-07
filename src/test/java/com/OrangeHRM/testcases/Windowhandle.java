package com.OrangeHRM.testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
	public static WebDriver driver;
	
	public void windowshandle() {
		
	}
	public static void main(String[] args) {
		driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700)");
		
		driver.findElement(By.id("tabButton")).click();
		Set<String> winhan2 = driver.getWindowHandles();
		List<String> winlist=  new ArrayList<String>(winhan2);
		driver.switchTo().window(winlist.get(1));
		String text = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(text);
		System.out.println("title of window2  "+driver.getTitle());
		driver.close();
		driver.switchTo().window(winlist.get(0));
		System.out.println("title of window1  "+driver.getTitle());
		
	}

}
