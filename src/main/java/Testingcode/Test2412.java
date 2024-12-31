package Testingcode;

import java.util.Scanner;

public class Test2412 {
	
	public static void main(String[] args) {
////		Scanner sc= new Scanner(System.in);
////		String output =sc.nextLine();
//		String input="inDia iS mY coUntry";
//		System.out.println(input.toLowerCase());
//		
//		String[] split = input.split("\\s");
//		
//		revstring();
		swap();
	}
	
	public static void revstring() {
		String a="madam";
		int len =a.length();
		String output="";
		for(int i=len-1;i>=0;i--) {
			output= output+a.charAt(i);
			
		}
		if(output.equalsIgnoreCase(a)) {
			System.out.println(output+" is a palindrome");
		}
		else
			System.out.println(output+" not a palindrome");
//		System.out.println(output);
		
	}
	
	
	private static void swap() {
		String word1="Test";
		String word2="pot";
		
		 word1 =word1+word2;//testpot
		 int len= word1.length();
		System.out.println(word1);
		for(int i=len-1;i>=0;i--) {
			word2= word1.substring(word2.length());
			
		}
		System.out.println(word2);
		
	}

}
