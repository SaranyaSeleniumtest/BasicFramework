package InterviewQuestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing19 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
//		driver= new ChromeDriver();
//		driver.get("https://practice.expandtesting.com/dynamic-table");
//		table("Chrome");
		pyramid();
		
	}
	
	public static void followingtable(String cond) {
		String customexpath="//table//tr//td[text()='"+cond+"']/following-sibling::td[contains(text(),'Mbps')]";
		String text = driver.findElement(By.xpath(customexpath)).getText();
		System.out.println(text);
	}
	
	public static void gettablevalues(String cond) {
		List<WebElement> rows=driver.findElements(By.xpath("//table//tr"));
		
		for(int i=0;i<rows.size()-1;i++) {
		
		
		}
	}
	
	
	public static void pyramid() {
		int count=4;
		for(int i=1;i<=count;i++) {//iterating rows
			for(int j=count-1;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

}
