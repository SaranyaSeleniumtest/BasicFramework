package Testingcode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1912 {
	
	public static WebDriver driver;
	public static void launch() {
		driver= new ChromeDriver();
		
	}
	
	public static void enterdrop() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("uft testing");
//		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//ul/li[@role='presentation']"));
		System.out.println(ele.size());
		for(WebElement opt: ele) {
//			if(opt.getText().equalsIgnoreCase("selenium webdriver")) {
			
				System.out.println(opt.getText());
//				opt.click();
//				break;
//			}
		}
	}
	
	public static void table() {
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String xpath="//div[@role='rowgroup']//div[@role='gridcell'and text()='Alden']/following-sibling::div[5]";
		String text = driver.findElement(By.xpath(xpath)).getText();
		System.out.println(text);
		driver.findElement(By.xpath(xpath+"//span[@id='edit-record-1']")).click();
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		launch();
		table();
//		enterdrop();
	}

}
