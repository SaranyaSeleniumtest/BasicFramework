package InterviewQuestions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findhighprice {
	
	public static void main(String[] args) {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> lst=driver.findElements(By.cssSelector("[class='a-price-whole']"));
//		List<Integer> val= new ArrayList<Integer>();
		Map<WebElement,Integer> val= new HashMap<WebElement,Integer>();
		for(WebElement e: lst) {
//			int price = ;
			val.put(e, Integer.parseInt(e.getText().replaceAll(",","")));
		}
	
		List<Entry<WebElement,Integer>> mobile= new ArrayList(val.entrySet());
		mobile.sort(Entry.comparingByValue());
		for (Entry<WebElement, Integer> entry : mobile) {
			System.out.println(entry.getValue());
		}
		mobile.get(mobile.size()-1).getKey().click();
		
//		Collections.sort(val);
//		System.out.println("After sort");
//		for(Integer price: val) {
//			System.out.println(price);
//		}
	
	}

}
