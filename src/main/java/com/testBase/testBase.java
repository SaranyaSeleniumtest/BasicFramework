package com.testBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.OrangeHRM.Utilities.ActionEngine;
import com.OrangeHRM.Utilities.BrowserFactory;
import com.OrangeHRM.Utilities.DriverFactory;
import com.OrangeHRM.Utilities.ExtentFactory;
import com.OrangeHRM.Utilities.Propertiesfile;
import com.OrangeHRM.pageobjects.AllTabsPage;
import com.OrangeHRM.pageobjects.Loginpage;
import com.aventstack.extentreports.Status;

public class testBase extends ActionEngine {
	public BrowserFactory bf= new BrowserFactory();

	
	@Parameters({"browser"})
	@BeforeMethod
	public void launchapp(String brow) throws IOException {
		//String browser=Propertiesfile.getpropval("browser");
		String browser= brow;
		System.out.println(browser);
//		ExtentFactory.getinstance().getextent().log(Status.PASS,"Browser Used: "+brow);
		String url=Propertiesfile.getpropval("url");
		System.out.println(Propertiesfile.getpropval("environment"));
		

		System.out.println(url);
		
		
		WebDriver driver = bf.setbrowser(browser);
		DriverFactory.getinstance().setdriver(driver);
		//ExtentFactory.getinstance().getextent().log(Status.PASS,"Environment: "+env);
		//DriverFactory.getinstance().getdriver().manage().window().maximize();
		DriverFactory.getinstance().getdriver().get(url);
		DriverFactory.getinstance().getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
	@AfterMethod
	public void teardown() {
		DriverFactory.getinstance().getdriver().quit();;
		
	}

}
