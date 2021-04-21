package ds.arrays;

import java.util.Arrays;

public class ArrayMemory {

	public static void main(String[] args) {
		
		char input[][] = {{'1','2'},{'3','4'},{'5','6'}};
//		char output[][] = Arrays.copyOf(input, input.length);
		char output[][] = new char[input.length][];
		System.arraycopy(input, 0, output, 0, input.length);
		output[1][0] = '8';
		
		System.out.println(Arrays.deepToString(input));
		System.out.println(Arrays.deepToString(output));
	}
	
	
}
