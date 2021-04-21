package revision;

import org.junit.Test;

public class ReversetheString {

	@Test
	public void example1() {
		String input = "invest time on yourself";
		method1(input);
	}
	
	@Test
	public void example2() {
		String input = "I have completed using the stringBuilder insert method";
		method1(input);
	}

	private void method1(String input) {
		String[] inArr = input.split(" ");
		int start = 0;
		int end = inArr.length - 1;
		StringBuilder str = new StringBuilder(0);
		int left = 0;
		while (start < end) {
//			if (str.length() == 0) {
//				str.append(inArr[end]);
//				left = str.length();
//				str.append(inArr[start]);
//			} else {
				str.insert(left, inArr[end]);
				str.insert(left + inArr[end].length(), inArr[start]);
				left = left + inArr[end].length();
//			}
			start++;
			end--;
		}
		System.out.println(str.toString());
	}
	
//	Stack<Integer> s1 = new Stack<>();
//    Stack<Integer> s2 = new Stack<>();
//    ArrayDeque<Integer> queue = new ArrayDeque<>();
//    
//    int len = nums.length/2 , i = len-1 , j = nums.length -1;
//    
//    while(i >= 0) s1.push(nums[i--]);
//    
//    while(j >= len) s2.push(nums[j--]);
//            
//    for(int k = 0; k< len;k++) {
//        queue.offer(s1.pop());
//        queue.offer(s2.pop());
//    }
//    
//    System.out.println(queue);

}
