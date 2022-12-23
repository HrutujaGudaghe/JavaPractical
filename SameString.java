package pack1;

import java.util.Scanner;
public class SameString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two string");
		
	String x=sc.nextLine();
	String y=sc.nextLine();
		
if(x.equals(y))
{
		
		System.out.println("Both Strings are same");
}
else
{
	System.out.println("Both String are not same");
}
	}

}
