package Testingcode;

import java.io.IOException;

import org.testng.annotations.Test;

public  class test2812 {
	public int a=100;
	public static void main(String[] args) {
//		countdigits();
//		occurenceofchar();
//		vowel();
		sumofdigit();

	}
	
	public static  void testing(String param) {
		System.out.println(param +"parent method");
	}
	
	public test2812() {
		System.out.println("default");
	}

	
//	countdigitsinNum();
	public static void countdigits() {
		int input=12345;
		int counter=0;
		while(input>0) {
			input=input/10;
			counter=counter+1;
		}
		System.out.println(counter);
	}
//	occurenceofcharac();
	public static void occurenceofchar() {
		String input="automation";
		char findby='a';
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==findby) {
				count++;
			}
		}
		System.out.println("occurence of chara "+count);
		
	}
//	vowelcount();
	public static void vowel() {
		String input="India is my country";
		input=input.toLowerCase();
		int vowelcnt=0;
		for(int i=0;i<input.length();i++) {
			char eachchar = input.charAt(i);
			if(eachchar=='a'||eachchar=='e'||eachchar=='i'||eachchar=='o'||eachchar=='u') {
				vowelcnt++;
			}
		}
		System.out.println("Vowel count in given input"+vowelcnt);
	}
//	alphabet();
//	
//	sumofdigit();
	
	public static void sumofdigit() {
		int input=12345;
		while(input>0) {
			input=input%10;
			System.out.println(input);
		}
	}
}
