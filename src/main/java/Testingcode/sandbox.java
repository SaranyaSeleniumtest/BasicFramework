package Testingcode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sandbox {
	
	
	public static WebDriver driver;
	
	
	public static void launch() {
		driver= new ChromeDriver();
		
	}
	
	public static void normaltable(String condition) {
		driver.get("https://practice-automation.com/tables/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		String text = driver.findElement(By.xpath("//table//tr//td[text()='"+condition+"']/following-sibling::td")).getText();
		System.out.println("Price of "+condition+ ": "+text);
		
	}
	
	public static void pagination(String cond) {
		driver.get("https://practice-automation.com/tables/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		String xpath="//table//tr//td[text()='"+cond+"']//following-sibling::td";
		String txt=driver.findElement(By.xpath(xpath)).getText();
		System.out.println(txt);
	}
	
	public static void pagination2(String cond) throws InterruptedException {
		
		driver.get("https://practice-automation.com/tables/");
		driver.manage().window().maximize();
		scrollby(450);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		boolean valuefound=false;
		String beforexpath="//table[@id='tablepress-1']//tr";
		WebElement currentpageele= driver.findElement(By.xpath("//button[@role='link' and @class='dt-paging-button current']"));
		scrollby(currentpageele);
		Thread.sleep(3);
		String currentpageno=currentpageele.getText();
		List<WebElement> rowlst=driver.findElements(By.xpath(beforexpath));
		int nextpage = Integer.parseInt(currentpageno);
		int rowsize = rowlst.size();
		for(int r=1;r<=rowsize-1;r++) {
			if(driver.findElement(By.xpath("//table[@id='tablepress-1']//tr["+r+"]//td[2]")).getText().equalsIgnoreCase(cond)){
				String price=driver.findElement(By.xpath("//table[@id='tablepress-1']//tr["+r+"]//td[3]")).getText();
				System.out.println(price);
				valuefound=true;
				break;
			}
			if(r==rowsize-1 && driver.findElement(By.xpath("//button[@class='dt-paging-button disabled next']")).isDisplayed()) {
				System.out.println("value not found in any pages");
				valuefound=false;
				break;
			}
			if(r==rowsize-1 && valuefound==false) {
				
				 nextpage=nextpage+1;
				driver.findElement(By.xpath("//button[@role='link' and text()='"+nextpage+"']")).click();
				List<WebElement> rowlst1=driver.findElements(By.xpath(beforexpath));
				rowsize=rowlst1.size();
				r=1;
			}
			
		}
		
	}
	
	public static void scrollby(int axes) {
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+axes+")","");
		
	}
	
	public static void scrollby(WebElement ele) {
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", ele);
		
	}
	public static void main(String[] args) throws InterruptedException {
		launch();
//		normaltable("Laptop");
//		normaltable("Marbles");
//		pagination("Mexico");
		pagination2("Test");
	}

}
