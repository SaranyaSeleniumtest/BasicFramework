package com.OrangeHRM.testcases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OrangeHRM.Utilities.ExcelOperations;
import com.OrangeHRM.Utilities.ExtentFactory;
import com.OrangeHRM.pageobjects.Loginpage2;
import com.aventstack.extentreports.Status;
import com.testBase.testBase;

public class Loginpagetest extends testBase  {
	
	ExcelOperations excel =new ExcelOperations("data");
	Loginpage2 lp= new Loginpage2();
	
	
	@Test(dataProvider="login")
	public void Verifylogin(Object obj1) {
		try {
		HashMap<String,String> hm= (HashMap<String,String>)obj1;
		lp.loginapp(hm);
		Assert.assertEquals(lp.getmessage(),hm.get("message"));
		ExtentFactory.getinstance().getextent().log(Status.PASS, "Login is succcessful");
		}catch(Exception e) {
			ExtentFactory.getinstance().getextent().log(Status.FAIL, "Login is NOT succcessful");
			Assert.fail();
		}
	}
	
	
	@DataProvider(name="login")
	public Object[][] logindata() {
		
		Object[][]obj=new Object[excel.getrow()][1];
		
		for(int i=1;i<=excel.getrow();i++) {
			HashMap<String,String>data=excel.gethashvalue(i);
			  obj[i-1][0]=data;
		}
		
		return obj;
		
	}

}
