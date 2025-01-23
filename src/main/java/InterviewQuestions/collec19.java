package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class collec19 {
	

	public static void strrev() {
		ArrayList<String> lst= new ArrayList<String>();
		lst.add("pot");
		lst.add("bat");
		lst.add("cat");
		Collections.reverse(lst);
		System.out.println("Reverse arraylst"+lst);
	}
	
	public static void intrev() {
		ArrayList<Integer> lst= new ArrayList<Integer>();
		lst.add(5);
		lst.add(8);
		lst.add(10);
		Collections.reverse(lst);
		System.out.println("Reverse arraylst"+lst);
	}
	
	public static void sortstring() {
		ArrayList<String> str= new ArrayList<String>();
		
		str.add("delhi");
		str.add("bombay");
		str.add("assam");
		str.add("bangalore");
		
		System.out.println(str);
		Collections.sort(str);
		System.out.println("After sort");
		for(String temp: str) {
			System.out.println(temp);
		}
	}
	
	public static void empmap() {
		Map<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("tom",100);
		hm.put("sam",101);
		hm.put("ram",102);
		hm.put("sun",103);
		
		for(String key:hm.keySet()) {
			System.out.println(key +" --"+ hm.get(key));
		}
			
		}
	public static void main(String[] args) {
//		strrev();
		
		sortstring();
//		empmap();
		
	}



}
