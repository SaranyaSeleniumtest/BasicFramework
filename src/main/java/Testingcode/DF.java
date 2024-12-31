package Testingcode;

import org.openqa.selenium.WebDriver;

public class DF {
	
	private DF(){
		
	}
	
	public static DF obj= new DF();
	public static DF getinstance() {
		return obj;
	}
	
	ThreadLocal<WebDriver> driver= new ThreadLocal<WebDriver>();
	public  void setdriver(WebDriver driverparam) {
		driver.set(driverparam);
	}
	
	public  WebDriver getdriver() {
		return driver.get();
	}
	

}
