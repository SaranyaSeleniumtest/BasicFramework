package InterviewQuestions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTestNGInterview {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
//		driver= new ChromeDriver();
////		driver.navigate().to("https://www.flipkart.com/");
////		driver.manage().window().maximize();
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//////		countlnks();
////		
////		screencapture();
////		generaterandomEmail();
//		table("India");
		name();
		}
	
	public static void countlnks(){
		List<WebElement> lnks = driver.findElements(By.tagName("a"));
		System.out.println(lnks.size());
		for (WebElement lnk : lnks) {
			System.out.println(lnk.getText());
	}
	
}
	
	public static void flipkartsearch() {
		driver.findElement(By.name("q")).sendKeys("mobiles");
		WebDriverWait wt= new WebDriverWait(driver, Duration.ofSeconds(3));
	
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		List<WebElement>elements=driver.findElements(By.xpath("//ul/li//a"));
		wt.until(ExpectedConditions.visibilityOfAllElements(elements));
		
		for(int i=0;i<elements.size();i++) {
//			if(ele.getText().equalsIgnoreCase("4g mobile")){
//				ele.click();
//				break;
//			}
			
			if(elements.get(i).getText().equalsIgnoreCase("mobiles 5g")) {
				elements.get(i).click();
				break;
			}
			else
				System.out.println("item not found");
			
		}
			
	}
	
	public static void screencapture() throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("src/test/resources/report.png");
		
		FileUtils.copyFile(source, dest);
		
	}
	
	
	public static void generaterandomEmail() {
		Date dt= new Date();
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy-hh-ss");
		String format = sdf.format(dt);
		String[] split = format.split("");
		System.out.println("abcdtest-"+split[0]+split[1]+split[2]+".com");
	}
	
	public static void scroll() {
		JavascriptExecutor jse= (JavascriptExecutor)driver;
//		
//		jse.executeScript("scroll(0,450);");
		jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//table")));
	}
	public static void table(String cond) {
		driver.get("https://sports.ndtv.com/icc-cricket-world-cup-2023/points-table");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		scroll();
		String xpath="//table//tr//td//a[text()='"+cond+"']//parent::td//following-sibling::td[2]";
		String wins=driver.findElement(By.xpath(xpath)).getText();
		System.out.println(wins);
		String xpath1="//table//tr//td//a[text()='India']//parent::td//following-sibling::td[3]";
		String loss=driver.findElement(By.xpath(xpath1)).getText();
		System.out.println(loss);
	}
	
	public static void name() {
		int nextInt = RandomUtils.nextInt();
		System.out.println(nextInt);
		String random = RandomStringUtils.random(6);
//		System.out.println(random.);
	}
	
	
}