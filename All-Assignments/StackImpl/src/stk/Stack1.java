

//this Implementation is done by (shamimahemad).
package stk;

public class Stack1 {
	
	 int data[];
	 int top;

	public Stack1(int size) {
		
		 data=new int[size];
		 top=-1;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	public  int getTop() {
		return top;
	}

	public  void setTop(int top) {
		this.top = top;
	}

	public Stack1(int[] data) {
		super();
		this.data = data;
	}

	public void Push(int v) {
		
		if(top==data.length-1) {
			
			System.out.println("stack is overflow..");
		}else {
			data[++top]=v;
		}
	}

	public void Pop() {
		if(top==-1) {
			System.out.println("stack is empty..");
		}else {
			System.out.println("poped element is.....");
			System.out.println(data[top--]);
		}
		
	}

	public void peek() {
	     
		if(top==-1) {
			System.out.println("stack is empty..");
		}else {
			System.out.println("peak element is ..");
			System.out.println(data[top]);
		}
		
	}

	public void display() {
		if(top==-1) {
			System.out.println("stack is empty..");
		}else {
			System.out.println(" data are...");
		for(int i=top;i>=0;i--) {
			System.out.println(" "+data[i]);
		   }
		}
		
	}

}
