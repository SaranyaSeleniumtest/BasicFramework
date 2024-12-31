package com.OrangeHRM.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OrangeHRM.Utilities.ExcelOperations;
import com.OrangeHRM.pageobjects.Loginpage;
import com.testBase.testBase;

public class Recommendationtest extends testBase {

	ExcelOperations excelopt= new ExcelOperations("Login");
	Loginpage lp= new Loginpage();
	
	
	@Test(dataProvider="login")
	public void verifyaddcart_recommendation(String user,String pass) throws InterruptedException {
		lp.loginapp(user, pass);
	}
	
	@DataProvider(name="login")
	public Object[][] testdata() {
		
		Object[][] obj= {{"test"},{"pass"}};
		
		return obj;
		
	}
	
}
