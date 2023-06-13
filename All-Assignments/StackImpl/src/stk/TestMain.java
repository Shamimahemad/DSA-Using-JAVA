package stk;
import java.util.Scanner;
public class TestMain {
	//this Implementation is done by (shamimahemad).
	public static void main(String[] args) {
            //stack is 12
		Stack1 st=new Stack1(12);
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
				 st.Push(v);
				break;
			case 2:
				st.Pop();
				break;
				
			case 3:
				 st.peek();
				break;
			case 4:
				st.display();
				break;
			case 5:
				sc.close();
				System.out.println("Thank you for visiting....");
				break;
			}
			
		}while(choice!=5);

	}

}
//this Implementation is done by (shamimahemad).
