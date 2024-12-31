package com.OrangeHRM.testcases;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OrangeHRM.Utilities.ExcelOperations;
import com.OrangeHRM.Utilities.ExtentFactory;
import com.OrangeHRM.pageobjects.AllTabsPage;
import com.OrangeHRM.pageobjects.Contactuspage;
import com.OrangeHRM.pageobjects.Loginpage;
import com.aventstack.extentreports.Status;
import com.testBase.testBase;

public class Contactustest extends testBase {
	Loginpage lp= new Loginpage();
	AllTabsPage tabs= new AllTabsPage();
	Contactuspage contact= new Contactuspage();
	ExcelOperations opt= new ExcelOperations("AddContact");
	
	
	@Test(dataProvider="data")
	public void TC007_verifycontactus(Object obj) throws InterruptedException {
		try {
			HashMap<String,String> datatable=(HashMap<String,String>)obj;
			lp.loginapp(datatable);
			tabs.Click_tabs("Contact us");
			contact.enter_contactusdetails(datatable);
			String alertmsg = handle_alerts("getmessage_Accept");
			assertEqualsString_custom(datatable.get("Alertmsg"),alertmsg,"alertmsg");
			assertEqualsString_custom(datatable.get("successmsg"),contact.getsuccesmsg(),"successmsg");
			ExtentFactory.getinstance().getextent().log(Status.PASS, "Add contact is successfull");
		}catch(Exception e) {
			ExtentFactory.getinstance().getextent().log(Status.FAIL, "Add contact is NOT successfull due to exception "+e.getMessage());

		}
}
	
	
	@DataProvider(name="data")
	public Object[][] contactdata() {
		int rowcnt=opt.getrow();
		Object obj[][]=new Object[rowcnt][1];
		for (int i=1;i<=rowcnt;i++) {
			HashMap<String,String> data= opt.gethashvalue(i);
			obj[i-1][0]=data;
		}
		return obj;
		
	}
	
	
}
