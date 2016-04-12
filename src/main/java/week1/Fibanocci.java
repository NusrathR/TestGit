package week1;

public class Fibanocci {

	public static void main(String[] args) {
		int a,b,c;
		a=1; b=1;
		c = a+b;
		System.out.print("The fibonacci series is \n" +a + "\t" +b+ "\t" +c+ "\t");
		//Condition to check and print series upto 100
		while(c<100)
		{
			a = b;
			b = c;
			c = a+b;
			if(c>100)
				break;
			System.out.print(c +"\t");
			}

	}

}
