package emailValidation;

import java.util.Scanner;

public class EmailValidation 
{
	public static void main(String[] args) 
	{
		
		int i,a=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of email-id's  ");
		n=sc.nextInt();
		String[] str=new String[n];
		System.out.println("Enter the employees email-id : ");
		//sc.nextLine();
		for(i=0;i<n;i++)
		{
			str[i]=sc.next();
			
		}
		System.out.println();
		System.out.println("Enter the email-id which you want to search : ");
		String id =sc.nextLine();
		for(i=0;i<n;i++)
		{
			if(str[i].equals(id))
				a=1;
		}	
		System.out.println();
		if(a==1)
			System.out.println("Email-id found");
		else
			System.out.println("Email-id Not found");
	}
}
