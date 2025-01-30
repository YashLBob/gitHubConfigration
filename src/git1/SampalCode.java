package git1;

import java.util.Date;
import java.util.Scanner;

public class SampalCode {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		
		a= 100;
		b= 200;
		
		c= a+b;
		System.out.println(c);
		 d = a*b;
		 System.out.println(d);
		 
		Scanner scm = new Scanner  (System.in);
	
		System.out.println("enter your name");
		String yourName = scm.nextLine();
		System.out.println("Your Name is :" + yourName);
		
		System.out.println("enter your name");
		String yourPAssword = scm.nextLine();
		System.out.println("Your Name is :" + yourPAssword);
		
		System.out.println("enter your name");
		int yourAge = scm.nextInt();
		System.out.println("Your Name is :" + yourAge);
		
		System.out.println("enter your Admition Date");
		String admitionDate = scm.nextLine();
		System.out.println("Your Name is :" + admitionDate);
		
	}

}
