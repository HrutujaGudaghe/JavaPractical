/*Write a program take 2 string as input from user and find if first string exists in another. */
package pack1;

import java.util.Scanner;
public class String2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Taking input from user
		System.out.println("Enter 1st String");
		System.out.println("Enter 2nd String");
		String a=sc.nextLine();
		String b=sc.nextLine();
		if(a.contains(b))
		{
			System.out.println("It's contain same String");
		}
		else
		{
			System.out.println("There are no such String");
		}

	}

}
