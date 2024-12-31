package Testingcode;

public class Testalljavacode {
	public static void main(String[] args) {
//		reversestring();
		
		swaptwostring();
	}
	public static void reversestring() {
		
		String st1="saranya";
		String st2= "";
		int len=st1.length();
	
		//System.out.println(len);
		for(int i=len-1;i>=0;i--) {
		
			st2=st2+st1.charAt(i);
			System.out.println(st2);
		}
	}
	
	public static  void swaptwostring() {
		String st1="Testing";
		String st2="Automation";
		
		String output=st1+st2;
		
		System.out.println(output);
//		"toptest"
		
		st2=output.substring(0,output.length()-st2.length());
		System.out.println("st2--"+ st2);
		
		st1=output.substring(st2.length());
		System.out.println("st1--"+st1);
		
		System.out.println(output=st1+st2);
	}

}
