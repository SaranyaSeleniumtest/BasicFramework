package com.testBase;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Animal {
	
	public Animal() {
		System.out.println("this is default constructor");
	}
	
	public Animal(String domestic) {
		System.out.println(domestic + " is domestic animal");
	}
	public Animal(String domestic,int count) {
		System.out.println("There are "+ count+ domestic+ "s");
	}
	
	public static void GenerateRandomNumber() {
		
		Random rand = new Random();
		
		int r1 = rand.nextInt(1000);
		System.out.println("Random numbers: "+ r1);
		
		}
	
	public static void sortnum() {
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
		List<int[]> asList = Arrays.asList(arr);
		System.out.println(asList.size());
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
//		List<Integer> ={13, 7, 6, 45, 21, 9, 101, 102};
	}
	public static void SearchLetter() {
	
		String str = "Automation Questions";
		int index = str.indexOf('Q');
		System.out.println("Index of the letter Q :: "+index);
	}
	public static void main(String[] args) {
//		Animal obj= new Animal();
//		Animal obj1= new Animal("dog");
//		Animal obj2= new Animal("cat",8);
//		GenerateRandomNumber();
//		int num=100;
//		Integer.toString(num);
//		System.out.println(num);
//		sortnum();
//		SearchLetter();
		sortnum();
	}
	
	
	
	

}
