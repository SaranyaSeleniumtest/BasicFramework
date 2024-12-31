package Testingcode;

public class fibonacci extends test2812 {
	public int a=10;
	public fibonacci() {
		super();
		
	}
	public static void main(String[] args) {
		fibonacci fb=new fibonacci();
		fb.test();
//		countdigitsinNum();
//		occurenceofcharac();
//		vowelcount();
//		alphabet();
//		
//		sumofdigit();
		testing("test");
		
		
	}
	
//	public static void testing(String param) {
//		System.out.println(param +"child method");
//	}
	public void test() {
		int i = super.a;
		
		System.out.println(a);
		System.out.println(i);
	}
	
	public static void fibo() {
		int first=0;//0 1 2 3 5
		int second=1;
		int endcount=6;
		int third;
		
		for(int i=1;i<=endcount;i++) {
			System.out.print(first + ", ");//0 1 1 2
			third= first+second; //0+1=1  //1+1=2 //1+2=3 
			first=second;//1 1 2
			second=third;//1 2 3
		
			
		}
	}
	
	public static void countdigitsinNum() {
		int input=233;
		
		int counter=0;
		while(input>0) {
			input=input/10;
			counter=counter+1;
		}
		System.out.println("count of digits: "+counter);
	}
	
	
	public static void occurenceofcharac() {
		String input="testing";
		char tofind='t';
		int counter=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==tofind) {
				counter++;
			}
	}
		System.out.println("occurence of char" +tofind+" in string "+ counter);
	}

	public static void vowelcount() {
		String input="Automation";
		int counter=0;
		input=input.toLowerCase();
		for(int i=0;i<input.length();i++) {
			char charAt = input.charAt(i);
			if(charAt=='a'||charAt=='e'||charAt=='i'||charAt=='o'||charAt=='u'){
				counter++;
				
			}
			
		}
		System.out.println("vowel count in given string "+ counter);
	}
	
	public static void sumofdigit() {
		int input=444;
		int sum=0;
		while(input>0) {
			input=input%10;
			sum=sum+input;
		}
		System.out.println("sum of digits in num "+sum);
	}
	
	public static void alphabet() {
		
		char i;
		System.out.printf("The Alphabets from A to Z are: \n");
		for (i = 'A'; i <= 'Z'; i++)
		{
		System.out.printf("%c ", i);
	}
}
}