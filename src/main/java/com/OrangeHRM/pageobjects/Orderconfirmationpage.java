package com.OrangeHRM.pageobjects;

import org.openqa.selenium.By;

import com.OrangeHRM.Utilities.DriverFactory;
import com.testBase.testBase;

public class Orderconfirmationpage extends testBase {

	//INTERVIEW XPATH CODE
	
	By msg_confirm=By.xpath("//h2[@class='title text-center']/following-sibling::p");
	By btn_continue=By.linkText("Continue");
	
	
	private Orderconfirmationpage() {
		
	}
	
//	public static Orderconfirmationpage
	
	
//	public String getOrderconfirmation() {
//		return gettext(DriverFactory.getinstance().getdriver().findElement(msg_confirm),"Orderconfirm");
//		
//	}
	
	public void clickcontinue() {
		click(DriverFactory.getinstance().getdriver().findElement(btn_continue),"continue");
	}
}
