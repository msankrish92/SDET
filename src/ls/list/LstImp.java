package ls.list;

public class LstImp {

	public class Node {
		int val;
		Node next;
		public Node(int val,Node next) {
			this.val = val;
			this.next = next;
		}
	}
	Node root = null;
	public void add(int val) {
		root = add(root,val);
	}
	
	public Node add(Node node, int val) {
		if(node == null) {
			node = new Node(val,null);
			return node;
		}
		node.next = add(node.next,val);
		return node;
	}
	
	public void remove(int val) {
		root = remove(root,val);
	}
	
	public Node remove(Node node, int val) {
		
		if(node.val == val) {
			node = node.next;
			return node;
		}else {
			node.next = remove(node.next,val);
		}
		return node;
	}
	
//	public void remove(Node node, int val) {
//		Node temp = find(node,val);
//		temp = node.next;
//	}
	
	
}
