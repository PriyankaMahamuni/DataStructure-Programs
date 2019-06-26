package com.bridgeit.DataStructure;

public class Node<T> {
	T info;
	Node next;
	Node head;
	Node front;
	Node rear;
	Node()
	{
		head=null;
		front=null;
		rear=null;
	}
	/*****************************************************************************************************

	 *  @method 		: insert,display,insertAt,deleteAt
	 *  @description 	: insert - to insert data in linkedlist
	 *  				  display - to display all elements of linked list
	 *  				  insertAt - to take index and insert element
	 *  				  deleteAt - to take index and delete element
	 * 	@Param			: info,data
	 * 	@return 		: data
	 
	 *****************************************************************************************************/	
	/*			For Ordered And Unordered List 			*/
	public  void insert(T info)
	{
		Node node=new Node();
		node.info=info;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
		}
		
		
	}
	public void display()
	{
		Node n=head;
		while(n.next!=null)
		{
			System.out.println(n.info);
			n=n.next;
		}
		System.out.println(n.info);
	}
	public boolean search(T data)
	{
		Node n=head;
		
		while(n.next!=null)
		{
			
			if(n.info.equals(data))
			{
				return true;
			}
			
			n=n.next;
		}
		return false;
	}
	public void insertAT(T data)
	{
		
		Node n=head;
		int num;
		int no=(int)data;
		System.out.println(no);
		int i=-1;
		while(n.next!=null)
		{
			 num=(int)n.info; 
			 System.out.println(num);
			if(num > no)
			{
				insertData(i,no);
				break;
			}
			i++;
			n=n.next;
		}
	}
	public  void insertData(int index,int data)
	{	
		System.out.println("Data : "+data);
		Node node=new Node();
		node.info=data;
		node.next=null;
		Node n=head;
		for(int i=0;i<index;i++)
		{
				n=n.next;
		}
		node.next=n.next;
		n.next=node;
	}
	public void delete(T data)
	{
		Node n=head;
		int i=-1;
		while(n.next!=null)
		{
			 
			if(n.info.equals(data))
			{
				deleteData(i);
				break;
			}
			i++;
			n=n.next;
		}
	}
	public  void deleteData(int n)
	{
			Node node=head;
			Node n1=null;
			for(int i=0;i<n;i++)
			{
				node=node.next;
			}
			n1=node.next;
			node.next=n1.next;
			System.out.println("Deleted element at : "+(n+1)+"position is :"+ n1.info);
			n1=null;
			
	}
	/*			End of Ordered and Unordered List		*/
	
	/*****************************************************************************************************

	 *  @method 		: push, pop, peek, enqueue, dequeue
	 *  @description 	: push - to push element in stack
	 *    				  pop - to pop element from stack
	 *       			  peek - to take first element from stack
	 *         	          enqueue - inserting element in queue
	 *         			  dequeue - to delete element from queue	
	 * 	@Param			: info,data
	 * 	@return 		: data
	 
	 *****************************************************************************************************/	
	
	/*			For Stack		*/
	public void push(T data)
	{
		Node n=head;
		Node node=new Node();
		node.info=data;
		node.next=null;
		if(head==null)
		{
			head=node;
		}
		else
		{
			node.next=head;
			head=node;
		}
	}
	public T peek()
	{
		T ch= (T) head.info;
		return ch;
	}
	public T pop()
	{
		Node n=head;
		head=head.next;
		
		return (T) n.info;
		
	}
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	/*		End of Stack		*/
	/*****************************************************************************************************

	 *  @method 		: enqueue,dequeue
	 *  @description 	: this is used to insert element in queue and delete from queueS 
	 * 	@Param			: data
	 * 	@return 		: data
	 
	 *****************************************************************************************************/	
	/*    	Queue 				*/
	public void enqueue(T data)
	{
		Node node=new Node();
		node.info=data;
		node.next=null;
		if(rear==null)
		{
			front=node;
			rear=node;
		}
		else
		{
			Node n=rear;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=node;
			node=rear;
		}
	}
	public T dequeue()
	{
			T no= null;
			
			if(front !=null)
			{
				Node n=front;
				T data=(T) n.info;
				front=front.next;
				
				//n=null;
				return data;
			}
			return no; 
	}
	public void displayQueue()
	{
        Node ptr = front;
        while (ptr != rear.next )
        {

            System.out.print(ptr.info+" ");

            ptr = ptr.next;

        }
        System.out.println(ptr.info);        
	}
	
	/*****************************************************************************************************

	 *  @method 		: dequeueFromEnd
	 *  @description 	: this is used to delete element from end 
	 * 	@Param			: none
	 * 	@return 		: data
	 
	 *****************************************************************************************************/	
	
	/*			Palindrome String Using queue		*/
	public T dequeueFromEnd()
	{
		T data;
		Node lastnode=rear;
		Node previouslast=null;
		if(lastnode==null)
		{
			return null;
		}
		else
		{
			while(lastnode.next!=null)
			{
				previouslast=lastnode;
				lastnode=lastnode.next;
			}
			data= (T) lastnode.info;
			previouslast.next=null;
		}
		
		return data;
	}
	
	/*			End of Palindrome Using queue		*/
	
}
