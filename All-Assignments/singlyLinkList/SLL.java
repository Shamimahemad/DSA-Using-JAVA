package singlyLinkList;

public class SLL {
private node head;

public SLL() {
	super();
	this.head = head;
}

 public node getHead() {
	return head;
}

public void setHead(node head) {
	this.head = head;
}

public boolean insertAtLast(int v) {
	node temp=head;
	node nn=new node(v);
	if(nn==null)
		return false;
	else {
		while(temp.next!=null) {
			temp = temp.getNext();
		}
		
	}
	return true;
}

public void  display() {
	node temp=head;
	System.out.print("\nThe elements are:");
	while(temp.getNext()!=null)
	{
		System.out.print("\t"+temp.getData());
		temp=temp.getNext();
	}
	System.out.print("\t"+temp.getData());
	
	 
	 
 }
public  boolean insertAtBig(int v) {
	node nn=new node(v);
	if (nn==null)
		return false;
	if(head==null)
		head=nn;
	else
	{	
		nn.setNext(head);
		head=nn;
	}
	return true;
	
}
	 

	
		
	
}
