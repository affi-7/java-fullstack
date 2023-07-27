package dsa;

import java.util.Scanner;

class que {
	int n=10;
	int front = -1;
	int rear=-1;
	int a[]=new int[n];

	void Enque(Scanner sc) {
		if(rear==n-1) {
			System.out.println("overflow");

		}

		else {
			System.out.println("enter data to be qeued");
			int i=sc.nextInt();
			if(front==-1 && rear==-1)  {
				front=0;
				rear=0;
				a[rear]=i;
			}else{
				rear=rear+1;
				a[rear]=i;
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
		System.out.print("the queue is:\n");
		for(int i=front;i<=rear;i++) 
		{
			System.out.println(
					a[i]);
		}
	}

	public class queue_array {

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
}
