package pack1;

import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
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
