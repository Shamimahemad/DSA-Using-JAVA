package BST;
import java.util.Scanner;
public class BSTMain {

	public static void main(String[] args) {
		  BinarySearchTree bst=new BinarySearchTree();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		int val;
		do {
			System.out.println(" \n1.Add Element in BST \n2.Show Inorder \n3.Show Preorder "
					+ "\n4.Show Postorder \n5.Exit");
			System.out.println("Enter your choice..");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter element..");
				val=sc.nextInt();
				bst.add(val);
				break;
			case 2:
				bst.inorder();
				break;
			case 3:
				bst.preorder();
				break;
			case 4:
				bst.postorder();
				break;
			case 5:
				sc.close();
				System.out.println("thanl you for visiting....");
				break;
			}
		}while(choice!=5);

	}

}
