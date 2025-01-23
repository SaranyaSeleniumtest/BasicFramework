package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class Testjavacode {
	
//	length of the String without using length function?
	public static void len() {
		String input="Testing";
		
//		input.charAt(0)
		
	}
//find the least number in an integer array int[] a = {9,3,6,4,8,5} ?
	public static void leastnumarr() {
		Integer[] a = {9,3,6,4,8,5};
		
		Integer min = Collections.min(Arrays.asList(a));
		System.out.println(min);
	}
//	integer array int[] a = {9,3,6,8,4,7} and print the elements of the array in reverse?
	public static void revarr() {
		int[] a = {9,3,6,8,4,7};
		
		Arrays.sort(a);
		System.out.println(a.toString());
		
		
	}
	public static void pattern() {
		
		
		int c = 2;
		int num = 1;
		System.out.println("*" + " " + 1);
		for(int i=1;i<7;i++){
		int sum = (num*10) + c;
		System.out.println(" *" + " " +sum);
		num = sum;
		c++;
		}
		}
		

	public static void findFactorial(int number){
		int i,fact=1;
		for(i=1;i<=number;i++){
		fact=fact*i;
		}
		System.out.println("Factorial of " + number + "is: " + fact);
		}
	
	public static void main(String[] args) {
		pattern();
//		leastnumarr();
//		revarr();
	}
	

	}
