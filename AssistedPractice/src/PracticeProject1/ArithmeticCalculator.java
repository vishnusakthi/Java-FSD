package PracticeProject1;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[]args) {
		int num1,num2,ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		num1=sc.nextInt();
		System.out.println("Enter the second number");
		num2=sc.nextInt();
		System.out.println("Choose the operation Addition(+),Substraction(-),Multiplication(*),Division(/)");
		char op=sc.next().charAt(0);
		
		if(op == '+')
		{
			ans=num1+num2;
			System.out.println("The sum is "+ans);
		}
		else if(op == '-')
		{
			ans=num1-num2;
			System.out.println("The diference is "+ans);
		}
		else if(op == '*')
		{
			ans=num1*num2;
			System.out.println("The product is "+ans);
		}
		else if(op == '/')
		{
			ans=num1/num2;
			System.out.println("The quotient is "+ans);
		}
			
	}

}
