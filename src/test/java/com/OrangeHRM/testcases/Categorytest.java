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
import com.OrangeHRM.pageobjects.ViewCartpage;
import com.OrangeHRM.pageobjects.Productpage;
import com.OrangeHRM.pageobjects.Shoppingcartpage;
import com.aventstack.extentreports.Status;
import com.testBase.testBase_old;

public class Categorytest extends testBase_old {
	//working on category

//	1. Launch browser
//	2. Navigate to url 'http://automationexercise.com'
//	3. Verify that categories are visible on left side bar
//	4. Click on 'Women' category
//	5. Click on any category link under 'Women' category, for example: Dress
//	6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
//	7. On left side bar, click on any sub-category link of 'Men' category
//	8. Verify that user is navigated to that category page

	Loginpage lp= new Loginpage();
	AllTabsPage tabs= new AllTabsPage();
	Productpage pdt= new Productpage();
	AddProductpage addpdt= new AddProductpage();
	Shoppingcartpage shopcart= new Shoppingcartpage();
	ViewCartpage pdtcheckout= new ViewCartpage();
	
	ExcelOperations excelopt = new ExcelOperations("Category");

	@Test(dataProvider="CategoryProd")
	public void TC06_ViewCategoryPdts (Object obj) throws IOException, InterruptedException {
		
		HashMap<String,String> datatable= (HashMap<String, String>) obj;
		try {
			//login
			lp.loginapp(datatable);
			Assert.assertEquals(gettitle("Homepage"),datatable.get("Hometitle"),"Title mismatched");
			
			//pdt search
			tabs.Click_Pdt();
			Assert.assertTrue(pdt.verifytitle(),"Product Title mismatched");
			
			//Click category and select women category
			
			pdt.viewcategory(datatable.get("Category"));
			pdt.selectSubCategory(datatable.get("Category"),datatable.get("SubCategory"));
			assertEqualsString_custom("Automation Exercise - "+datatable.get("SubCategory")+" Products",gettitle(datatable.get("SubCategory")),"Product heading");
			
			
			
			ExtentFactory.getinstance().getextent().log(Status.PASS, "Category selection is successful");
		}catch(Exception e) {
			ExtentFactory.getinstance().getextent().log(Status.FAIL, "Category selection  is NOT successful due to following error"+ e.getMessage());	
		}
	}

	@DataProvider(name="CategoryProd")
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
