package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class codejava {
	
	public static void main(String[] args) {
//		highestarray();
//		fibonnaci();
		duplicatewordnamecount();
	}
	public static void highestarray() {
		int[]num = {200,777,12,300,500,1};
		int len=num.length;
		int max=num[0];
		for(int i=0;i<len-1;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		
		System.out.println("Highest array value : "+max);
		
	}

	
	public static void fibonnaci() {
//		0 1 1 2 3 5 8 13
		int num1=0;
		int num2=1;
		int num3;
		
		for(int i=0;i<10;i++) {
			System.out.print(num1 + " ");//0 1 1 3
			num3= num1+num2;//0+1 1 2 3
			num1=num2; //1 1 2
			num2=num3;//1 2 3
		}
		
	}
	
	
	public static void duplicatewordnamecount() {
		String input= "india is my is india country";
		String[]str=input.split(" ");
		int count=1;
		Map<String,Integer> hm= new HashMap<String,Integer>();
		for(int i=0;i<str.length;i++) {
			
			if(!hm.containsKey(str[i])) {
				hm.put(str[i],count);
			}
			else {
				hm.put(str[i],hm.get(str[i])+1);
			}
				
				
		}
		for (String key : hm.keySet()) {
			
			System.out.println(key +"--->"+hm.get(key)+" times");
			if(hm.get(key)>1) {
				key.replaceAll(key,"");
				
			}
			System.out.println(key +"--->"+hm.get(key)+" times");
	}
		
	}
}
