package com.bridgeit.DataStructure;
import java.util.*;
public class BalancedParentheses {

	public  boolean isBalanced(String string)
	{
		Stack<Character>stack=new Stack<>();
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='(' || string.charAt(i)=='{'|| string.charAt(i)=='[')
			{
				stack.push(string.charAt(i));
			}
			else if(string.charAt(i)==')'||string.charAt(i)=='}'|| string.charAt(i)==']')
			{
				char exp=string.charAt(i);
				char ch=stack.peek();
				if((ch=='('&&exp==')')|| (ch=='['&&exp==']')||(ch=='{'&&exp=='}'))
				{
					stack.pop();
				}
				else
				{
					return false;
				}
			}
			
			
		}
		if(stack.empty())
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Arthmatic Expression : ");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		BalancedParentheses obj=new BalancedParentheses();
		Boolean status=obj.isBalanced(string);
		if(status==true)
		{
			System.out.println("Arithmatic Expression is Balanced");
		}
		else
		{
			System.out.println("Arithmatic Expression is not Balanced");
		}
		
	}

}
