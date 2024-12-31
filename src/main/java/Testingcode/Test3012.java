package Testingcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test3012 {
	public static void main(String[] args) {
//		Map<Integer, String> hm= new HashMap<>();
//		hm.put(148170,"saran");
//		hm.put(148171,"sham");
//		hm.put(148172,"tom");
//		
//		hm.forEach(148170);
		
//		//hashset--output is not predictable
//		//linked hashset- order is preserved
//		//treeset - order vl be in ascending 
//		
////		
////		Set<String> data= new HashSet<String>();
////		data.add("cat");
////		data.add("dog");
////		data.add("apple");
////		data.add("cat");
////		data.add("Elephant");
////		data.add("bat");
////		Iterator<String> iter = data.iterator();
////		while(iter.hasNext()) {
////			System.out.println(iter.next());
////		}
//		
//		
//		Set<String> data1= new LinkedHashSet<String>();
//		data1.add("chennai");
////		data1.add("trichy");
////		data1.add("USA");
////		data1.add("Bangalore");
////		Iterator<String> iter1 = data1.iterator();
////		while(iter1.hasNext()) {
////			System.out.println(iter1.next());
////		}
////	
//
//	Set<String> data2=new TreeSet<String>();
//	data2.add("chennai");
//	data2.add("Bangalore");
//	data2.add("usa");
////	for(String obj: data2) {
////		System.out.println(obj);
////	}
////	Iterator<String> iter3 = data2.iterator();
////	while(iter3.hasNext()) {
////		System.out.println(iter3.next());
////	}
//	
//	data2.forEach(System.out::println);
		
//		
//		List<String> data= new ArrayList<String>();
//		data.add("chennai");
		
//		int counter=0;
//		Iterator<String> iter = data.iterator();
//		for(int i=0;i<data.size();i++) {
//			if(data.get(i).contains("chennai")) {
//				counter++;
//			}
//		
//		}
//		System.out.println(counter);
////		while(iter.hasNext()) {
////			iter.next().get
//////			String next = iter.next();
//////			System.out.println(next);
////		}
//		
////		for (String string : data) {
////			System.out.println(string);
////			
////		}
		
//		Drivinglicence();
		String input="Automation";
//		String concat = input.concat("testing");
		StringBuffer obj= new StringBuffer();
		
		System.out.println(obj.append(input).append("testing"););
		
	}
	
	public static void Drivinglicence() {
		int age=17;
		
		try {
			if(age>18) {
				System.out.println("approved");
			}
			else {
				throw new Exception("belowLicenceAge");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("test");
			
		}
		
	}
}
