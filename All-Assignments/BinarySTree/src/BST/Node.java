package BST;

public class Node {
	private int data;
	private Node left;
	private Node right;
    
	public Node() {
		data=0;
		left=null;
		right=null;
	}
	public Node(int val) {
		data=val;
		left=null;
		right=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}

}
