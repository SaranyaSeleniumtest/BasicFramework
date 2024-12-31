package Testingcode;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Test2512 {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
//		launch();
//		chk(driver.findElements(By.xpath("//input[@type='checkbox']")),"Cricket");
//		chk(driver.findElements(By.xpath("//input[@type='checkbox']")),"Hockey");
//		chk(driver.findElements(By.xpath("//input[@type='checkbox']")),"Movies");
//		rd(driver.findElements(By.xpath("//input[@type='radio']")),"Male");
//		sel(driver.findElement(By.id("Skills")),"Android");
////		sel(driver.findElement(By.id("countries")),"")
//		driver.findElement(By.xpath("//span[@class='selection']")).click();
//		dropdown(driver.findElements(By.xpath("//ul[@id='select2-country-results']//li")),"India");
//		Actions act= new Actions(driver);
//		act.moveToElement(driver.findElement(By.linkText("More"))).perform();
//		act.moveToElement(driver.findElement(By.linkText("Dynamic Data"))).click().perform();
		
		rev();
	}

	public static void launch() {
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
//		driver.findElement(By.id("checkbox3")).click();
	
	}
	
	public static void chk(List<WebElement> ele, String cond) {
		for(WebElement opt:ele) {
			if(opt.getAttribute("value").equalsIgnoreCase(cond)) {
				opt.click();
				break;
			}
		}
	}
	
	public static void rd(List<WebElement> ele, String cond) {
		for(WebElement opt:ele) {
			if(opt.getAttribute("value").equalsIgnoreCase(cond)) {
				opt.click();
				break;
			}
		}
	}
	
	
	public static void sel(WebElement ele,String cond) {
		try {
		Select obj= new Select(ele);
		
		obj.selectByVisibleText(cond);
		}catch(NoSuchElementException e) {
			Assert.fail();
			
		}
	}

	public static void dropdown(List<WebElement> drop, String cond) {
		
		for(WebElement ele: drop) {
			if(ele.getText().equalsIgnoreCase(cond)) {
				ele.click();
				break;
			}
		}
	}
	
	
	public static void rev() {
		String input="test190sar";
		String output="";
		Pattern compile = Pattern.compile("\\d");
		for(int i=input.length()-1;i>=0;i--) {
			
			if(input.matches("9")) {
				
			}
			
			else {
			output=output+input.charAt(i);
			}
		}
		System.out.println(output);
	}

}
