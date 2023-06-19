package stkll;

public class Node {
	private Node top;
	private Node prev;
    private int data;
	public Node(int data) {
		this.data=data;
		this.prev=null;
	this.top=null;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node(Node top, Node prev, int data) {
		super();
		this.top = top;
		this.prev = prev;
		this.data = data;
	}

	public Node getTop() {
		return top;
	}

	public void setTop(Node top) {
		this.top = top;
	}

}
