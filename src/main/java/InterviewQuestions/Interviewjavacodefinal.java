package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interviewjavacodefinal {

	public static void main(String[] args) {
		//		largestnum();
		//		revstring_palindrome();
		//		fibonacci();
		//		swapstrings();
		//		countofdigits();
		occurenceofstring();
//		last4extractchar();

		//		sumofdigits();
//		repeatedword();
//		duplicateinArray();
	}
	//largest of nums
	public static void largestnum() {
		int[]num= {100,555,999,1001,200};

		int larnum=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>larnum) {
				larnum=num[i];
			}
		}
		System.out.println("largestnum: "+larnum);
	}

	//revstring
	public static void revstring_palindrome() {
		String input="Testing";
		String output="";
		int len = input.length();
		for(int i=len-1;i>=0;i--) {
			char charAt = input.charAt(i);
			output=output+charAt;
		}
		System.out.println(output);
		if(output.equalsIgnoreCase(input)) {
			System.out.println(input + " is a palindrome");
		}
		else System.out.println(input + " is NOT a palindrome");
	}

	//fibo
	public static void fibonacci() {
		//0 1 1 2 3 5 8 12....

		int n1=0;
		int n2=1;
		int n3;
		int count=10;
		for(int i=0;i<count;i++) {
			System.out.print(n1+ " ");//0
			n3=n1+n2; //1 2 3 5
			n1=n2;//1 1 2 3
			n2=n3;//1 2 3 5
		}

	}


	public static void swapstrings() {
		String st1="testing";
		String st2="Automation";

		st1=st1.concat(st2);
		System.out.println(st1);
		st2=st1.substring(0,st1.length()-st2.length());
		System.out.println("String 2: "+st2);

		st1=st1.substring(st2.length());
		System.out.println("String 1:" +st1);

	}

	public static void countofdigits() {
		int input=563789;
		int count=0;
		while(input>0) {
			input=input/10;
			count++;
			//			System.out.println(input);
		}
		System.out.println("count of digit is: "+count);


	}

	public static void sumofdigits() {
		int input = 555;
		int output=0;
		while(input>0) {

			output=output+input%10;
			input=input/10;

		}
		System.out.println(output);

	}

	public static void repeatedword() {
		String str="India is my is my country";
		String[] str2 = str.split(" ");
		int len = str2.length;
		int count=1;
		Map<String,Integer> map= new HashMap<String,Integer>();
		for(int i=0;i<len-1;i++) {
			if(!map.containsKey(str2[i])) {
				map.put(str2[i],count);
			}
			else {
				map.put(str2[i],map.get(str2[i])+1);
			}
		}
		
		for(String obj:map.keySet()) {
			System.out.println("count of word: "+ obj+"--"+ map.get(obj));
			

		}

	}
	
	
	public static void duplicateinArray() {
		int []num= {6,8,3,6,2,8,8,8,2,6,6,6,6,6};
		int count=1;
		 Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
		 
		 for(int i=0;i<num.length;i++) {
			 if(!hm.containsKey(num[i])) {
				 hm.put(num[i],count);
				 
			 }
			 else {
				 hm.put(num[i],hm.get(num[i])+1);
			 }
		 }
		 
		 for(Integer val:hm.keySet()) {
			 if(hm.get(val)>1) {
				 System.out.println("duplicate arrary found: "+val+"--repeated: "+hm.get(val)+" times");
			 }
		 }
		 
		
	}
	
	public static void occurenceofstring() {
		String str="India is my country";
		int len = str.length();
		System.out.println(len);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string to validate");
		String remstring=str.replace(sc.next(),"");
		System.out.println(remstring);
		int occofstring=len-remstring.length();
		System.out.println("Occurence of string  "+occofstring);
		
		
	}
	
	public static void last4extractchar() {
		String str="Automation";
		
		String substring = str.substring(str.length()-4);
		System.out.println(substring);
	}


}
