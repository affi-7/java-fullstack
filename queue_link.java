package dsa;

import java.util.Scanner;

import dsa.linkedlist.node;

public class queue_link {
	
	
	static class Node{
		int data;
		node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	node f=null;
	node r=null;
	public void Enque(Scanner sc, int data) {
		System.out.println("enter the data");
		int i=sc.nextInt();
		node new_node=new node(data);
		if(f==null) {
			f=new_node;
			r=new_node;
		}
		else
		{
			r.next=new_node;
			r=new_node;
		}
		}
	
	void Deque() {
if(f==null) {
	System.out.println("underflow");
	f=f.next;
	
}
	}
	void display() {
		node temp=f;
		if(f==null) {
			System.out.println("list does not exist");
		}else{
			while(temp!=null){
				System.out.print(temp.data);
				temp=temp.next;
			}
	}

	}

	public static void main(String[] args) {
		que q = new que();
		int l;
		do {
			Scanner sc= new Scanner(System.in);
			System.out.println("press 1 for enque");
			System.out.println("press 2 for deque");
			System.out.println("press 3 for displaying the que ");
			System.out.println("press 0 for exit");
			int d=sc.nextInt();
			switch(d) {
			case 1:{
				q.Enque(sc);
				break;
			}
			case 2:{
				q.Deque();
				break;
			}
			case 3:{
				q.display();
				break;
			}

			}
			System.out.println("press 0 for menu");
			System.out.println("press any key to exit");
			l=sc.nextInt();
		}
		while(l==0); 
		System.out.println("exit succesfull");

	}
}
	

