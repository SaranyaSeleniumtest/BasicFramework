package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class Testing16 {
	
	public static void main(String[] args) {
//		duplicatearray();
		duplicateString();
	}
//	Duplicate in array {2,5,6,3,2,2,5,7}
	public static void duplicatearray() {
		int[]num={2,5,5,3,2,2,7,7};
		Map<Integer,Integer> datamap= new HashMap<Integer,Integer>();
		int count=1;
		for(int i=0;i<num.length;i++) {
			if(!datamap.containsKey(num[i])) {
				datamap.put(num[i],count);
			}
			else {
				datamap.put(num[i],count+1);
			}
		}
		
		for(Integer key:datamap.keySet()) {
			System.out.println(key + "repeated: "+ datamap.get(key)+"times");
		}
		
	}
//	Occurrence of string
//	extract last four character
//largest and smallest in array
	
	
	
//	Duplicate in String 
	public static void duplicateString() {
		String input= "India is my my country is";
		Map<String,Integer> datamap= new HashMap<String,Integer>();
		String[] str = input.split(" ");
		int count=1;
		for(int i=0;i<str.length;i++) {
			if(!datamap.containsKey(str[i])) {
				datamap.put(str[i],count);
			}
			else {
				datamap.put(str[i],count+1);
			}
						
		}
		for(String key: datamap.keySet()) {
			System.out.println(key + " is repeated "+ datamap.get(key) +" times");
			if(datamap.get(key)>1) {
				key.replace(key,"");
			}
//			System.out.println(key + " is repeated "+ datamap.get(key) +" times");
		}
		
	}
	
	

}
