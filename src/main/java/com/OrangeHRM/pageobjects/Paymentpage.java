package com.OrangeHRM.pageobjects;

import java.util.HashMap;

import org.openqa.selenium.By;

import com.OrangeHRM.Utilities.DriverFactory;
import com.OrangeHRM.Utilities.ExtentFactory;
import com.aventstack.extentreports.Status;
import com.testBase.testBase;

public class Paymentpage extends testBase {
	
	By breadcrumb_payment=By.xpath("//div[@class='breadcrumbs']//li[text()='Payment']");
	By txt_name=By.name("name_on_card");
	By txt_cardNum=By.name("card_number");
	By txt_cvc=By.name("cvc");
	By txt_monthexpiry=By.name("expiry_month");
	By txt_yearexpiry=By.name("expiry_year");
	By btn_confirmorder=By.id("submit");
	
	
	
	public void validatepaymentpage() {
		
		click(DriverFactory.getinstance().getdriver().findElement(breadcrumb_payment),"Payment page");
	}

	
	public void enter_paymentdetails(HashMap<String,String>hm) {
		try {
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txt_name), hm.get("payeename"),"Payeename");
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txt_cardNum), hm.get("cardnum"),"Cardnum");
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txt_cvc), hm.get("cvc"),"cvc");
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txt_monthexpiry), hm.get("monthexpiry"),"monthexpiry");
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txt_yearexpiry), hm.get("yearexpiry"),"yearexpiry");
		ExtentFactory.getinstance().getextent().log(Status.PASS,"Entered payment details successully");
		}catch(Exception e) {
		ExtentFactory.getinstance().getextent().log(Status.FAIL,"Payment detail filling failed due to exception "+e.getMessage());
		}
	}
	
	public void clickconfirmorder() {
		click(DriverFactory.getinstance().getdriver().findElement(btn_confirmorder),"PayandConfirmorder");
	}
	
}
