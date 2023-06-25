package crq;

import java.util.Scanner;
public class Testmain2 {

	public static void main(String[] args) {
		CircularQ lq=new CircularQ(30);
		Scanner sc=new Scanner(System.in);
		int choice=0;
		int v;
        do {
        	System.out.println(" \n1.Enqueue \n2.dequeue \n3.peek \n4.Display list \n5.Exit");
        	System.out.println("Enter your choice...!");
        	choice=sc.nextInt();
        	switch(choice) {
        	case 1:
        		System.out.println("Enter element..");
        		v=sc.nextInt();
        		lq.Enqueue(v);
        		break;
        	case 2:
        		lq.dequeue();
        		break;
        	case 3:
        		lq.peek();
        		break;
        	case 4:
        		lq.display();
        		break;
        	case 5:
        		sc.close();
        		System.out.println("thank you for visiting....");
        		break;
        	}
        	
        }while(choice!=5);
	}

}
