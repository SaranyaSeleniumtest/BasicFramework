package com.testBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.OrangeHRM.Utilities.ActionEngine;
import com.OrangeHRM.Utilities.BrowserFactory;
import com.OrangeHRM.Utilities.DriverFactory;
import com.OrangeHRM.Utilities.ExtentFactory;
import com.OrangeHRM.Utilities.Propertiesfile;
import com.OrangeHRM.pageobjects.Loginpage;
import com.aventstack.extentreports.Status;

public class testBase extends ActionEngine {
	public BrowserFactory bf= new BrowserFactory();

	@BeforeMethod
	public void launchapp() throws IOException {
		String browser=Propertiesfile.getpropval("browser");
		System.out.println(browser);
		String url=Propertiesfile.getpropval("url");
		System.out.println(Propertiesfile.getpropval("environment"));
		

		System.out.println(url);
		
		
		WebDriver driver = bf.setbrowser(browser);
		DriverFactory.getinstance().setdriver(driver);
		//ExtentFactory.getinstance().getextent().log(Status.PASS,"Environment: "+env);
		DriverFactory.getinstance().getdriver().manage().window().maximize();
		DriverFactory.getinstance().getdriver().get(url);
		DriverFactory.getinstance().getdriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	@AfterMethod
	public void teardown() {
		DriverFactory.getinstance().getdriver().close();
		
	}

}
