//package com.OrangeHRM.testcases;
//
//import java.util.HashMap;
//
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.OrangeHRM.Utilities.ExcelOperations;
//import com.OrangeHRM.Utilities.ExtentFactory;
//import com.OrangeHRM.pageobjects.AllTabsPage;
//import com.OrangeHRM.pageobjects.Loginpage;
//import com.OrangeHRM.pageobjects.Productpage;
//import com.OrangeHRM.pageobjects.Shoppingcartpage;
//import com.aventstack.extentreports.Status;
//import com.testBase.testBase;
//
//public class CartTest extends testBase {
//	
//	
//	
//	Productpage pdt= new Productpage();
//	ExcelOperations excelopt = new ExcelOperations("Login");
//	
//	@Test(dataProvider="logindata",groups = {"functional"})
//	public void validatecart(Object obj) throws InterruptedException {
//		try {
//		HashMap<String,String>datatable=(HashMap<String,String>)obj;
//		
//		Loginpage.getinstance().loginapp(datatable);
//		ExtentFactory.getinstance().getextent().log(Status.INFO,"Logged into application");
//		AllTabsPage.getinstance().Click_tabs("Cart");
//
//		ExtentFactory.getinstance().getextent().log(Status.INFO,"Cart page is displayed");
//		assertEqualsString_custom("Automation Exercise - Checkout",shopcart.gettitle("cartpage"),"cartpage_title");
//		assertEqualsString_custom("Cart is empty!",shopcart.getcartmsg(),"Empty cart message");
//		//click here to buy products
//		shopcart.Clickhere();
//		pdt.gettitle("Products title");
//		ExtentFactory.getinstance().getextent().log(Status.INFO,"Navigated to products page");
//		
//		
//		ExtentFactory.getinstance().getextent().log(Status.PASS,"Empty cart message is displayed when there is no product added");
//	}catch(Exception e) {
//		ExtentFactory.getinstance().getextent().log(Status.FAIL,"Empty cart message not displayed when there is no product added");
//	}
//	}
//	
//	
//	@DataProvider(name="logindata",indices= {0})
//	public Object[][] datasupplier() {
//		int rowcnt = excelopt.getrow();
//		Object obj[][]=new Object[rowcnt][1];
//		
//		for(int i=1;i<=rowcnt-1;i++) {
//			HashMap<String,String>hm=excelopt.gethashvalue(i);
//			obj[i-1][0]=hm;
//		}
//		return obj;
//		
//	}
//
//}
