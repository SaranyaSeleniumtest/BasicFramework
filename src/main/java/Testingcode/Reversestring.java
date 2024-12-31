package Testingcode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Reversestring {

	public static WebDriver driver;
	public static WebDriverWait wait;

		public static void main(String[] args) {
			driver= new ChromeDriver();
			driver.get("https://cosmocode.io/automation-practice-handling-waits/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			System.out.println(driver.getTitle());
			driver.findElement(By.name("displayInput")).click();
			weddriverwait(driver.findElement(By.id("firstName")));
			driver.findElement(By.id("firstName")).sendKeys("load");
			driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
			Boolean flag = weddriverwait(driver.findElement(By.id("changeText")),"Terms & Conditions accepted");
			System.out.println(flag);
//			String terms=driver.findElement(By.id("changeText")).getText();
			Assert.assertTrue(flag,"Terms text not changed");
//			Assert.assertEquals(terms,"Terms & Conditions accepted","Terms text not changed");
			Assert.assertFalse(driver.findElement(By.id("submit")).isEnabled());
			driver.findElement(By.xpath("//a[contains(text(),'below')]")).click();
			weddriverwait_enable(driver.findElement(By.id("submit")));
			boolean enabled = driver.findElement(By.id("submit")).isEnabled();
			System.out.println(enabled);
			Assert.assertTrue(enabled);
			
//			driver.findElement(By.linkText("Click Me to open New Window")).click();
//			String winhan=win(1);
//			driver.switchTo().window(winhan);
//			System.out.println(driver.getTitle());
//			Select sel= new Select(driver.findElement(By.id("list-second-window")));
//			sel.selectByValue("1");
//			driver.findElement(By.linkText("Click Me To Open Third Window")).click();
//			driver.switchTo().window(win(2));
//			Select sel1= new Select(driver.findElement(By.id("list-third-window")));
//			sel1.selectByVisibleText("Third Window");
//			System.out.println(driver.getTitle());
//			driver.close();
//			
//			driver.findElement(By.xpath("//a[text()='Click Me to get Alert']")).click();
//			alert();
//			clickradio(driver.findElements(By.xpath("//input[@type='Radio']")),"donotknow");
//			clickcheck(driver.findElements(By.xpath("//input[@type='Checkbox']")),"Python");
//			dynamictable_preceding();
//			System.out.println(dynamictable_following());
//			tablecode();
//			Printtablecode();
//			countcheckbox();
//			stringrev("Testing");
//		String inputString = "test";
//		String outputString = "";
//
//		/*
//		* Writing a for loop and looping in the reverse order to get the reverse String
//		* as output.
//		*/
//		
////		System.out.println(inputString.length());
//		for (int i = inputString.length() - 1; i >= 0; i--) {
//			System.out.println(i);
//		outputString = outputString + inputString.charAt(i);
//		System.out.println(outputString);
//		
//		}
//		if(outputString.equalsIgnoreCase(inputString)) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
//		
		}

		public static void verifywait() {
			
		}
		public static void alert() {
			Alert alert=driver.switchTo().alert();
			String msg=alert.getText();
			System.out.println(msg);
			
			alert.accept();
		}
		
		public static void dynamictable_preceding() {
			login();
			String xpath="//table[@id='countries']//tr//td/strong[text()='Liechtenstein']/parent::td/preceding-sibling::td/input[@type='checkbox']";
			
			driver.findElement(By.xpath(xpath)).click();
		}
		
		
		public static String dynamictable_following() {
			login();
			String xpath="//table[@id='countries']//tr//td/strong[text()='Antigua & Barbuda']/parent::td/following-sibling::td[2]";
			
			return driver.findElement(By.xpath(xpath)).getText();
		}
		public static void login() {
			
			driver=new ChromeDriver();
			driver.get("https://cosmocode.io/automation-practice-webtable/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
		public static void tablecode() {
			login();
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']//tr"));
			for(int r=1;r<=rows.size();r++) {
				String country = driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]//td[2]")).getText();
				if(country.equalsIgnoreCase("Rwanda")) {
					String currency = driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]//td[4]")).getText();
					System.out.println(currency);
					driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]//td[1]//input[@type='checkbox']")).click();
					break;
				}
			}
		}
		
		public static void countcheckbox() {
			login();
			List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']/parent::td/following-sibling::td/strong"));
			System.out.println(elements.size());
			for(WebElement ele:elements) {
				System.out.println(ele.getText());
			}
		}
		
		
		public static void clickcheck(List<WebElement>chks,String cond) {
			
			driver.get("https://cosmocode.io/automation-practice/#google_vignette");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//			JavascriptExecutor jse= (JavascriptExecutor)driver;
//			jse.executeScript("Javascript:windows.scrollby",("250,500"));
			
//			System.out.println(chks.size());
			for(WebElement ele: chks) {
				if(ele.getText().equalsIgnoreCase(cond)) {
				ele.click();
			}
		}
		}
		
		
		public static void clickradio(List<WebElement>ele,String cond) {
			
			
			for(WebElement rd: ele) {
				System.out.println(rd.getAttribute("value"));
				if(rd.getAttribute("value").equalsIgnoreCase(cond)) {
					rd.click();
					boolean select=rd.isSelected();
					System.out.println(select);
					break;
				}
			}
		}
		
		public static void Printtablecode() {
			login();
			List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']//tr"));
			for(int r=1;r<=rows.size();r++) {
				String country = driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]//td[2]")).getText();
//					System.out.println(country);
					String currency = driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]//td[4]")).getText();
					System.out.println(country+"--->"+currency);
					driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]//td[1]//input[@type='checkbox']")).click();
					
					
				
			}
		}
		
		public static void weddriverwait(WebElement ele) {
			wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(ele));
			
		}
		
		public static WebElement weddriverwait_enable(WebElement ele) {
			wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			return wait.until(ExpectedConditions.elementToBeClickable(ele));
			
		}
		
		public static boolean weddriverwait(WebElement ele,String text) {
			boolean until=false;
			try {
			wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			until = wait.until(ExpectedConditions.textToBePresentInElement(ele, text));
			}catch(Exception e) {
				System.out.println(text +" not appeare within the time out due to exception"+ e.getMessage());
				return until;
			}
			
			return until;
		}
		
		public static String win(int windowindex) {
			String winhan1=driver.getWindowHandle();
			Set<String> winhan2=driver.getWindowHandles();
			List<String> listwin=  new ArrayList<String>(winhan2);
			System.out.println(listwin.size());
			return listwin.get(windowindex);
			
		}
		public static String stringrev(String str) {
			StringBuilder strbuild=new StringBuilder(str);
			
			String st1= strbuild.reverse().toString();
			System.out.println(st1);
			return st1;
		}
		}



