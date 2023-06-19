package stkll;

public class dynamicStack {
	Node top;
	public dynamicStack() {
		this.top=null;
	}
	public void Push(int v) {
		Node nn=new Node(v);
		if(isEmpty()) {
			top=nn;
			return;
		}
		nn.setPrev(top);
		top=nn;
		
	}
	public int Pop() {

     if(isEmpty()) {
    	 System.out.println(" stack is empty....");
     }else {
    	 System.out.println("poped element is..");
    	 int i = top.getData();
    	 top=top.getPrev();
    	  System.out.println(i);
    	  return i;
     }
	return -1;
		
	}
	public void peek() {
		if(isEmpty()) {
	    	 System.out.println(" stack is empty....");
	     }else {
	    	 System.out.println("peek element is..");
	    	 System.out.println(top.getData());
	     }
		
	}
	public void display() {
		Node temp=top;
		if(top==null)
			System.out.println("Stack is empty...");
		
		while(temp!=null) 
		{
			System.out.print("\t "+temp.getData());
			temp=temp.getPrev();
		}
		
	}
	public boolean isEmpty() {
		if(top==null)
			return true;
		return false;
	}

}
