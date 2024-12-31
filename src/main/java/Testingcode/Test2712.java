package Testingcode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2712 {

	@Test(dataProvider ="login",priority=0,enabled=false)
	public void Login(String user,String pass) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		
	}
	
	
	@Test(dataProvider="flip",priority = 1,enabled=true)
	public void flipkart(String product) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.name("q")).sendKeys(product);
		Thread.sleep(3000);
		List<WebElement>ele=driver.findElements(By.xpath("//ul//li"));
		System.out.println(ele.get(4).getText());
		ele.get(4).click();
	}
	
	@DataProvider(name="flip")
	public Object[][] testdata() {
		Object obj2[][]= {{"shoes"},{"laptop"}};
		return obj2;
		
	}
	
	@DataProvider(name="login")
	public Object data() {
		
		Object obj[][]= {{"test1","pass1"},
				{"test2","pass2"},
				{"test3","pass3"}};
		
		return obj;
		
		}
	}

