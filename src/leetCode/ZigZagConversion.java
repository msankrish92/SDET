package leetCode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
	public static void main(String[] args) {

		List<StringBuilder> str = new ArrayList<>();
//		String s = "ABCD";
//		int numRows = 3;
		
//		boolean goingDown =false;
//		int currentRow = 0;
//		
//		for(int i = 0; i<Math.min(numRows, s.length()); i++) {
//			str.add(new StringBuilder());
//		}
//		
//		for(int i = 0; i<s.length(); i++) {
//			str.get(currentRow).append(s.charAt(i));
//			if(currentRow == 0 || currentRow == numRows-1) {
//				goingDown = !goingDown;
//			}
//			currentRow = currentRow +  (goingDown?1:-1);
//		}
		
//		 if (numRows == 1) return s;
		String s = "PAYPALISHIRING";
		int numRows = 4;
	        StringBuilder ret = new StringBuilder();
	        int n = s.length();
	        int cycleLen = 2 * numRows - 2; //6

	        
	        for (int i = 0; i < numRows; i++) {
	            for (int j = 0; j + i < n; j += cycleLen) {
	                ret.append(s.charAt(j + i));
	                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
	                    ret.append(s.charAt(j + cycleLen - i));
	            }
	        }
		
		
		
		System.out.println(ret.toString().replaceAll("\\W", ""));

	}
}
