package Testingcode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		verify();
		
	}
	
	
	
	public static void verify() throws InterruptedException {
		driver=new ChromeDriver();
		DF.getinstance().setdriver(driver);
		DF.getinstance().getdriver().get("https://selectorshub.com/iframe-scenario/");

//		driver.get("https://selectorshub.com/iframe-scenario/");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		switchframe("pact1");
		
		driver.findElement(By.id("inp_val")).sendKeys("test");
		switchframe("pact2");
		driver.findElement(By.id("jex")).sendKeys("tester");
		switchframe(driver.findElement(By.xpath("//iframe[@id='pact3']")));
		driver.findElement(By.id("glaf")).sendKeys("final");
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		String parentframetext = driver.findElement(By.xpath("//h3[contains(text(),'Dare')]")).getText();
		System.out.println(parentframetext);
	}
	
	public static void switchframe(String idOrname) {
		driver.switchTo().frame(idOrname);
	}
	
	public static void switchframe(int index) {
		driver.switchTo().frame(index);
	}
	
	public static void switchframe(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	
	

	
}
