package com.OrangeHRM.pageobjects;

import org.openqa.selenium.By;

import com.OrangeHRM.Utilities.DriverFactory;
import com.OrangeHRM.Utilities.ExtentFactory;
import com.aventstack.extentreports.Status;
import com.testBase.testBase_old;

public class AllTabsPage extends testBase_old {

	//By locators

	By tab_Home=By.linkText(" Home");

	By tab_Products=By.xpath("//a[text()=' Products']");

	By tab_cart=By.linkText(" Cart");

	By tab_contact= By.linkText(" Contact us");
	By btn_testcase=By.xpath("//a//button[text()='Test Cases']");
	By txt_subscription = By.id("susbscribe_email");
	By scrol_arrow= By.id("scrollUp");
	
	//Methods

	public boolean checkbtn() {
		return isdisplayed(DriverFactory.getinstance().getdriver().findElement(btn_testcase),"Testcase");
	}
	
	public void Click_Pdt() {
		click(DriverFactory.getinstance().getdriver().findElement(tab_Products),"ProductLnk");
	}


	public void Click_tabs(String tabname) {
		try {
			String xpath= "//a[text()=' "+tabname+"']";

			DriverFactory.getinstance().getdriver().findElement(By.xpath(xpath)).click();
			ExtentFactory.getinstance().getextent().log(Status.PASS, "Tabname "+tabname+" is selected");
		}catch(Exception e){
			ExtentFactory.getinstance().getextent().log(Status.FAIL, "Tabname "+tabname+" is not selected due to exception"+ e);
		}
	}
	
	 public String validatetabs_landingpage(String tabname) {
		return  gettitle(tabname);
		 
	 }
	 public void checksubscription() {
		 scrolldown(DriverFactory.getinstance().getdriver().findElement(txt_subscription),"scroll to subscription element");
		 isdisplayed(DriverFactory.getinstance().getdriver().findElement(txt_subscription),"Subscription");
		 click(DriverFactory.getinstance().getdriver().findElement(scrol_arrow),"Scroll arrow");
	 }
	 

}
