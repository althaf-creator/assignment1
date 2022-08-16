package Assignment;

import java.util.Scanner;

public class assignment1 {
	public static void main (String[] arg)
	{
		String s = "";
		Scanner assign = new Scanner(System.in);
		
		System.out.println("Enter a symbol");
		s = assign.nextLine();
		
		if(s.equalsIgnoreCase("()"))
		{
			System.out.println("True");
		}else if (s.equalsIgnoreCase("{}"))
		{
			System.out.println("True");
		}else if(s.equalsIgnoreCase("[]"))
		{
			System.out.println("True");
		}
		else if (s.equalsIgnoreCase("(){}"))
		{
			System.out.println("True");
		}else if(s.equalsIgnoreCase("{}()"))
		{
			System.out.println("True");
		}
		else if(s.equalsIgnoreCase("()[]"))
		{
			System.out.println("True");
		}else if(s.equalsIgnoreCase("[]()"))
		{
			System.out.println("True");
		}
		else if(s.equalsIgnoreCase("[]{}"))
		{
			System.out.println("True");
		}else if(s.equalsIgnoreCase("{}[]"))
		{
			System.out.println("[]{}");
		}
	    else if (s.equalsIgnoreCase("()[]{}"))
		{
			System.out.println("True");
		}else if(s.equalsIgnoreCase("(){}[]"))
		{
			System.out.println("True");
		}else if(s.equalsIgnoreCase("[]{}()"))
		{
			System.out.println("True");
		}else if(s.equalsIgnoreCase("[](){}"))
		{
			System.out.println("True");
		}else if(s.equalsIgnoreCase("{}()[]"))
		{
			System.out.println("True");
		}else if(s.equalsIgnoreCase("{}[]()"))
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		
		 
	}

}
