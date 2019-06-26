/**
 * @purpose  	: To check the String is Palindrome or not using dequeue
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 29.05.19
 */

package com.bridgeit.DataStructure;
import java.util.*;
public class PalindromeStringUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string;
		Node queue=new Node();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String To Check it is Palindrome or not : ");
		string=sc.next();
		for(int i=0;i<string.length();i++)
		{
			queue.enqueue(string.charAt(i));
		}
		String reverse="";
		for(int i=0;i<string.length();i++)
		{
			reverse=reverse+(queue.dequeueFromEnd());
		}
		System.out.println("Reverse String : "+reverse);
		if(string.equals(reverse))
		{
			System.out.println("Both Strings are Palindrome");
		}
		else
		{
			System.out.println("Both Strings are not Palindrome");
		}
	}

}
