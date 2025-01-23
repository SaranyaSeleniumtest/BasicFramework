package InterviewQuestions;

import java.util.Scanner;

public class Testing18 {
	
	
		public static void main(String[] args){
		int c=0,a,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		temp = num;
		while(num>0){//1
		a=num%10;//1
		num=num/10;//0
		c=c+(a*a*a);//27+125+1
		}
		if(temp==c) {
		System.out.println(temp + " is an Armstrong number");
		} else
		System.out.println(temp + " is not an armstrong number");
		}

}
