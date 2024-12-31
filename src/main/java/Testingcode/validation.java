package Testingcode;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class validation {


	public static WebDriver driver;
	
	public static void selectortable() {
		dynamictable("Kevin.Mathews");
		fixedtable_performaction("Kevin Mathews",4,1);
		getDatafromtable_follow("resultTable","John Smith");
		getDatafromtable_preceed("resultTable","John Smith");
		fixedtable_performaction("windows",2,1);
	}
	public static void main(String[] args) throws InterruptedException {
		verify();
		//fixedtable_getdatacell("Magazzini Alimentari Riuniti",1,3);
		tbl("Blue Star");
		
		}

	
	public static void selectorhub() {
		select(driver.findElement(By.id("cars")),"audi");
		//Thread.sleep(3000);
		select(driver.findElement(By.id("cars")),1);
		//Thread.sleep(3000);
		selectvisibletxt(driver.findElement(By.id("cars")),"Opel");
		
		mousemove(driver.findElement(By.xpath("//button[text()='Checkout here']")));
		
		drop_select(driver.findElements(By.xpath("//div[@class='dropdown-content']//a")),"SHub Youtube Channel");
//		drop_select(driver.findElements(By.xpath("//div[@class='dropdown-content']//a")),"Try TestCase Studio");
//		drop_select(driver.findElements(By.xpath("//div[@class='dropdown-content']//a")),"Join Training");
	windowshandle();
	}
	public static void verify() {
		driver=new ChromeDriver();
		//driver.get("https://selectorshub.com/xpath-practice-page/");
		//driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	
	public static void fixedtable_performaction(String Condition,int col,int clickcol) {
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		for (int row=1;row<=rows.size();row++)
		{

			String user=driver.findElement(By.xpath("//table//tr["+row+"]//td["+col+"]")).getText();
			if(user.equalsIgnoreCase(Condition)) {
				driver.findElement(By.xpath("//table//tr["+row+"]//td["+clickcol+"]//input")).click();
				break;
			}
		}
	}
	
	
	
	public static void fixedtable_getdatacell(String Condition,int col,int getcol) {
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		for (int row=2;row<=rows.size();row++)
		{

			String user=driver.findElement(By.xpath("//table//tr["+row+"]//td["+col+"]")).getText();
			if(user.equalsIgnoreCase(Condition)) {
				System.out.println(driver.findElement(By.xpath("//table//tr["+row+"]//td["+getcol+"]")).getText());
				break;
			}
		}
	}
	
	//INTERVIEW CODE FOR DYNAMIC TABLE
	//compare username and click on checkbox
	public static void dynamictable(String condition) {
		String xpath="//table[@id='resultTable']//tbody//td//a[text()='"+condition+"']//parent::td//preceding-sibling::td//input";
		
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static String getdatafromtable() {
		String data;
		String xpath="//table[@id='resultTable']//tbody//td[text()='Jordan Mathews']//following-sibling::td";
		data=driver.findElement(By.xpath(xpath)).getText();
		System.out.println(data);
		return data;
	}
	
	public static String getDatafromtable_follow(String tableid,String condition) {
		String data;
//		String xpath="//table[@id='resultTable']//tbody//td[text()='Jordan Mathews']//following-sibling::td";
		
		String xpath="//table[@id='"+tableid+"']//tbody//td[text()='"+condition+"']//following-sibling::td";
		data=driver.findElement(By.xpath(xpath)).getText();
		System.out.println(data);
		return data;
	}
	
	
	public static String getDatafromtable_preceed(String tableid,String condition) {
		String data;
//		String xpath="//table[@id='resultTable']//tbody//td[text()='Jordan Mathews']//following-sibling::td";
		
		String xpath="//table[@id='"+tableid+"']//tbody//td[text()='"+condition+"']//preceding-sibling::td[1]";
		data=driver.findElement(By.xpath(xpath)).getText();
		System.out.println(data);
		return data;
	}
	
	
	public static void select(WebElement ele,String selopt) {
		Select sel=new Select(ele);
		sel.selectByValue(selopt);
		
	}
	
	public static void select(WebElement ele,int selopt) {
		Select sel=new Select(ele);
		sel.selectByIndex(selopt);
		
	}
	
	public static void selectvisibletxt(WebElement ele,String selopt) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(selopt);
		
	}
	
	public static void mousemove(WebElement ele) {
		Actions act= new Actions(driver);
		act.moveToElement(ele).build().perform();
	}
	
	public static void drop_select(List<WebElement> ele,String dropopt) {
		for(WebElement opt:ele) {
			if(opt.getText().equalsIgnoreCase(dropopt)) {
				System.out.println(opt.getText());
				opt.click();
				break;
			}
		}
	}
	
	
	public static void windowshandle() {
		String windowHandle = driver.getWindowHandle();
		
		Set<String> winhan2 = driver.getWindowHandles();
		List<String> win= new ArrayList<String>(winhan2);
		System.out.println(win.size());
		driver.switchTo().window(win.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}
	
	public static void tbl(String company) {
		List<WebElement> elements=driver.findElements(By.xpath("//table//tr"));
		int row = elements.size();
		for(int r=1;r<row-1;r++) {
			String text = driver.findElement(By.xpath("//table//tr["+r+"]//td[1]/a")).getText();
			//if(text.equalsIgnoreCase(company)) {
			String prevclose=driver.findElement(By.xpath("//table//tr["+r+"]//td[3]")).getText();
				String currentprice=driver.findElement(By.xpath("//table//tr["+r+"]//td[4]")).getText();
				String change=driver.findElement(By.xpath("//table//tr["+r+"]//td[5]")).getText();
				System.out.println(text+"--"+prevclose+ "----" +currentprice+"----"+change);
				//break;
		//	}
		}
	}
	
	
}


