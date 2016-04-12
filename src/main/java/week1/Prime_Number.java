package week1;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		int i,verify=0;
		int n = Integer.parseInt(args[15]);//30 - 45;
		//int n;
		//Scanner in = new Scanner(System.in);
		//System.out.println("Please enter the number to find prime or not");
		//n=in.nextInt();
		for(i=2;i<n;i++)
		{
			if((n % i)==0)
				verify = 1;
			break;
		}
		if(verify==1)
			System.out.println("The number" +n+ "is not a prime number");
		else
			System.out.println("The number" +n+ " is a prime number" );
		}
		
		
}
