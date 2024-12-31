package Testingcode;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	
	public static WebDriver driver;
	
	public static  List check() {
		driver= new ChromeDriver();
		driver.get("https://practice-automation.com/tables/");
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		List finalList = new ArrayList();
		for (WebElement element : elements){
		if(element.getAttribute("href") == null){
		finalList.add(element);
		}
		}
		return finalList;
		
	}
	
	public static void main(String[] args) {
		List check = check();
		System.out.println(check.size());
		
		
	}

}
