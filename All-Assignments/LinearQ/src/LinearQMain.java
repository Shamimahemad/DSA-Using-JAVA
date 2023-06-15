import java.util.*;
public class LinearQMain {
	
	public static void main(String[] args) {
		QNode q=new QNode(3);
		Scanner sc = new Scanner(System.in);
		int choice,val;
		do {
			System.out.println("0.Exit\n1.Display\n2.Enque\n3.Deque\n");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
		switch(choice) {
				case 1:
					q.display();
					break;
				case 2:
					System.out.println("Enter Value");
					val = sc.nextInt();
					q.enque(val);
					break;
				case 3:
					q.deque();
					break;
				
		}
		}while(choice!=0);
		System.out.println("Duwao Me Yaad Rakhanaa...!!!");
	}

}
