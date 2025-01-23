package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Testing17 {
//	. Open Google, Search for "Ban" and from the search list click on 'Bangalore weather' 12. In a webpage, I have a country
//	dropdown. After selecting the country 'India', the 2nd dropdown City got enabled. Select the city 'Bangalore' and after the city got selected,Location dropdown got enabled. Now find all locations whose name start with letter 'a'

  public static void main(String[] args) {
	  
//	  fibo();
//	  largestnum();
//	  sumofdigits();
//	  greatestnuminArray();
//	  revstring();
//	  removespace();
	  reversestringkeepspace();
//	  occurenceofstring();
//	  occurenceofword();
//	  evennum();
//	  oddnum();
//	  extractnum();
//	  anagram();
//	  duplicateelementsArr();
//	WebDriver driver= new ChromeDriver();
//	driver.get("https://www.google.co.in/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	
//	driver.findElement(By.name("q")).sendKeys("Ban");
//	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
////	wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul[@role='listbox']/li"))));
//	List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
//	System.out.println(ele.size());
////	ele.get(0).click();
//	List<String> lst= new ArrayList<String>();
//	lst.add("Bangalore");
//	lst.add("bangalore airport");
//	
//
////	for (WebElement webElement : ele) {
////		
////		if(webElement.getText().equalsIgnoreCase("Bangalore weather")) {
////			webElement.click();
////			break;
////		}
//		
//		
////	}
}
	
  
  public static void fibo() {
	  //0 1 1 2 3 5 8 13...
	  int n1=0;
	  int n2=1;
	  int n3;
	  for(int i=0;i<=10;i++) {
		  System.out.print(n1+ " ");
		  n3=n1+n2;
		  n1=n2;
		  n2=n3;
	  }
	
}
  
  public static void largestnum() {
	  int[]num= {2000,999,555,3000};
	  int largestnum=num[0];
	  for(int i=0;i<num.length;i++) {
		  if(num[i]>largestnum) {
			  largestnum=num[i];
		  }
		  
	  }
	  System.out.println("largestnum "+largestnum);
	
}
  
  
  public static void revstring() {
	  String input= "madam";
	  String output="";
	  for(int i=input.length()-1;i>=0;i--) {
		  output=output+ input.charAt(i);
		   }
	  if(output==input) {
	  System.out.println(input + " is a palindrome");
	  }
	  else  System.out.println(input + " is NOT a palindrome");
}
  
  public static void removespace() {
	String input="hello java learning";
	String[] str=input.split(" ");
	String output="";
	for(int i=0;i<str.length;i++) {
		output= output+str[i];
	}
	System.out.println(output);
}
  
  
  public static void reversestringkeepspace() {
	  String input="iam lost";
	  String output="";
	  for(int i=input.length()-1;i>=0;i--) {
		  output= output+input.charAt(i);
	  }
	  System.out.println(output);
  }
  public static void sumofdigits() {
	  int num=404;
	  int output=0;
//	  System.out.println(num%10);
	  while(num>0) {
		output= output+num%10;//2+7+2+6
		num=num/10;//0
	  }
	  System.out.println(output);
	
}
  public static void greatestnuminArray() {
	  Integer[] a = {1,2,3,4,5,65,76,5,4,33,4,34,232,3,2323};
	  int max = Collections.max(Arrays.asList(a));
	  System.out.println(max);
  }
  public static void occurenceofstring() {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter string to validate occurence");
	String str=sc.next();
	String input="automation";
	int orgstrlen=input.length();
	String replace = input.replace(str,"");
	int remstr=replace.length();
	System.out.println(orgstrlen-remstr);
}
  public static void duplicatearray() {
	
}
  
  public static void anagram() {
	  // 153 
	  
	  int num=370;
	  int output=0;
	  int temp,a;
	  temp=num;
	  while(num>0) {
		  a=num%10;//351
		  num=num/10;//15 1
		  output= output+(a*a*a);
	  }
	  if(temp==output) {
		  System.out.println(temp + " is a anagram");
	  }
	  else System.out.println(temp + " is NOT a anagram");
  }
  
  public static void extractnum() {
	String input="T1e4stin5g";
	for(int i=0;i<=input.length()-1;i++) {
	char charAt = input.charAt(i);
	boolean digit = Character.isDigit(charAt);
		if(!digit==true) {
//			System.out.print(charAt);
		
		
			System.out.print(charAt);
	
}
	}
  }
  
  public static void evennum() {
	  int num=346;
	  if(num%2==0) {
		  System.out.println(num+" is a even number");
	  }
	  else
	  System.out.println(num+" is NOT a even number");
  }
  
  
  public static void oddnum() {
	  int num=343;
	  if(!(num%2==0)) {
		  System.out.println(num+" is a odd number");
	  }
	  else
	  System.out.println(num+" is NOT a odd number");
  }
  public static void duplicateelementsArr() {
	  int [] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
	  Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
	  int count=1;
	  for(int i=0;i<=arr.length-1;i++) {
		  if(!hm.containsKey(hm.get(arr[i]))){
			  hm.put(arr[i],count);
		  }
		  else {
			  hm.put(arr[i],hm.get(arr[i])+1);
		  }
					  
		  }
	  for(Integer key: hm.keySet()) {
		  System.out.println(key +" is repeated "+ hm.get(key)+" times");
	  
	  }
	
}
  public static void occurenceofword() {
	String input="java is real is java coding language";
	
	String[] str=input.split(" ");
	int count=1;
	HashMap<String,Integer> hm= new HashMap<String,Integer>();
	for(int i=0;i<str.length;i++) {
		if(!hm.containsKey(str[i])) {
			hm.put(str[i],count);
		}
		else {
			hm.put(str[i],hm.get(str[i])+1);
		}
	}
	
	for(String key: hm.keySet()) {
		System.out.println(key+ " is repeated "+hm.get(key)+ " times");
		if(hm.get(key)>1) {
			key.replace(key," ");
		}
		System.out.println(key+ " is repeated "+hm.get(key)+ " times");
	}
}
}
