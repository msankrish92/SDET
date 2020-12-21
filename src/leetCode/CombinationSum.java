package leetCode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CombinationSum {

	@Test
	public void example1() {
		int input[] = {2,3,6,7,4,1};
		int target = 7; 
		List<List<Integer>> out = new ArrayList<>();
		combinationSum(input, target, out, new ArrayList<>(), 0);
		System.out.println(out);
	}
	
	private void combinationSum(int input[], int target, List<List<Integer>> out, List<Integer> temp, int i) {
		if(target <= 0) {
			if(target == 0) {
				out.add(new ArrayList<>(temp));
			}
			return;
		}
		
		for (; i < input.length; i++) {
			temp.add(input[i]);
			combinationSum(input, target-input[i], out, temp,i);
			temp.remove(temp.size()-1);
		}
		
	}
	
	
}
