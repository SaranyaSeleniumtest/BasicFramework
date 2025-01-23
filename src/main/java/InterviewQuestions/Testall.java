package InterviewQuestions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Testall {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		options();
		window();
	}
	
	public static void options() {
		Actions act= new Actions(driver);
		WebElement ele = driver.findElement(By.linkText("Company"));
		
		act.moveToElement(ele).perform();
		WebElement ele2 = driver.findElement(By.linkText("About Us"));
		act.moveToElement(ele2).click().perform();
		Assert.assertTrue(driver.getTitle().contains("Get to Know Us"));
		
	}
	
	public static void window() {
		String parentwin=driver.getWindowHandle();
		System.out.println(parentwin);
		driver.findElement(By.xpath("//span[contains(text(),'Continue with Google')]")).click();
		Set<String> winhandles=driver.getWindowHandles();
//		List<String> lstwin= (ArrayList<String>)winhandles;
		Object[] win = winhandles.toArray();
		for(int i=0;i<win.length;i++) {
			driver.switchTo().window(win[i].toString());

			if(driver.getTitle().equalsIgnoreCase("Sign in - Google Accounts")) {
				System.out.println("do action");
				driver.findElement(By.name("identifier")).sendKeys("text");
				driver.close();
			}
		}
		driver.switchTo().window(parentwin).close();
	}

}
