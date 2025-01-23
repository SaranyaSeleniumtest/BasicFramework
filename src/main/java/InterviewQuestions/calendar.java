package InterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendar {
	
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"))));
		datepicker("May","2026",25);
	}
	
	public static String[] getdate(String date) {
		String[] split = date.split(" ");
		return split;
	}
	public static void datepicker(String Expecyear,String Expecmonth, int day) {
		String date = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(date);
		String[] getdate = getdate(date);

		while(!Expecyear.equals(getdate[0])&& Expecmonth.equals(getdate[1]) ) {
			driver.findElement(By.xpath("//a[@data-handler='next']//span")).click();
			date=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			 getdate = getdate(date);

		}
		
		driver.findElement(By.xpath("//a[@class='ui-state-default'][text()="+day+"]")).click();
		
		
	}

}
