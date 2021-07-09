package leetCode;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class LeetCode89 {

	@Test
	public void example1() {
		System.out.println(method1(3));
	}
	
	
	public List<Integer> method1(int n){
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(0);
		for(int i = 0; i < n; i++) {
			int pow = (int) Math.pow(2, i);
			for(int j = lst.size()-1; j >= 0; j--) {
				lst.add(pow + lst.get(j));
			}
		}
		
		return lst;
	}
	
}
