/**
 * @purpose  	: The List of Words to a File of ordered list using linked list.
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 27.05.19
 */

package com.bridgeit.DataStructure;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
class UnorderedList
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node=new Node();
		Scanner sc1=new Scanner(System.in);
		File file=new File("/home/abc/Documents/BridgeLabz/Task/src/demo.txt");
		try
		{
			Scanner sc=new Scanner(file);
			boolean flag=false;
			String string=sc.nextLine();
			String []wordlist=string.split(",");
			
			for(int i=0;i<wordlist.length;i++)
			{
				node.insert(wordlist[i]);
			}
			node.display();
			System.out.print("Enter data for Search : ");
			String word=sc1.next();
			boolean status=node.search(word);
			if(status)
			{
				node.delete(word);
				
			}
			else
			{
				node.insert(word);
				FileWriter elementWrite=new FileWriter("/home/abc/Documents/BridgeLabz/Task/src/demo.txt");
				elementWrite.write(word);
				
			}
			node.display();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
