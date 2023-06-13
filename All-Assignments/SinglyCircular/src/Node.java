
public class Node {
	
	private int data;
	private Node Next;

	public Node(int data)
	{
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

	public void setNext(Node Next) {
		this.Next = Next;
	}


}
