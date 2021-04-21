package tree;

import java.util.Stack;

public class BST {


	class Node{
		int val;
		Node left;
		Node right;
		public Node(int val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	Node root = null;
	
	public void add(int val) {
		if(root==null) {
			root = new Node(val,null,null);
		}else {
			root = add(root,val);
		}
	}
	
	public Node add(Node root, int val) {
		if(root == null) {
			root = new Node(val, null, null);
		}
		if(root.val - val>0) {
			root.left = add(root.left,val);
		}else if(root.val - val<0) {
			root.right = add(root.right,val);
		}
		return root;
	}
	
	public void preOrder() {
		preOrder(root);
		System.out.println("Using Stack");
		preOrderUsingStack(root);
	}
	
	public void preOrder(Node node) {
		if(node==null) {
			return;
		}else {
			System.out.println(node.val);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	
	public void preOrderUsingStack(Node node) {
		Stack<Node> stack = new Stack<>();
		stack.push(node);
		while(!stack.isEmpty()) {
			Node temp = stack.pop();
			System.out.println(temp.val);
			if(temp.right!=null) {
				stack.push(temp.right);
			}
			if(temp.left!=null) {
				stack.push(temp.left);
			}
			
		}
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(Node node) {
		if(node==null) {
			return;
		}else {
			inOrder(node.left);
			System.out.println(node.val);
			inOrder(node.right);
		}
	}
	
	public void postOrder() {
		postOrder(root);
	}
	public void postOrder(Node node) {
		if(node==null) {
			return;
		}else {
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.val);
		}
	}
	
//	public void removal(int val) {
//		root = removal(root,val);
//	}
	
//	public Node removal(Node node, int val) {
//		if(node == null) {
//			return null;
//		}else if(node.right)
//		else if(node.val == val){
//			if(node.right == null) {
//				return node.left;
//			}else if(node.right == null) {
//				return node.right;
//			}
//		}
//		return node;
//	}
	
}
