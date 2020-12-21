package ds.tree;

import java.util.Iterator;

public class Main {
	
	public static void main(String[] args) {
		BinarySearchTree<Integer> tr = new BinarySearchTree<Integer>();
		tr.add(10);
		tr.add(6);
		tr.add(16);
		tr.add(4);
		tr.add(8);
		tr.add(14);
		tr.add(18);
		tr.add(3);
		tr.add(5);
		tr.add(7);
		tr.add(9);
		tr.add(13);
		tr.add(15);
		tr.add(17);
		tr.add(20);
		
		Iterator<Integer> traverse = tr.traverse(TreeTraversalOrder.POST_ORDER);
		while(traverse.hasNext()) {
			System.out.println(traverse.next());
		}
		
		/*
		 * tr.remove(30); Iterator<Integer> traverse1 =
		 * tr.traverse(TreeTraversalOrder.IN_ORDER);
		 * 
		 * while(traverse1.hasNext()) { System.out.println(traverse1.next()); }
		 */
		
	}

}
