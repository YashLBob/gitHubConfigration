package git1;

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
		 
		Scanner sc = new Scanner  (System.in);
		
		System.out.println("enter your name");
		String yourName = sc.nextLine();
		System.out.println("Your Name is :" + yourName);
		
	}

}
