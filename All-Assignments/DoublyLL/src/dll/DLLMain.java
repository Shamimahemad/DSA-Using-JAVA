package dll;

import java.util.Scanner;



public class DLLMain {
	private Node head;
    private Node prev;
	public DLLMain(Node head) {
		super();
		this.head = head;
	}

	public DLLMain() {
		this.head=null;
		this.prev=null;
		
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public static void main(String[] args) {
		
		
		int choice,val,pos;
		DLLMain sl=new DLLMain();
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("\n1.InsertAtFirst \n2.InsertAtLast \n3.InsertAtPosition \n4.DeleteAtFirst \n5.DeleteAtLast \n6.display \n7.exit");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter element :");
				 val=sc.nextInt();
				sl.InsertAtFirst(val);
				break;
			case 2:
				System.out.println("enter element :");
				 val=sc.nextInt();
				sl.InsertAtLast(val);
				break;
			case 3:
				System.out.println("enter element :");
				 val=sc.nextInt();
				 System.out.println("enter element position :");
				 pos=sc.nextInt();
				 sl.InsertAtPos(val, pos);
				break;
			case 4:
				sl.deleteAtFirst();
				break;
			case 5:
				sl.deleteAtLast();
				break;
			case 6:
				System.out.println("List are ....");
				sl.display();
				break;
			case 7:
				System.out.println("Thank you for visiting....");
				break;
			}
			
		}while(choice!=7);

	

	}

	private void display() {
		Node temp=head;
		do {
			System.out.print("\t "+temp.getData());
			temp=temp.getNext();
		}while(temp!=null);
		
		
	}

	private void deleteAtLast() {
		// TODO Auto-generated method stub
		
	}

	private void deleteAtFirst() {
		// TODO Auto-generated method stub
		
	}

	private void InsertAtPos(int val, int pos) {
		Node nn=new Node(val);
		if(head==null && pos==1) {
			InsertAtFirst(val);
		}else {
			Node temp=head;
			for(int i=1;i<pos-1;i++) {
				if(temp.getNext()==null)
					break;
				temp=temp.getNext();
			}
			nn.setNext(temp.getNext());
			nn.setPrev(temp);
			temp.setNext(nn);
			//temp.setNext(nn.getNext());
			
		}
		
	}

	private boolean InsertAtLast(int val) {
		Node nn=new Node(val);
		if(head==null) {
			head=nn;
		}else {
			Node temp=head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			nn.setPrev(temp);
			temp.setNext(nn);
		}
		
		return true;
	}

	private boolean InsertAtFirst(int val) {
		Node nn=new Node(val);
		if(head==null) {
			head=nn;
		}else {
			nn.setNext(head);
			head=nn;
		}
		return true;
	}

}
