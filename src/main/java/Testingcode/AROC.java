package Testingcode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AROC {
	
	public static void main(String[] args) {
	RemoteWebDriver driver= new ChromeDriver();
	driver.get("https://practice.automationtesting.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	List<WebElement> txtbox = driver.findElements(By.xpath("//input[@type='text']"));
	System.out.println(txtbox.size());
	for(WebElement txt:txtbox) {
		System.out.println(txt.getAttribute("placeholder"));
	}
	
//	List<WebElement> btn = driver.findElements(By.xpath("//input[@type='submit']"));
//	System.out.println(btn.size());
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	for(WebElement link:links) {
	
	System.out.println(link.getText());
	
	System.out.println("lnk_"+ link.getText());
	
	}

}

}
