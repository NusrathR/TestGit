package week2hw;

import com.google.common.base.Strings;

public class Pattern {
	public static void main(String[] args) {
		//System.out.println("*\n***\n*****\n*******\n*********");
		int i;
		String s = "*";
		for(i=1;i<10;i++)
		{
		System.out.println(Strings.repeat(s, i));
		i=i+1;
				}
	}
}
