
public class QNode {

	private int front;
	private int rear;
     int data[];
     int v;

	
	public QNode(int size) {
		this.data=new int[size];
        this.front=-1;
        this.rear=-1;
		
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}
	
	public boolean isEmpty() {
		if(rear==-1) {
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(rear==data.length-1) {
			System.out.println("Queue is Full!!");
			return true;
		}
		return false;
	}
	public boolean enque(int v) {
		if(isFull()) {
			return false;
		}
		else {
			if(rear==-1) 
				front=0;
			data[++rear]=v;	
		
		return true;
	}}
	public boolean deque() {
		if(isEmpty()) {
			return false;
		}
		else {
			if(front==rear+1) {
				System.out.println("All Elements are deleted");
				return false;
			}
			System.out.println("deleted element is : "+data[front++]);
			return true;
		}
		
	}
	
	public void display() {
		if(isEmpty()) {
			return;
		}
		for(int i=front;i<=rear;i++)
		{
			System.out.print("\t "+data[i]);
		}
		System.out.println();
	}

}
