package leetCode;

import org.junit.Test;

public class LeetCode21 {
	
	/*
	 * Pseudo
	 * Implemented merge sort logic
	 * In Singly Linked list element are added to the front
	 * Two construtor 
	 * ListNode(int val) -> will add value to current node
	 * ListNode<int val, ListNode next) -> will create a node and add value and next node -> This helps in
	 * adding values element in the front
	 */
	
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	@Test
	public void example1() {
//		l1 = [1,2,4]
//		l2 = [1,3,4]
//		Output = [1,1,2,3,4,4]
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode out = null;
		ListNode output = null;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				if (out == null) {
					out = new ListNode(l1.val);
				} else {
					out = new ListNode(l1.val, out);
				}
				l1 = l1.next;
			} else if (l1.val > l2.val) {
				if (out == null) {
					out = new ListNode(l2.val);
				} else {
					out = new ListNode(l2.val, out);
				}
				l2 = l2.next;
			} else {
				if (out == null) {
					out = new ListNode(l1.val);
					out = new ListNode(l2.val, out);
				} else {
					out = new ListNode(l1.val, out);
					out = new ListNode(l2.val, out);
				}
				l1 = l1.next;
				l2 = l2.next;
			}
		}

		while (l1 != null) {
			out = new ListNode(l1.val, out);
			l1 = l1.next;
		}

		while (l2 != null) {
			out = new ListNode(l2.val, out);
			l2 = l2.next;
		}

		while (out != null) {
			if (output == null) {
				output = new ListNode(out.val);
			} else {
				// ListNode temp =
				output = new ListNode(out.val, output);
			}
			out = out.next;
		}
		return output;
	}

}

