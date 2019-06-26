/**
 * @purpose  	: The List of Words to a File of ordered list using linked list.
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 25.05.19
 */

package com.bridgeit.DataStructure;
import java.io.*;
import java.util.*;
public class OrderedListOperation {
	public static int[] sort(int array[])
	{
		int min=0,temp=0;
		for(int i=0;i<array.length;i++)
		{
			min=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[min])
				{
					min=j;
				}
			}
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node=new Node();
		Scanner sc1=new Scanner(System.in);
		int number=0;
		File fin=new File("/home/abc/Documents/BridgeLabz/Task/Numbers");
		try {
			Scanner sc=new Scanner(fin);
			String string=sc.nextLine();
			String str[]=string.split(",");
			
				int array[]=new int[str.length];
				for(int i=0;i<array.length;i++)
				{
					array[i]=Integer.parseInt(str[i]);
					
				}
				int array1[]=sort(array);
				for(int i=0;i<array1.length;i++)
				{
					
					node.insert(array1[i]);
				}
				node.display();
				System.out.print("Enter Number : ");
				number=sc1.nextInt();
				boolean status=node.search(number);
				if(status==true)
				{
					node.delete(number);
					node.display();
				}else{
					node.insertAT(number);
					node.display();
				}
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
