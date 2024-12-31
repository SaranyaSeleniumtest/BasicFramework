package Testingcode;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OrangeHRM.Utilities.ExcelOperations;
import com.OrangeHRM.pageobjects.AllTabsPage;
import com.OrangeHRM.pageobjects.Loginpage;
import com.testBase.testBase;

public class ValidateLinks extends testBase {
	//new test
	
	Loginpage lp= new Loginpage();
	AllTabsPage tabs= new AllTabsPage();
	ExcelOperations excelopt= new ExcelOperations("Login");
	
	
	@Test(dataProvider="lgdata")
	public void TC06_Validatealltabs(Object obj1) throws InterruptedException {
		HashMap<String,String> hm= (HashMap<String,String>)obj1;
		lp.loginapp(hm);
		tabs.Click_tabs(hm.get("Tabnames"));
//		String tabname="Cart/Products/Home";
//		String[] obj=tabname.split("/");
//		for(int i=0;i<=obj.length;i++) {
//			System.out.println(obj[i]);
//			tabs.Click_tabs(obj[i]);
//		}
		assertEqualsString_custom(hm.get("Tabtitle"),tabs.validatetabs_landingpage(hm.get("Tabnames")),hm.get("Tabnames"));
//	
		
		
	}
	
	@DataProvider(name="lgdata")
	public Object[][] logindata() {
		
		Object[][] obj= new Object[excelopt.getrow()][1];
		int rowcnt = excelopt.getrow();
		for(int j=1;j<=rowcnt;j++) {
			HashMap<String, String> testdata = ExcelOperations.gethashvalue(j);
			obj[j-1][0]=testdata;
		}
		
		return obj;
		
		
		
	}

}
