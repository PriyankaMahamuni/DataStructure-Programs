/**
 * @purpose  	: To Show Arithmetic Expression is balanced or not using stack data structure.
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 27.05.19
 */

package com.bridgeit.DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class BalanaceParentheseUsingStack {
	
	public  boolean isBalanced(String string)
	{
		Node stack=new Node();
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='(' || string.charAt(i)=='{'|| string.charAt(i)=='[')
			{
				stack.push(string.charAt(i));
				
			}
			else if(string.charAt(i)==')'||string.charAt(i)=='}'|| string.charAt(i)==']')
			{
				char exp=string.charAt(i);
				char ch=(char) stack.peek();
				System.out.println("Top Element : "+ch);
				if((ch=='('&& exp==')')|| (ch=='['&& exp==']')||(ch=='{'&& exp=='}'))
				{
					System.out.println("Removed element : "+stack.pop());
				}
				else
				{
					return false;
				}
			}
			
			
		}
		if(stack.isEmpty())
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node=new Node();
		System.out.print("Enter Arthmatic Expression : ");
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		BalanaceParentheseUsingStack obj=new BalanaceParentheseUsingStack();
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
