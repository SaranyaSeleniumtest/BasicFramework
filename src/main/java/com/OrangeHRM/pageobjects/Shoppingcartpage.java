package com.OrangeHRM.pageobjects;

import org.openqa.selenium.By;

import com.OrangeHRM.Utilities.DriverFactory;
import com.testBase.testBase;
import com.testBase.testBase_old;

public class Shoppingcartpage extends testBase {

	By btn_checkout=By.linkText("Proceed To Checkout");
	By lnk_login= By.xpath("Register / Login");
	
	public String shopping_gettitle() {
		return gettitle("Shopping");
	}
	
	public void Clicklogin() {
		click(DriverFactory.getinstance().getdriver().findElement(lnk_login),"Login");
		
	}
	
	
	public void Clickcheckout() {
		click(DriverFactory.getinstance().getdriver().findElement(btn_checkout),"ProceedtoCheckout");
	}
	
}
