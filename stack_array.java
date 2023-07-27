package dsa;

import java.util.Scanner;

class stack{
	int n=10;
	 int top = -1;
	 int a[]=new int[n];
	 
	 void push() {
		 if(top==n-1) {
			 System.out.println("overflow");
		 }
		 else {
			 System.out.println("enter data to be pushed");
			 Scanner sc= new Scanner(System.in);
			 int i=sc.nextInt();
			 top=top+1;
			 a[top]=i;
			 System.out.println("item inserted");
		 }
	 }
	 void pop() {
		 if(top==-1) {
			 System.out.println("underflow");
		 }
		 else {
			 top=top-1;
			 System.out.println("item deleted");
		 }
	 }
	 void display() {
		 for(int j=top;j>=0;j--) 
		 {
			 System.out.println("the stack is"+a[j]);
		 }
	 }
	 
 }
public class stack_array {

	public static void main(String[] args) {
		stack  st = new stack();
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
				st.push();
				break;
			}
			case 2:{
				st.pop();
				break;
			}
			case 3:{
				st.display();
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
