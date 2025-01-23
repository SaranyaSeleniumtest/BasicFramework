package InterviewQuestions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (WebElement e : links) {
			String url=e.getAttribute("href");
//			System.out.println(url);
			findbrokenlnk(url);
		}
		
		
	}
	public static void name(String url) throws IOException {
		URL newurl= new URL(url);
		HttpURLConnection httpurl= (HttpURLConnection)newurl.openConnection();
		httpurl.connect();
		if(httpurl.getResponseCode()>400) {
			System.out.println(newurl+ httpurl.getResponseMessage()+" i a broken link");
		}
		
		
		
	}
	public static void findbrokenlnk(String url) throws IOException {
		URL lnkurl= new URL(url);
		HttpURLConnection httpurl= (HttpURLConnection) lnkurl.openConnection();
		httpurl.connect();
		if(httpurl.getResponseCode()>400) {
			System.out.println(url+"--"+ httpurl.getResponseMessage()+" is a broken link");

		}
		
	}
	

}
