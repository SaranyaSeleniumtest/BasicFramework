package com.OrangeHRM.pageobjects;

import org.openqa.selenium.By;

import com.OrangeHRM.Utilities.DriverFactory;
import com.testBase.testBase;

public class ViewCartpage extends testBase {
	By btn_checkout=By.linkText("Proceed To Checkout");
	By heading_Review=By.xpath("//h2[@class='heading' and text()='Review Your Order']");
	
	//INTERVIEW XPATH AXES
	By breadcrum_checkout=By.xpath("//div[@class='breadcrumbs']//a[text()='Home']//parent::li//following-sibling::li");
	
	public String getproductdetails(String description,String tblcompare) {
		//String xpath="//table[@id='cart_info_table']//td//a[text()='Blue Top']//ancestor::td/following-sibling::td[@class='cart_price'"
		
		String custom_xpath="//table[@id='cart_info_table']//td//a[text()='"+description+"']//ancestor::td/following-sibling::td[@class='"+tblcompare+"']/p";
		
		return DriverFactory.getinstance().getdriver().findElement(By.xpath(custom_xpath)).getText();
	}
	
	public void Clickcheckout() {
		click(DriverFactory.getinstance().getdriver().findElement(btn_checkout),"ProceedtoCheckout");
	}
	
	public boolean verifycheckoutpage() {
		return isdisplayed(DriverFactory.getinstance().getdriver().findElement(heading_Review), "Checkoutpage");
	}

	public boolean verifyReviewOrder() {
		return isdisplayed(DriverFactory.getinstance().getdriver().findElement(breadcrum_checkout), "Checkoutpage");
	}
	
//	public void ReviewYourorder() {
//		String tablexpath=	
//	}
}
