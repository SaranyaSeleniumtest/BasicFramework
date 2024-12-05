package com.OrangeHRM.pageobjects;

import java.util.HashMap;

import org.openqa.selenium.By;

import com.OrangeHRM.Utilities.DriverFactory;
import com.testBase.testBase;

public class Checkoutpage extends testBase {
	
	By btn_placeorder=By.linkText("Place Order");
	
	
	//INTERVIEW XPATH AXES
	By breadcrum_checkout=By.xpath("/ /div[@class='breadcrumbs']//a[text()='Home']//parent::li//following-sibling::li");
	
	public String getcheckoutdetails(String description,String tblcompare) {
		//String xpath="//table[@class='table table-condensed']//tbody//a[text()='Blue Top']/ancestor::td/following-sibling::td[@class='cart_price']"
		
		String custom_xpath="//table[@class='table table-condensed']//td//a[text()='"+description+"']/ancestor::td/following-sibling::td[@class='"+tblcompare+"']/p";
		
		return DriverFactory.getinstance().getdriver().findElement(By.xpath(custom_xpath)).getText();
	}

	
	public boolean verifycheckoutpage() {
		return isdisplayed(DriverFactory.getinstance().getdriver().findElement(breadcrum_checkout), "Checkoutpage");
	}
	
	
	
	public void ClickPlaceOrder() {
		click(DriverFactory.getinstance().getdriver().findElement(btn_placeorder),"PlaceOrder");
	}

	

}
