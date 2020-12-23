package leetCode;

import org.junit.Test;

public class LeetCode605 {

//	https://leetcode.com/problems/can-place-flowers/

	@Test
	public void example1() {
		int flowerbed[] = { 1, 0, 0, 0, 1 };
		int n = 1;
		System.out.println(solution1(flowerbed, n));
	}

	private boolean solution1(int arr[], int n) {
		  
	       int counter = 0;
	        if (n == 0) {
				return true;
			}
	        if (arr.length == 1) {
				if (arr[0] == 1)
					return false;
				if (arr[0] == 0)
					return true;
			}
	        int i = 0;
			while (i < arr.length) {
				if (i == 0 && arr[i] == 0 && arr[i + 1] == 0) {
					arr[i] = 1;
					counter++;
				} else if (i == arr.length - 1 && arr[i] == 0 && arr[i - 1] == 0) {
					arr[i] = 1;
					counter++;
				} else if (i!=0 && i!=arr.length-1 && arr[i - 1] == 0 && arr[i + 1] == 0 && arr[i] == 0) {
					arr[i] = 1;
					counter++;
				}
	            i++;
	            if(counter==n){
	                return true;
	            }
			}
			
			return false;
	}

	private boolean solution2(int flowerbed[], int n) {
		if (n == 0) {
			return true;
		}
		int counter = 0;
		int length = flowerbed.length;
		if (length == 1) {
			if (flowerbed[0] == 1)
				return false;
			if (flowerbed[0] == 0)
				return true;
		}

		if (flowerbed[0] == 0 && flowerbed[1] == 0) {
			flowerbed[0] = 1;
			counter++;
		}
		if (flowerbed[length - 1] == 0 && flowerbed[length - 2] == 0) {
			flowerbed[length - 1] = 1;
			counter++;
		}

		for (int i = 1; i < length - 1; i++) {
			if (flowerbed[i] == 0 && counter <= n) {
				if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
					counter++;
					flowerbed[i] = 1;
				}
			}
		}
		if (counter < n)
			return false;
		else
			return true;

	}
	private boolean solution3(int flowerbed[], int n) {
        for(int i=0; i<flowerbed.length; i++) {
            int prev = i==0 ? 0 : flowerbed[i-1];
            int next = flowerbed.length-1==i ? 0 : flowerbed[i+1];
            if(prev==0 && flowerbed[i]==0 && next==0) {
                flowerbed[i++]=1;
                n--;
            }
            if(n<=0) return true;
        }
        return false;

	}
}
