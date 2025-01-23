package InterviewQuestions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0901 {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> lnks=driver.findElements(By.tagName("a"));
		System.out.println(lnks.size());
		for (WebElement lnk : lnks) {

			String attribute = lnk.getAttribute("href");
//			if(!attribute.equalsIgnoreCase(null)) {
				brokenlnks(attribute);
//			}

		}

	}
	public static void brokenlnks(String url)  {
		URL newurl=null;
		try {
			newurl = new URL(url);
	

		HttpURLConnection httpconnection;
		
			httpconnection = (HttpURLConnection)newurl.openConnection();
			httpconnection.setConnectTimeout(3000);
			httpconnection.connect();
			int responseCode = httpconnection.getResponseCode();

			if(responseCode>400) {
				System.out.println(url+ "-->"+httpconnection.getResponseMessage()+" is a broken link");
			}
			else if(responseCode==200){
				System.out.println(url+"-->"+httpconnection.getResponseMessage());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
