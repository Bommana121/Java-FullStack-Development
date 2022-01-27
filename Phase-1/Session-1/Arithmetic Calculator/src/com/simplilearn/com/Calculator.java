package com.simplilearn.com;
import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
			Scanner sc= new Scanner(System.in);
			System.out.println("\nEnter two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("\nChoose one of the option below\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n");
			int n=sc.nextInt();
			System.out.println("\nA = "+a);
			System.out.println("B = "+b);
			if(n==1)
				System.out.println("\nThe addition of A and B is : "+ (a+b));
			
			else if(n==2)
				System.out.println("\nThe Subtraction of A and B is : "+ (a-b));
			
			else if(n==3)
				System.out.println("\nThe Multiplication of A and B is : "+ (a*b));
			
			else if(n==4)
				System.out.println("\nThe Division of A and B is : "+(a/b));
	
			else
				System.out.println("\nInvalid Option\n");
			
	}
}
