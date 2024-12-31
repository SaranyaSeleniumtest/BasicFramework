package Testingcode;

import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verify {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		login();
		scroll();
		Thread.sleep(3000);
//		handleradio("Male");
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("lastname");
		driver.findElement(By.id("userNumber")).sendKeys("123456789123");
		Assert.assertEquals(driver.findElement(By.id("userNumber")).getText(),"123456789123");
//		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']//label")).click();
//		driver.findElement(By.xpath())
		
	}
	
	public static void login() {
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	
	public static void scroll() {
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("javascript:window.scrollBy(250,700)");

	}
	
	public static void handleradio(String condition) {
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='gender']"));
		System.out.println(radio.size());
		for(WebElement ele:radio) {
			if(ele.getAttribute("value").equalsIgnoreCase(condition)){
				ele.click();
				break;
				
			}
		}
	}
	
	public static void handledynamicprop() {

		
	}

}
