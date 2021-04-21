package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LeetCode698Sub {

	
	/*pseudo
	 * target is given 5
	 * No of subSets given 4
	 */
	
	@Test
	public void example1() {
		Integer arr[] = {1,2,2,3,3,4,5};
//		List<Integer> lst = new ArrayList<Integer>(Arrays.asList(arr));
		method1(new ArrayList<>(Arrays.asList(arr)), 4, 5, 0);
	}
	
	private void method1(List<Integer> lst, int subSetCount, int target, int sum) {
		if(sum>=target) {
			return;
		}
		if(subSetCount == 0 && lst.isEmpty()) {
			return;
		}
		
		for (int i = 0; i < lst.size(); i++) {
			sum += lst.get(i);
			lst.remove(i);
			if(sum == target) 
				subSetCount--;
			method1(lst, subSetCount, target, sum);
			sum -= lst.get(i);
		}
		
	}
	
}
