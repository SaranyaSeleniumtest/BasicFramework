package InterviewQuestions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class winhandle {
	 static WebDriver driver;
	public static void main(String[] args) {
		
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		winhan("windowButton");
		winhan2("windowButton");
	}
	static void scrollby() {
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,250);");
	}
	public static void winhan(String id) {
		scrollby();
		System.out.println("window1 title: "+driver.getTitle());
		driver.findElement(By.id(id)).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Object[] array = windowHandles.toArray();
		System.out.println("number of windows open "+array.length);
		for(int i=0;i<array.length;i++) {
			driver.switchTo().window(array[i].toString());
			System.out.println("window1 title: "+driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
		}
	}
	
	
	
	public static void winhan2(String id) {
		scrollby();
		System.out.println("window1 title: "+driver.getTitle());
		driver.findElement(By.id(id)).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> win= (ArrayList<String>)windowHandles;
		
		for(int i=0;i<=win.size();i++) {
			driver.switchTo().window(win.get(i));
			System.out.println(driver.getCurrentUrl());
		}
		
	}


}
