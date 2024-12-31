package Testingcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		//		swapnum();
		//		revstring_palindrome();
		
	}
	public static void datepicker() {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.id("datepicker")).click();
		
	}
	public static void swapnum() {
		int x=5;
		int y=10;

		x=x+y;//15
		y=x-y;//5
		x=x-y;//10
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
	}

	public static void revstring_palindrome() {
		String input="MALAYALAM";
		String output="";
		int len=input.length();
		for(int i=len-1;i>=0;i--) {
			output=output+input.charAt(i);
		}
		if(output.equalsIgnoreCase(input)) {
			System.out.println(input +" is a palindrome");
		}
		else {
			System.out.println(input +" is NOT a palindrome");
		}

	}

	public static void countdigitsinNUM() {
		int input=1234;
		int output = 0;
		int counter=0;
		while(output>0) {
			output=input/10;
			
			System.out.println(output);
		}

	}
	
	public static void fibonacci() {
		
	}

}
