
public class QOpration {

	private int data[];
	private int rear,front;
	public QOpration(int size) {
		data=new int [size];
		rear=front=-1;
	}
	public boolean isEmpty() 
	{
		return rear==-1;
		
	}	public boolean isFull() {
		if(rear==data.length-1) {
			System.out.println("Q is Full!");
		}
		return true;
	}
	
	public boolean enque(int v) {
		Node nn=new Node(v);
		if(isFull())
		{
			return false;
		}
		else {
			
		}
		return true ;
	}
	
}
