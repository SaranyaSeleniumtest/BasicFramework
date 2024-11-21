package com.OrangeHRM.testcases;

import java.io.IOException;
import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OrangeHRM.Utilities.ExcelOperations;
import com.OrangeHRM.Utilities.ExtentFactory;
import com.OrangeHRM.pageobjects.AddProductpage;
import com.OrangeHRM.pageobjects.AllTabsPage;
import com.OrangeHRM.pageobjects.Loginpage;
import com.OrangeHRM.pageobjects.ProductCheckoutpage;
import com.OrangeHRM.pageobjects.Productpage;
import com.OrangeHRM.pageobjects.Shoppingcartpage;
import com.aventstack.extentreports.Status;
import com.testBase.testBase_old;

public class SearchProductAndAddProduct extends testBase_old {

	//	1. Launch browser
	//	2. Navigate to url 'http://automationexercise.com'
	//	3. Verify that home page is visible successfully
	//	4. Click on 'Products' button
	//	5. Verify user is navigated to ALL PRODUCTS page successfully
	//	6. Enter product name in search input and click search button
	//	7. Verify 'SEARCHED PRODUCTS' is visible
	//	8. Verify all the products related to search are visible

	Loginpage lp= new Loginpage();
	AllTabsPage tabs= new AllTabsPage();
	Productpage pdt= new Productpage();
	AddProductpage addpdt= new AddProductpage();
	Shoppingcartpage shopcart= new Shoppingcartpage();
	ProductCheckoutpage pdtcheckout= new ProductCheckoutpage();
	
	ExcelOperations excelopt = new ExcelOperations("SearchProduct");

	@Test(dataProvider="search")
	public void TC03_searchpdt(Object obj) throws IOException, InterruptedException {
		HashMap<String,String> datatable= (HashMap<String, String>) obj;
		try {
			lp.loginapp(datatable);
			Assert.assertEquals(gettitle("Homepage"),datatable.get("Hometitle"),"Title mismatched");

			tabs.Click_Pdt();
			Assert.assertTrue(pdt.verifytitle(),"Product Title mismatched");
			pdt.searchpdt(datatable);
			Assert.assertEquals(pdt.validatepdt(),datatable.get("Productname"),"Product mismatched");
//
			pdt.selectproduct(1);
			
			Assert.assertEquals(addpdt.getproductconfimation(),datatable.get("Productconfirmmsg"));
			
			addpdt.click_continueshop();
			Assert.assertTrue(pdt.verifytitle(),"Product Title mismatched");
			
			pdt.selectproduct(2);
			Assert.assertEquals(addpdt.getproductconfimation(),datatable.get("Productconfirmmsg"));
			addpdt.click_viewcart();
			Assert.assertEquals(shopcart.shopping_gettitle(),datatable.get("Shoppingtitle"));
			
//			Assert.assertEquals(pdtcheckout.getproductdetails(datatable.get("Productname1"),datatable.get("Pricelabel")),datatable.get("Price"));
			//Assert.assertEquals(pdtcheckout.getproductdetails(datatable.get("Productname1"),"cart_total"),"2000");
			assertEqualsString_custom(pdtcheckout.getproductdetails(datatable.get("Productname1"),datatable.get("Pricelabel")),datatable.get("Price"),"Price");
			assertEqualsString_custom(pdtcheckout.getproductdetails(datatable.get("Productname2"),datatable.get("Pricelabel")),datatable.get("Product2price"),"Product2_Price");

			ExtentFactory.getinstance().getextent().log(Status.PASS, "Addproduct is successful");
		}catch(Exception e) {
			ExtentFactory.getinstance().getextent().log(Status.FAIL, "Addproduct is NOT successful due to following error"+ e.getMessage());	
		}
	}

	@DataProvider(name="search")
	public Object[][] searchdata() {
		Object[][] obj= new Object[excelopt.getrow()][1];
		int rowcnt = excelopt.getrow();

		for(int j=1;j<=rowcnt;j++) {
			HashMap<String, String> testdata = ExcelOperations.gethashvalue(j);
			obj[j-1][0]=testdata;
		}

		return obj;


	}
}
