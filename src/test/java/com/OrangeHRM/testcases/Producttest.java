//package com.OrangeHRM.testcases;
//
//import java.util.HashMap;
//
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.OrangeHRM.Utilities.ExcelOperations;
//import com.OrangeHRM.pageobjects.AllTabsPage;
//import com.OrangeHRM.pageobjects.Loginpage;
//import com.OrangeHRM.pageobjects.Productpage;
//import com.testBase.testBase_old;
//
//public class Producttest extends testBase_old {
//
//	ExcelOperations excelopt= new ExcelOperations("Login");
//	
//	@Test(dataProvider="pdtdata",groups={"functional"})
//	public void TC02_ViewProduct(Object obj1) throws InterruptedException {
//		HashMap<String,String> hm= (HashMap<String,String>)obj1;
//		Loginpage.getinstance().loginapp(hm);
//		AllTabsPage.getinstance().Click_tabs("Products");
//		
//		Assert.assertTrue(Productpage.getinstance().verifytitle(),"Product title not displayed");
//		
//		Productpage.getinstance().Clickviewpdt();
//		Productpage.getinstance().verifyAllpdtdetails();
//		
//	}
//	
//	
//	
//	@DataProvider(name="pdtdata",indices={0})
//	public Object[][] productdata() {
//		
//		Object[][] obj= new Object[excelopt.getrow()][1];
//		int rowcnt = excelopt.getrow();
//		
//		for(int j=1;j<=rowcnt;j++) {
//			HashMap<String, String> testdata = ExcelOperations.gethashvalue(j);
//			obj[j-1][0]=testdata;
//		}
//		
//		return obj;
//		
//		
//	}
//}
