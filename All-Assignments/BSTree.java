package BST22;

  class BinarySearchTree {
	  static class Node{
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
	  }
	private Node root;
	public BinarySearchTree() {
		root=null;
	}
	public void add(int v) {
		Node nn=new Node(v);
		if(root==null) {
			root=nn;
		}else {
			Node temp=root;
			while(true) {
				if(v<temp.data) {
					if(temp.left!=null) {
						temp=temp.left;
					}
				else {
					temp.left=nn;
					break;
				}
			}else {
				if(temp.right!=null) {
					temp=temp.right;
				}else {
					temp.right=nn;
					break;
				}
			}
		  }
		}
	
	}
	
public void preorder(Node temp) {
	
	if(temp==null) {
	return;
	}
	
	System.out.print(""+temp.data+",");
	preorder(temp.left);
	preorder(temp.right);
	
}
  
public void preorder() {
	System.out.println("preorder treversal...");
	preorder(root);
}


	}

public class BSTree {
	
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.add(50);
        bst.add(30);
        bst.add(10);
        bst.add(90);
        bst.add(100);
        bst.add(40);
        bst.add(70);
        bst.add(80);
        bst.add(60);
        bst.add(20);
        bst.preorder();
   
	}

}
  
