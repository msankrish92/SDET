package leetCode;

import java.util.Arrays;

import org.junit.Test;

public class LeetCode27 {
	
	@Test
	public void example1() {
		int inp[] = {0,1,2,2,3,0,4,2};
		int val = 2;
		removeElement(inp, val);
	}
	
	@Test
	public void example2() {
		int inp[] = {3,2,2,3};
		int val = 3;
		removeElement(inp, val);
	}
	
	public int removeElement(int[] inp, int val) {
        int i = 0;
		int j = 0;
		int count = 0;
		while(j<inp.length) {
			if(inp[i] != val && inp[j] != val) {
				i++;
				j++;
			}else if(inp[i] == val && inp[j] != val){
				int temp = inp[i];
				inp[i] = inp[j];
				inp[j] = temp;
				i++;
			}else if(inp[j] == val) {
				j++;
			}else if(inp[i] == val) {
				j++;
			}
		}
		for(int a : inp) {
			if(a != val) count++;
		}
		 System.out.println(Arrays.toString(inp));
		 System.out.println(count);
        return count;
    }

}
