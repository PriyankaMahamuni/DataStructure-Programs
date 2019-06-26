/**
 * @purpose  	: To find the Prime numbers in 0-1000 range.
 * 				  i.   further store only prime numbers that are anagram.
 * 				  ii.  store prime anagram numbers in stack using linked list.
 * 				  iii. store prime anagram numbers in queue using linked list.
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 3.06.19
 */

package com.bridgeit.DataStructure;

import java.util.Arrays;

public class Prime2DArray {
	
	public static int[] isPrime()
	{
		int i,j,k=0,l=0;
		boolean flag=false;
		int array[]=new int[167];
		int anagramArray[]=new int[163];
		for(i=3;i<1000;i++)
		{
			flag=false;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=true;
				}
			}
			if(flag==false)
			{
				array[k]=i;
				if(i>11)
				{
					int num=isAnagram(i);
					if(num!=0)
					{
						anagramArray[l]=num;
						l++;
					}
				}
				
				k++;
			}
		}
		display(anagramArray);
		return array;
		
	}
	public static int isAnagram(int number)
	{
		int temp1=number;
		int temp2=number;
		char [] array1= (""+temp1).toCharArray();
		char [] array2= (""+temp2).toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		temp1=Integer.parseInt(new String(array1));
		temp2=Integer.parseInt(new String(array2));
		if(temp1==temp2)
		{
			return number;
		}
		return 0;
	}
	public static void display(int array[])
	{
		Node stack=new Node();
		Node queue=new Node();
		System.out.println("Anagram Numbers : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
			stack.push(array[i]);
			queue.enqueue(array[i]);
		}
		System.out.println("Reverse Anagram Numbers : ");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(stack.pop());
		}
		System.out.println("Anagram Numbers from Queue :" );
		for(int i=0;i<array.length;i++)
		{
			System.out.println(queue.dequeue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=isPrime();
		int primeArray[][]=new int[10][167];
		for(int i=0;i<10;i++)
		{
			System.out.println(i +" to "+(i+1)*100);
			for(int j=0;j<167;j++)
			{
				if(array[j]>(i*100)&& array[j]<(i+1)*100)
				{
					primeArray[i][j]=array[j];
					System.out.println(primeArray[i][j]);
				}
			}
		}
	}

}
