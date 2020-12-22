package ds.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Question2 {

	@Test
	public void example() {
		String target = "10111";
		System.out.println(minFlips(target));
	}
	
	/*
	 * public int minFlips(String target) { char[] input = target.toCharArray();
	 * char[] output = new char[input.length]; for (int i = 0; i < output.length;
	 * i++) { output[i] = '0'; } int count = 0; for(int i = 0; i<output.length;
	 * i++){ if(Arrays.toString(input).equals(Arrays.toString(output))){ break; }
	 * if(input[i] == output[i]){ continue; } if(input[i] == '1' && output[i] ==
	 * '0'){ for(int j = i; j<output.length; j++){ output[j] = '1'; } count++; }else
	 * if(input[i] == '0' && output[i] == '1'){ for(int j = i; j<output.length;
	 * j++){ output[j] = '0'; } count++; } } return count; }
	 */
	
	/*
	 * public int minFlips(String target) { char[] input = target.toCharArray();
	 * char[] output = new char[input.length]; for (int i = 0; i < output.length;
	 * i++) { output[i] = '0'; } int count = 0; for(int i = 0; i<output.length;
	 * i++){ if(Arrays.toString(input).equals(Arrays.toString(output))){ break; }
	 * if(input[i] != output[i]) { for(int j = 0; j<output.length; j++) { output[j]
	 * = input[i]; } count++; } } return count; }
	 */
//	10111
	  public int minFlips(String target) {
	        int max = 0;
	        List<Integer> out = new ArrayList<Integer>();

	        char bit = '0';
	        for(int i = 0; i < target.length(); i++) {
	            if(target.charAt(i) != bit) {
	                max++;
	                bit = target.charAt(i);
	            }
	        }
	        return max;
	    }
	
	
}
