package InterviewQuestions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider="test",groups= {"smoke"})
	public void loginscenario(String user,String pass) {
		//a[normalize-space()='Signup / Login']
		//a[normalize-space()='Signup / Login']
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		
		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@DataProvider(name="test")
	public Object[][] testdata() {
		Object[][] obj= {{"utest1","pass1"},
				{"utest2","pass2"}};
		return obj;
		}
		
	
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	

}
