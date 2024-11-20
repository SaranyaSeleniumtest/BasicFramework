package com.OrangeHRM.pageobjects;

import java.util.HashMap;

import org.openqa.selenium.By;

import com.OrangeHRM.Utilities.DriverFactory;
import com.OrangeHRM.Utilities.ExtentFactory;
import com.aventstack.extentreports.Status;
import com.testBase.testBase_old;

public class Productpage extends testBase_old {
	
	By title_pdt=By.xpath("//h2[text()='All Products']");
	
	//locators
	
	
	By lnk_firstpdt=By.xpath("a[href='/product_details/1']");
	By lnk_viewpdt=By.linkText("View Product");
	
	By txt_pdtname=By.xpath("//div[@class='product-information']//h2");
	By txt_category=By.xpath("//div[@class='product-information']//p");
	By txt_search=By.id("search_product");
	By btn_search=By.id("submit_search");
	By ele_pdtname=By.xpath("//div[@class='productinfo text-center']//p");
	
	
	public boolean verifytitle() {
		
		return isdisplayed(DriverFactory.getinstance().getdriver().findElement(title_pdt),"Productpage");
	}
	
	public void Clickviewpdt() {
		try {
		//scrolldown(DriverFactory.getinstance().getdriver().findElement(lnk_firstpdt),"Firstproduct");
		click(DriverFactory.getinstance().getdriver().findElement(lnk_viewpdt),"viewpdt");
		}catch(Exception e) {
			ExtentFactory.getinstance().getextent().log(Status.FAIL,"View pdt is not successful due to exception "+e.getMessage());
		}
	}
	
	public void verifyAllpdtdetails() {
		isdisplayed(DriverFactory.getinstance().getdriver().findElement(txt_pdtname),"Productname");
		isdisplayed(DriverFactory.getinstance().getdriver().findElement(txt_category),"category");
		
	}
	
	
	public void searchpdt(HashMap<String,String>hm) {
		sendKeys(DriverFactory.getinstance().getdriver().findElement(txt_search),hm.get("Productname"), "Searchtxt");
		click(DriverFactory.getinstance().getdriver().findElement(btn_search), "Searchbtn");
	}
	
	public String validatepdt() {
		return gettext(DriverFactory.getinstance().getdriver().findElement(ele_pdtname), "Productname");
	}
	
	public void selectproduct(int productnumber) {
		String xpath="//div[@class='productinfo text-center']//a[text()='Add to cart'  and  @data-product-id='"+productnumber+"']";
		click(DriverFactory.getinstance().getdriver().findElement(By.xpath(xpath)),"Product"+productnumber);
	
	}
	
}
