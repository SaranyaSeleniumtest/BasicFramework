package Testingcode;

public class stringtestcases {
	
	
	
	public static void main(String[] args) {
	
		String day="08-04-2022";
		String[] arrday = day.split("-");
	
			String replace = arrday[1].replace("04","Apr");
		
		System.out.println(arrday[0]+"-"+replace+"-"+arrday[2]);
		
		int a=5;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a );
		System.out.println(b);
		
	}

}
