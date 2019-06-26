/**
 * @purpose  	: To have an input panel to add people to Queue to either deposit or withdraw money and dequeue the people. Maintain the Cash Balance using queue.
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 29.05.19
 */

package com.bridgeit.DataStructure;
import java.io.Console;
import java.util.*;
public class BankCashCounter {
	char choice;
	int ch,amt;
	String name;
	BankCashCounter()
	{
		
		ch=0;	
	}
	public  void BankOperation()
	{
		Scanner sc=new Scanner(System.in);
		Node queue=new Node();//queue for people
		
		do
		{
			
			System.out.println("***Welcome to Bank Cash Counter ***");
			System.out.print("Menu\n1.New Customer\n2.Exit\n3.display");
			System.out.print("Enter Choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter Name : ");
						name=sc.nextLine();
						queue.enqueue(name);
						int cash=0,amount=0;
						Node node=new Node();//queue of their cash
						do {
							System.out.println("Menu\n1.Deposite Cash\n2.Withdraw Cash\n3.Cheak Balance");
							System.out.print("Enter Choice : ");
							ch=sc.nextInt();
							switch(ch)
							{
								case 1:System.out.println("Enter Cash to Deposite : ");
									   amount=sc.nextInt();
									   if(amount<=0)
									   {
										   System.out.println("Amount must be greter than 0");
									   }
									   else
									   {
										   cash=cash+amount;
										   node.enqueue(amount);
									   }
									   break;
								case 2:if(cash!=0)
										{
											
											if(node.dequeue()==null)
											{
											
												System.out.println("Insufficient Balance");
											}
											else
											{
												amt=(int) node.dequeue();
												System.out.println(amt+"is withdraw successfully");
												cash=cash-amt;
											}
										}
										else
										{
											System.out.println("Insufficient Balance");
										}
										break;
								case 3: 
										System.out.println("Balance : "+cash);
									   break;
							    default:System.out.println("Invalid Choice ");
							    		break;
							}
							System.out.print("Do you want to Continue..(press y/n) :");
							choice=sc.next().charAt(0);
						}while((choice=='y')||(choice=='Y'));
						break;
				case 2:break;
				case 3:queue.displayQueue();break;
			}
			System.out.print("For New people Transaction(press y/n) :");
			choice=sc.next().charAt(0);
		}while((choice=='y')||(choice=='Y'));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankCashCounter obj=new BankCashCounter();
		obj.BankOperation();
	}

}
