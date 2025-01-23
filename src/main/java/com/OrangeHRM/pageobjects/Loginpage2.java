package com.OrangeHRM.pageobjects;

import java.util.HashMap;

import org.openqa.selenium.By;

import com.OrangeHRM.Utilities.DriverFactory;
import com.testBase.testBase;

public class Loginpage2 extends testBase{
	
	By txt_user=By.id("username");
	By txt_pass=By.id("password");
	By  btn_login=By.xpath("//button[normalize-space()='Login']");
	By msg_confirm=By.xpath("//h4[contains(text(),'Secure Area')]");
	//methods
	
	public void loginapp(HashMap<String,String> hm) {
		scrolldown(700);
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txt_user),"User",hm.get("user"));
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txt_pass),"password",hm.get("pass"));
		click(DriverFactory.getinstance().getdriver().findElement(btn_login), "login");
	}
	
	public String getmessage() {
		return gettext(DriverFactory.getinstance().getdriver().findElement(msg_confirm),"confirm_msg");
		
	}
	
	
	
}
