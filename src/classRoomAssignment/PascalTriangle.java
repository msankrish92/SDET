package classRoomAssignment;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PascalTriangle {

	@Test
	public void example1() {
		int k = 5;
		System.out.println(method1(k));
	}
	
	@Test
	public void example2() {
		int k = 4;
		System.out.println(method1(k));
	}
	
		private List<Integer> method1(int k) {
			return recursiveFunction(k,new ArrayList<Integer>());
		}
		
		private List<Integer> recursiveFunction(int k, List<Integer> lst) {
			if(k==0) {
				lst.add(k);
				return lst;
			}
			
			List<Integer> out = recursiveFunction(k-1, lst);
			List<Integer> output = new ArrayList<Integer>();
			for (int i = 0; i <= out.size(); i++) {
				if(i == 0 || i == out.size()) {
					output.add(1);
				}else {
					output.add(out.get(i)+out.get(i-1));
				}
			}
			return output;
		}
		
		private void method2(int k) {
			recFun(k,2);
		}
		
		private int recFun(int column, int row) {
			if(column==1 || column == row) {
				return 1;
			}else {
				return recFun(column, row);
			}
		}
	
}
