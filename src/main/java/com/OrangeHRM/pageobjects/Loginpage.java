package com.OrangeHRM.pageobjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.OrangeHRM.Utilities.DriverFactory;
import com.testBase.testBase;

public class Loginpage extends testBase {

	private By txtpassword=By.name("password");
	
	private By txtemail=By.name("email");
	
	private By btnLogin=By.xpath("//button[@type='submit' and text()='Login']");
	
	private By lnkLogin= By.xpath("//a[contains(text(),'Login')]");
	
	
	
	public void loginapp(HashMap<String,String>hm) throws InterruptedException {
		try {
		click(DriverFactory.getinstance().getdriver().findElement(lnkLogin),"Login_lnk");
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txtemail),hm.get("Email"),"EmailAddress");
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txtpassword),hm.get("Password"),"Password");
		click(DriverFactory.getinstance().getdriver().findElement(btnLogin),"Login_btn");
		}catch(Exception e)	{
			System.out.println("The exception is " +e.getMessage());
			Assert.fail();
		}
	}
	
	
	public void loginapp(String user,String pass) throws InterruptedException {
		try {
		click(DriverFactory.getinstance().getdriver().findElement(lnkLogin),"Login_lnk");
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txtemail),user,"EmailAddress");
		Thread.sleep(3000);
		System.out.println(user);
		System.out.println(pass);
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txtpassword),pass,"Password");
		click(DriverFactory.getinstance().getdriver().findElement(btnLogin),"Login_btn");
		}catch(Exception e)	{
			System.out.println("The exception is " +e.getMessage());
			Assert.fail();
		}
	}
}
