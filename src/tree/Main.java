package tree;

public class Main {

	public static void main(String[] args) {
		BST bst = new BST();
		bst.add(10);
		bst.add(9);
		bst.add(11);
		bst.add(8);
		bst.add(12);
		bst.add(7);
		
		System.out.println(bst);
		bst.preOrder();
//		System.out.println("inOrder");
//		bst.inOrder();
//		System.out.println("PostOrder");
//		bst.postOrder();
////		bst.removal(11);
//		System.out.println("preorder");
//		bst.preOrder();
//		System.out.println("inOrder");
//		bst.inOrder();
//		System.out.println("PostOrder");
//		bst.postOrder();
	}
	
}
