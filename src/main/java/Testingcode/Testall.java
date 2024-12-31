package Testingcode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Testall {
	public static WebDriver driver;
	
	public static  void launch() {
		driver= new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	public static void main(String[] args) throws InterruptedException {
		launch();
		Thread.sleep(5000);
		action();
//		drop(driver.findElement(By.id("dropdowm-menu-1")),"SQL");
//		drop(driver.findElement(By.id("dropdowm-menu-2")),1);
//		drop(driver.findElement(By.id("dropdowm-menu-3")),"CSS");
//		boolean selected = driver.findElement(By.xpath("//input[@value='option-3']")).isSelected();
//		System.out.println(selected);
//		chk(driver.findElements(By.xpath("//input[@type='checkbox']/parent::label")),"Option 4");
////		driver.findElement(By.xpath("//input[@type='radio' and @value='blue']")).click();
//		rd(driver.findElements(By.xpath("//input[@type='radio' and @name='color']")),"blue");
	}
	public static void drop(WebElement ele,String cond) {
		try {
		Select sel= new Select(ele);
		sel.selectByVisibleText(cond);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
	
	public static void drop(WebElement ele,int val) {
		try {
		Select sel= new Select(ele);
		sel.selectByIndex(val);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
	
	
	public static void drop(WebElement ele,String val,boolean flag) {
		flag=false;
		try {
		Select sel= new Select(ele);
		sel.selectByValue(val);
		flag= true;
		
		List<WebElement> allopt=sel.getOptions();
		System.out.println(allopt.size());
			for(WebElement opt: allopt) {
				System.out.println(opt.getText());
			}
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
	

	public static void chk(List<WebElement> ele,String cond) {
		for(WebElement opt: ele) {
			System.out.println(opt.getText());
		if(opt.getText().equalsIgnoreCase(cond)){
			opt.click();
			
		}
		}
	}
	
	public static void rd(List<WebElement> ele, String cond) {
		for(WebElement opt: ele) {
			if(opt.getText().equalsIgnoreCase(cond)) {
				opt.click();
			}
		}
	}
	
	public static void action() {
		Actions act= new Actions(driver);
		act.doubleClick(driver.findElement(By.id("double-click"))).perform();
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).perform();
		WebElement ele= driver.findElement(By.xpath("//button[text()='Hover Over Me First!']"));
		act.moveToElement(ele).perform();
		driver.findElement(By.linkText("Link 1")).click();
		alert();
		act.moveToElement(driver.findElement(By.xpath("//button[text()='Hover Over Me Second!']"))).perform();
		driver.findElement(By.linkText("Link 1")).click();
		alert();
		
		act.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Third')]"))).perform();
		act.moveToElement(driver.findElement(By.linkText("Link 1"))).perform();
		
		
	}
	
	public static void alert() {	
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}
	
	
	public static void fileupload() {
		driver=new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("myFile")).click();
		
//	    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
//	    fileInput.sendKeys(uploadFile.getAbsolutePath());
//	    driver.findElement(By.id("file-submit")).click();
	}
	
	
}
