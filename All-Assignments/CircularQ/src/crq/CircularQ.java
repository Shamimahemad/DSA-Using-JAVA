package crq;

public class CircularQ {
	 int data[];
	private int front;
	private int rear;
  public CircularQ(int size)
  {
	  data=new int[size];
	  front=rear=-1;
  }
public int[] getData() {
	return data; 
}
public void setData(int[] data) {
	this.data = data;
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

 public boolean isFull() {
	 if(front==rear && front!=-1)
		 return true;
	 return false;
 }
 public boolean isEmpty() {
 if(front==rear && front==-1)
	 return true;
	 return false;
 }
public void Enqueue(int v) {
	if(isFull()) {
		System.out.println("QUEUE is Full.....");
	}
	  rear=(rear+1)%data.length;
	  data[rear]=v;
}
public void dequeue() {
	if(isEmpty()) {
		System.out.println("QUEUE is Empty..");
	}
	front=(front+1)%data.length;
	if(front==rear)
		front=rear=-1;
}
public void peek() {
	int max=(front+1)%data.length;
	System.out.println("peek element is.."+data[max]);
	
}
public void display() {
     System.out.println("Queue element are..");
     int temp=front;
	for(int i=temp;i<=rear;i++) {
		System.out.print(" \t "+data[i]);
	}
    	
}
}
