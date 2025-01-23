package InterviewQuestions;

public class Testknowledge {
	
	public static void main(String[] args) {
		revstring_palindrome();
	}
	
	public static void pyramid() {
		
	}
	
	public static void revstring_palindrome() {
		String input="test";
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			output=output+input.charAt(i);
		}
		if(input==output) {
			System.out.println(output +" is a palindrome");
		}
		else
			System.out.println(output +" is NOT a palindrome");
	
	}
	
	
	public static void fibo() {
		// 0 1 1 2 3 5 8 13...
		int  n1=0;
		int n2=1;
		int n3;
		int count=10;
		for(int i=0;i<count;i++) {
			System.out.print(n1+ " ");
		}
	}
	
	

}
