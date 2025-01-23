//package com.OrangeHRM.testcases;
//
//import java.io.IOException;
//import java.util.HashMap;
//
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import com.OrangeHRM.Utilities.DriverFactory;
//import com.OrangeHRM.Utilities.ExcelOperations;
//import com.OrangeHRM.Utilities.ExtentFactory;
//import com.OrangeHRM.pageobjects.AddProductpage;
//import com.OrangeHRM.pageobjects.AllTabsPage;
//import com.OrangeHRM.pageobjects.Checkoutpage;
//import com.OrangeHRM.pageobjects.Loginpage;
//import com.OrangeHRM.pageobjects.Orderconfirmationpage;
//import com.OrangeHRM.pageobjects.Paymentpage;
//import com.OrangeHRM.pageobjects.Productpage;
//import com.OrangeHRM.pageobjects.Shoppingcartpage;
//import com.OrangeHRM.pageobjects.ViewCartpage;
//import com.aventstack.extentreports.Status;
//import com.testBase.testBase;
//
//public class EndToEndScenarioTest extends testBase {
//	Loginpage lp= new Loginpage();
//	AllTabsPage tabs= new AllTabsPage();
//	Productpage pdt= new Productpage();
//	AddProductpage addpdt= new AddProductpage();
//	Shoppingcartpage shopcart= new Shoppingcartpage();
//	ViewCartpage pdtcheckout= new ViewCartpage();
//	Checkoutpage chkout= new Checkoutpage();
//	Paymentpage payment=new Paymentpage();
//	Orderconfirmationpage order= new Orderconfirmationpage();
//	
//	ExcelOperations excelopt = new ExcelOperations("EndToEnd");
//
//	@Test(dataProvider="EndToEnd",groups={"smoke"})
//	public void TC08_verifycheckout(Object obj) throws IOException, InterruptedException {
//		//End to End flow---saranya
//		HashMap<String,String> datatable= (HashMap<String, String>) obj;
//		try {
//			//login
//			DriverFactory.getinstance().getdriver().manage().deleteAllCookies();
//			lp.loginapp(datatable);
//			Assert.assertEquals(gettitle("Homepage"),datatable.get("Hometitle"),"Title mismatched");
//			
//			//pdt search
//			tabs.Click_Pdt();
//		
//
//			Assert.assertTrue(pdt.verifytitle(),"Product Title mismatched");
//			pdt.searchpdt(datatable);
//			Assert.assertEquals(pdt.validatepdt(),datatable.get("Productname1"),"Product mismatched");
//			
//			//search and add 2 pdts
//			pdt.comparepdt_addtocart(datatable.get("Productname1"));
//			
//			Assert.assertEquals(addpdt.getproductconfimation(),datatable.get("Productconfirmmsg"));
//			
//			addpdt.click_continueshop();
//			assertEqualsString_custom(datatable.get("ProductTitle"),gettitle("AllProducts"),"ProductTitle");
//			pdt.searchSecondpdt(datatable);
//			assertEqualsString_custom(datatable.get("Productname2"),pdt.validatepdt(),"Product name");
//			pdt.comparepdt_addtocart(datatable.get("Productname2"));
//			
//			Assert.assertEquals(addpdt.getproductconfimation(),datatable.get("Productconfirmmsg"));
//			
//			addpdt.click_viewcart();
//			
//			Assert.assertEquals(shopcart.shopping_gettitle(),datatable.get("Shoppingtitle"));
//			System.out.println(datatable.get("Product1price"));
//			//Verify shopping cart
//			assertEqualsString_custom(datatable.get("Product1price"),pdtcheckout.getproductdetails(datatable.get("Productname1"),datatable.get("Pricelabel")),"Price");
//			assertEqualsString_custom(datatable.get("Product2price"),pdtcheckout.getproductdetails(datatable.get("Productname2"),datatable.get("Pricelabel")),"Product2_Price");
//			pdtcheckout.Clickcheckout();
////			shopcart.Clicklogin();
////			//login
////			lp.loginapp(datatable);
////			Assert.assertEquals(gettitle("Homepage"),datatable.get("Hometitle"),"Title mismatched");
////			tabs.Click_tabs("Cart");
//			
//			
//			Assert.assertTrue(pdtcheckout.verifycheckoutpage(),"Checkout page mismatched");
//			Assert.assertTrue(pdtcheckout.verifyReviewOrder(), "Review order is not displayed");
//		
//			//Product1 verification
//			assertEqualsString_custom(datatable.get("Product1price"),chkout. getcheckoutdetails(datatable.get("Productname1"),datatable.get("Pricelabel")),"Price");
//			//assertEqualsString_custom(chkout. getcheckoutdetails(datatable.get("Productname1"),datatable.get("Quantitylabel")),datatable.get("Product1qty"),"Quantity");
//			assertEqualsString_custom(datatable.get("Product1Total"),chkout. getcheckoutdetails(datatable.get("Productname1"),datatable.get("Totallabel")),"Total");
//			
//			//Product2 verification
//			assertEqualsString_custom(datatable.get("Product2price"),chkout. getcheckoutdetails(datatable.get("Productname2"),datatable.get("Pricelabel")),"Price");
//		//	assertEqualsString_custom(chkout. getcheckoutdetails(datatable.get("Productname2"),datatable.get("Quantitylabel")),datatable.get("Product2qty"),"Quantity");
//			assertEqualsString_custom(datatable.get("Product2Total"),chkout. getcheckoutdetails(datatable.get("Productname2"),datatable.get("Totallabel")),"Total");
//			
//			//Placeorder
//			chkout.ClickPlaceOrder();
//			
//			//validate payment landing page
//			payment.validatepaymentpage();
//			//Enter payment details
//			payment.enter_paymentdetails(datatable);
//			//click pay&confirmorder
//			payment.clickconfirmorder();
//			
//			
//			//Orderconfirm
//			assertEqualsString_custom("Congratulations! Your order has been confirmed!",order.getOrderconfirmation(),"Orderconfirmation");
//			order.clickcontinue();
//			
//			//validate home landing page
//			assertEqualsString_custom(datatable.get("Hometitle"), tabs.validatetabs_landingpage("Home"), "Homepage title");
//			
//			
//			//logout
//			tabs.Click_tabs("Logout");
//			
//			ExtentFactory.getinstance().getextent().log(Status.PASS, "ProductCheckout is successful");
//		}catch(Exception e) {
//			ExtentFactory.getinstance().getextent().log(Status.FAIL, "ProductCheckout is NOT successful due to following error"+ e.getMessage());	
//		}
//	}
//
//	@DataProvider(name="EndToEnd")
//	public Object[][] searchdata() {
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
//
//}
