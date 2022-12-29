/*Take a String from user and reverse it and also convert the same string to upper case. */
package pack1;

import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);// Take input from user
		System.out.println("Enter String");
		//String a=sc.nextLine();
		//System.out.println("Change into uppercase"+a.toUpperCase());
		StringBuilder sb=new StringBuilder();
		sb.append(sc.nextLine());
		System.out.println(sb.reverse());
		String st=sb.toString();
		System.out.println("Change into upper case="+st.toUpperCase());
	}

}
