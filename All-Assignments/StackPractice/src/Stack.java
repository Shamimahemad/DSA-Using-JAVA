
public class Stack {
	char arr[];
	int size;
	int top;
	public Stack(int size) {
		arr= new char[size];
		this.size=size;
		top=-1;
	}
	public void push(char a) {
		if(isFull()) {
			System.out.println("Stack id full");
			return;
		}
		
			arr[++top]=a;
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack id full");
			return ' ';
		}
		
			return arr[top--];
	}
	public void display() {
		System.out.println("Bracket Presence are");
		for(int i=top;i>=0;i--) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
	}
	public boolean isEmpty() {
		if(top==-1)
			return true;
		return false;
	}
	public boolean isFull() {
		if(top==size-1)
			return true;
		return false;
	}
			
}
