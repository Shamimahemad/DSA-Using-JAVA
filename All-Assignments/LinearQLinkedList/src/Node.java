
public class Node {
	
	private int data;
	private Node  Next;
	
	public Node(int data) {
		this.data=data;
          this.Next=null;
	}
	

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return Next;
	}

	public void setNext(Node next) {
		this.Next = next;
	}


	public void display() {
		// TODO Auto-generated method stub
		
	}
}	





























//}
	
	

//	public void display() {
//		Node temp=head;
//		while(temp.getNext()!=null) {
//			System.out.print("\t "+data.length);
//			temp=temp.getNext();
//		}
//		
//	}
//	 
//}
