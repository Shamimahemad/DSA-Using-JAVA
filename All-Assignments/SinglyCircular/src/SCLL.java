

public class SCLL {

	private Node head;
    private Node tail;
	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public boolean insertAtFirst(int v)
	{
     	Node nn=new Node(v);
     	if(head==null)
     	{
    		tail=head=nn;
    		head.setNext(tail);
    		tail.setNext(head);
    		return false;
    	}
     	else {
     	
    		nn.setNext(head);
   		
  		    tail.setNext(nn);
  		    head=nn;
     	}
		
		
		return true;
	}
	public boolean insertAtLast(int v){
		
		Node nn=new Node(v);
		
		if(head==null) {
			head=tail=nn;
			head.setNext(tail);
			tail.setNext(head);
			return false;
		}
		else {
			//Node temp=head;
			/*while(temp.getNext()!=head)
			{
				temp=temp.getNext();
			}*/
			nn.setNext(head);
			tail.setNext(nn);
			tail=nn;
			//temp.setNext(nn);
		}
		
		
		return true;
	}

	public boolean  insertAtPos(int v,int pos) {
		Node nn=new Node(v);
		if(head==null && pos==1)
		{
			insertAtFirst(v);
			return false;
		}
		else {
			Node temp=head;
			int count=1;
			while(count<pos-1) {
				count++;
				temp=temp.getNext();
			}
			
			nn.setNext(temp.getNext());
			temp.setNext(nn);
		}
		
		return true;
	}
	public void display() {
		if(head==null) {
			System.out.println("List is Empty;;;");
			return;
		}
		
		Node temp = head;
		do {
			System.out.print(" "+temp.getData());
			temp = temp.getNext();
		}while(temp!=head);
		System.out.println();
	}

}