package com.OrangeHRM.pageobjects;

import org.openqa.selenium.By;

import com.OrangeHRM.Utilities.DriverFactory;
import com.testBase.testBase;
import com.testBase.testBase_old;

public class Shoppingcartpage extends testBase {

	By btn_checkout=By.linkText("Proceed To Checkout");
	By lnk_login= By.xpath("Register / Login");
	By lnk_Clickhere=By.linkText("here");
	By msg_emptycart=By.xpath("//span[@id='empty_cart']//b");
	
	public String shopping_gettitle() {
		return gettitle("Shopping");
	}
	
	public void Clicklogin() {
		click(DriverFactory.getinstance().getdriver().findElement(lnk_login),"Login");
		
	}
	
	
	public void Clickcheckout() {
		click(DriverFactory.getinstance().getdriver().findElement(btn_checkout),"ProceedtoCheckout");
	}
	
	public void Clickhere() {
		click(DriverFactory.getinstance().getdriver().findElement(lnk_Clickhere),"clickhere to buy");
	}
	
	public String getcartmsg() {
		return gettext(DriverFactory.getinstance().getdriver().findElement(msg_emptycart),"Empty cart");
	}
	
}
