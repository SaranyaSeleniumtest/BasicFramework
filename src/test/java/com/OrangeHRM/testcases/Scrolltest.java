package com.OrangeHRM.testcases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OrangeHRM.Utilities.ExcelOperations;
import com.OrangeHRM.Utilities.ExtentFactory;
import com.OrangeHRM.pageobjects.AllTabsPage;
import com.OrangeHRM.pageobjects.Loginpage;
import com.aventstack.extentreports.Status;
import com.testBase.testBase;

public class Scrolltest extends testBase {
	public Loginpage lp = new Loginpage();
	public AllTabsPage tabs= new AllTabsPage();
	ExcelOperations excelopt= new ExcelOperations("Login");
	
//	Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
//	1. Launch browser
//	2. Navigate to url 'http://automationexercise.com'
//	3. Verify that home page is visible successfully
//	4. Scroll down page to bottom
//	5. Verify 'SUBSCRIPTION' is visible
//	6. Click on arrow at bottom right side to move upward
//	7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

	@Test(dataProvider="testdata")
	public void verifyscrollpage(Object obj) throws InterruptedException {
		HashMap<String,String> hm= (HashMap<String,String>)obj;
		try {
		lp.loginapp(hm);
		
		tabs.checksubscription();
		Assert.assertTrue(tabs.checkbtn());
		ExtentFactory.getinstance().getextent().log(Status.PASS,"Scroll functionality is successfull");
		}catch(Exception e) {
			ExtentFactory.getinstance().getextent().log(Status.FAIL,"Scroll functionality failed due to exception: "+ e.getMessage());
			Assert.fail();
		}
	}
	
	@DataProvider(indices = {0})
	public Object[][] testdata() {
		Object obj[][]= new Object[excelopt.getrow()][1];
		
		for(int r=1;r<=excelopt.getrow()-1;r++) {
			HashMap<String,String> data=excelopt.gethashvalue(r);
			obj[r-1][0]=data;
		}
		
		
		return obj;
		
	}
}
