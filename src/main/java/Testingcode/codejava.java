package Testingcode;

import java.util.Date;
import java.util.Scanner;

public class codejava {
	public String test;
	public codejava(String data) {
		this.test=data;
		System.out.println(test);
	}

	public static void main(String[] args) {
		codejava c= new codejava("this is automation testing");
//		swapnum();
		
//		palindromeOrReverseString();
//		fibonnaci();
//		numofdigits();
		sumofdigits();
	}
	
	
	
	public static void swapnum() {
		int a=5;
		int b=10;
		
		a=a+b;
		
		b=a-b;
		a=a-b;
		System.out.println("b value: "+b);
		System.out.println("a value: "+a);
	}
	
	
	public static void palindromeOrReverseString() {
//		String str = null;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your string");
		String input=sc.next();
		String revword="";
		int sizeofstring= input.length();//4
		
		for(int i=sizeofstring-1;i>=0;i--) {
		
			 revword=revword+input.charAt(i);
				 
		}
		 System.out.println(revword);
		 if(revword.equalsIgnoreCase(input)) {
			 System.out.println(input+" is a palindrome");
		 }
		 else
			 System.out.println(input+" is NOT a palindrome");
		
	
	}
	
	
	public static void fibonnaci() {
		String series= "0,1,2,3,5,8,13";
		String a[]=series.split(",");
		int i=0;
		int j=1;
		int limit= 13;
		for(i=0;i<=limit;i=i+1) {
			j=i+j;
			System.out.println(j);
		}
		
	}
	
	public static void randomstring() {
		Date dt= new Date();
//		dt.toString().format(null, null)
	}
	
	
	public static void sumofdigits() {
		int a= 123;
		int sum=0;
		
		
		while(a>0) {
			sum=sum+a%10;
			a=a/10;
			System.out.println(sum);
		}
			
	}
	
	public static void numofdigits() {
		int a=898666;
		int counter=0;
		while(a>0) {
			a=a/10;
			System.out.println(a);
			counter++;
		}
		
		System.out.println(counter);
	}
	
}
