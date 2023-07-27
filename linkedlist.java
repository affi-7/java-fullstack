package dsa;

import java.util.Scanner;

public class linkedlist {
     
	static class node{
		int data;
		node next;
		node(int data){
			this.data=data;
			this.next=null;
		}
	}
		node head=null;
		public void creation() {
			int data,n;
			Scanner sc =new Scanner(System.in);
			do {
			System.out.println("enter the data for linked list");
			data=sc.nextInt();
			node new_node=new node(data);
			if(head==null) {
				head=new_node;
			}else {
				new_node.next=head;
				head=new_node;
			}
			System.out.println("add more data press 1");
			System.out.println("press any other key to exit");
			n=sc.nextInt();
			}while(n==1);
			
		}
		
		void traversing() {
			node temp=head;
			if(head==null) {
				System.out.println("list does not exist");
			}else{
				while(temp!=null){
					System.out.print(temp.data);
					temp=temp.next;
				}
			}
		}
	
	
	
	
	
	public static void main(String[] args) {
		
		linkedlist ll =new linkedlist();
		ll.creation();
		ll.traversing();

		
		
	}

}
