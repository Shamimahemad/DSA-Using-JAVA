package s1;
public class Stack {
	int data[];
	 private int top;
	
	public Stack(int size)
	{
		data=new int[size];
		top=-1;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
	
	public void push(int v) {
		if(isFull());{
			System.out.println("Stack is Full");
			//return;
		}
		data[++top]=v;
	}
    
	public int pop() {
		if(isEmpty());
		{
			System.out.println("\t Stack is Empty");
			return -1;
		}
		
	}
	
	public boolean isEmpty() {
		
		if(top==-1)
		  return true; 
		
		return false;
	}
	public boolean isFull()
	{
		if(top==data.length-1)
			return true;
		return false;
	}
	public void display() {
//		if(isEmpty());
//		{
//			System.out.println("Satck is empty");
//			//return;
//		}
	
	for(int i=top;i>=0;i--) {
		System.out.println(data[i]);
	
	}
   }
}
