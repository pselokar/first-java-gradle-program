package test;
import java.util.Scanner;

class Addition
{
	static int a,b,c;
	
	public static void main(String[] arg)
	{	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		
		c = addition(a,b);
		System.out.println("Addition of two entered numbers is : " + c);
}

	static int addition(int first,int second)
	{
		return first+second;
	}
}
