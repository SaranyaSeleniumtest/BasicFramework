package com.OrangeHRM.pageobjects;

import java.util.HashMap;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.OrangeHRM.Utilities.DriverFactory;
import com.testBase.testBase;

public class Contactuspage extends testBase {
	
	By txt_name=By.name("name");
	By txt_email=By.name("email");
	By txt_subject=By.name("subject");
	By txt_msg=By.id("message");
	By btn_choosefile=By.xpath("//input[@name='upload_file']");
	By btn_submit=By.name("submit");
	By btn_Home=By.xpath("//a[@class='btn btn-success']//child::i");
	By msg_success=By.xpath("//div[@class='status alert alert-success']");
	//Press OK to proceed!
	//Success! Your details have been submitted successfully.

	
	public void enter_contactusdetails(HashMap<String,String>hm) {
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txt_name),hm.get("name"),"Name");
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txt_email),generate_email(),"Email");
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txt_subject),hm.get("subject"),"Subject");
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txt_msg),hm.get("message"),"name");
		click(DriverFactory.getinstance().getdriver().findElement(btn_submit),"Submit");
	}
	
	
	public String getsuccesmsg() {
		return gettext(DriverFactory.getinstance().getdriver().findElement(msg_success),"Successmsg");
	}
	
	}

