package leetCode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LeetCode448 {

//	https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	
	@Test
	public void example() {
		int input[] = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(input));
	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        int input[] = new int[nums.length+1];
        
        for(int i = 0; i<nums.length; i++){
            input[nums[i]] = 1;
        }
        
        List<Integer> lst = new ArrayList<Integer>();
        
        for(int a = 1; a<input.length; a++){
            if(input[a]!=1) lst.add(a);
        }
        
        return lst;
    }
	
}
