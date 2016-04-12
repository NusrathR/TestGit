package week1;

import java.util.Scanner;

public class PrimeNumber {

		//private static Scanner in;

		public static void main(String[] args) {
			//declaring variables
			int n; //the input to check prime or not
			double a,b,c;
			//Getting n during run time
			Scanner in = new Scanner(System.in);
			System.out.print("Please enter the number");
			n = in.nextInt();
			System.out.println("You entered " +n);
			//Performing check for prime number
			a = Math.pow(2, n);
			b = a % n;
			c = 2 % n;
			if (b==c)
			System.out.println("The number"  +n+ "is a prime number");
			else
				System.out.println("The number"  +n+  "is not a prime number" );
			}
					
	}
