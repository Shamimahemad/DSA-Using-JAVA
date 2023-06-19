package stkll;

import java.util.Scanner;

public class DNMSatckMain {

	public static void main(String[] args) {
		dynamicStack ds=new dynamicStack();
Scanner sc=new Scanner(System.in);
		
		int choice=0;
		int v;
            do {
			System.out.println(" \n1.Push \n2.Pop \n3.peek \n4.display \n5.Exit");
			System.out.println("Enter your choice ..");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println(" enter element .");
				 v=sc.nextInt();
				 ds.Push(v);
				break;
			case 2:
				ds.Pop();
				break;
				
			case 3:
				 ds.peek();
				break;
			case 4:
				ds.display();
				break;
			case 5:
				sc.close();
				System.out.println("Thank you for visiting....");
				break;
			}
			
		}while(choice!=5);

	}


//this Implementation is done by (shamimahemad).

	
}
