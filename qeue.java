package dsa;

import java.util.Scanner;

public class qeue {
		int n=10;
		 int front = -1;
		 int rear=-1;
		 int a[]=new int[n];
		 
		 void Enque() {
			 if(rear==n-1) {
				 
			 if(front==-1 && rear==-1) {
				 System.out.println("underflow");
				 front=0;
				 rear=0;
			 }
			 else {
				 System.out.println("enter data to be qeued");
				 Scanner sc= new Scanner(System.in);
				 int i=sc.nextInt();
				 front=0;
				 rear=rear+1;
				 int a[];
				 System.out.println("data inserted");
			 }
			 }
		 }
		 void Deque() {
			 if(front==-1&& rear==-1) {
				 System.out.println("underflow");
			 }
			 else {
				 front=front+1;
				 System.out.println("item deleted");
			 }
		 }
		 void display() {
			 for(int j=front;j<=rear;j++) 
			 {
				 System.out.println("the queue is"+a[j]);
			 }
		 }
}
		 
		 public class queue {
		 public static void main(String[] args) {
				qeue  q = new qeue();
				int l;
				do {
					Scanner sc= new Scanner(System.in);
					System.out.println("press 1 for pushing");
					System.out.println("press 2 for popping");
					System.out.println("press 3 for displaying te stack ");
					System.out.println("press 0 for exit");
					int d=sc.nextInt();
					switch(d) {
					case 1:{
						q.Enque();
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

