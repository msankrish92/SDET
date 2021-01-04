package search;

import org.junit.Test;

public class SquareRoot {

	@Test
	public void example1() {
		double input = 5;
		System.out.println(method2(input));
	}
	
	@Test
	public void example2() {
		double input = 25;
		System.out.println(method2(input));
	}
	
	public int method1(int input) {
		int low = 2;
		int high = input/2;
		while(low<=high) {
			int mid = (low+high)/2;
			if((mid*mid) == input) return mid;
			else if(mid * mid > input) high = mid-1;
			else low = mid + 1; 
		}
		
		return -1;
	}
	
	private double method2(double input) {
		if(input == 1) return 1;
        double low = 2, high = input/2;
        while(low<=high) {
            double mid = (low+high)/2;
            double midValue =Math.round(mid*mid* 100.0) / 100.0;
            if(midValue == input) return Math.round(mid* 100.0) / 100.0;
            else if(midValue < input) low = mid;
            else high=mid;
        }
        return -1;
    }
	
	
}
