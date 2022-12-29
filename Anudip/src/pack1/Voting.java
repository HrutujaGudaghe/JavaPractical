
/*Write a program take a input from the age  the user if the age is above 18 print "you are eligible 
to  vote  else throw an excepation that age is not correct*/
package pack1;

import java.util.*;
public class Voting {

	public static void main(String[] args) {
		int age ;
		Scanner sc=new Scanner(System.in);//Taking input from user
	    System.out.println("Enter your age");
	    age=sc.nextInt();//pass the value
	    try {
	    	if(age>=18)//Print Eligible if condition is true
	    	{
			    System.out.println("Eligible for Voting");		    	
		    }
		    else //Print Eligible if condition is false
		    {
		    	throw new Exception(" Not eligible for Voting");
		    }
	    }
	    catch(Exception e)
	    {
	     System.out.println(e);
	    }
	    
            
	}

}
