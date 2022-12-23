package pack1;

import java.util.Scanner;
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String");
		System.out.println("Enter 2nd String");
		String a=sc.nextLine();
		String b=sc.nextLine();
		if(a.contains(b))
		{
			System.out.println("Its contain same String");
		}
		else
		{
			System.out.println("There are no such String");
		}
	}

}
