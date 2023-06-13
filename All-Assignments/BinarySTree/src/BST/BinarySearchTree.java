package BST;

public class BinarySearchTree {
	
	private Node root;
	public BinarySearchTree () {
		root=null;
	}
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

//	public BinarySearchTree() {
//		super();
//		data=0;
//		this.left=null;
//		right=null;
//		root=null;
//	}


	public void add(int v) {
      
		Node nn=new Node(v);
        if(root==null) {
        root=nn;
        } else {
        Node temp=root;
        while(true) {
        	if(v<temp.getData()) {
        		if(temp.getLeft()!=null) {
        		temp.setLeft(temp);
        		}else {
        			temp.setLeft(nn);
        			break;
        		}
        	}
        	else {
        		if(temp.getRight()!=null) {
        			temp.setRight(temp);
        		}else {
        			temp.setRight(nn);
        			break;
        		}
        	}
          }
        }
       
	}
  public void preorder() {
	  preorder(root);
  }
	public void preorder(Node temp) {
	
		if(temp==null) 
		  return;
		System.out.print(" "+temp.getData()+",");	
		preorder(temp.getLeft());
		preorder(temp.getRight());
	}

	public void inorder() {
		// TODO Auto-generated method stub
		
	}

	public void postorder() {
		// TODO Auto-generated method stub
		
	}

}
