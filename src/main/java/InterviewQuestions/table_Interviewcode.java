package InterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_Interviewcode {
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		scrollele(driver.findElement(By.xpath("//table[@id='countries']")));
		getdata("Zimbabwe", 1);
		Clicktablechk("Zimbabwe");
	}
	
	public static void scrollele(WebElement ele) {
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	public static void getdata(String cond,int getcol) {
		String tablexpath="//table[@id='countries']//tr//td/strong[text()='"+cond+"']/parent::td//following-sibling::td["+getcol+"]";
		String capital=driver.findElement(By.xpath(tablexpath)).getText();
		System.out.println(capital);
	}

	public static void Clicktablechk(String cond) {
		String tablexpath="//table[@id='countries']//tr//td/strong[text()='"+cond+"']/parent::td//preceding-sibling::td//input[@type='checkbox']";
		WebElement ele = driver.findElement(By.xpath(tablexpath));
		ele.click();
		System.out.println(ele.isDisplayed());
	}
}
