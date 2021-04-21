package ds.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class Question3 {

	
	@Test
	public void example1() {
		String k = "Today is a beatiful day";
		method1(k);
	}
	// Stop and share again
	
	// Mutable and immutable 
	// Can I execute in eclipse? Run them first and show the result 
	// This method to reverse the entire String by character and then
	// revese the word alone
	public void method1(String k) {
		String reverseString = reverseString1(k);
		String[] split = reverseString.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < split.length; i++) {
			sb.append(reverseString1(split[i]+" "));
		}
		System.out.println(sb.toString().trim());
		
	}
	// this is to reverse the entire String
	public String reverseString(String s) {
		char[] charArray = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = charArray.length-1; i >=0 ; i--) {
			sb.append(charArray[i]);
		}
		return sb.toString();
	}
	
	public String reverseString1(String s) {
		char[] charArray = s.toCharArray();
		int left=0, right = charArray.length-1;
		while (left < right) {
	        char tmp = charArray[left];
	        charArray[left++] = charArray[right];
	        charArray[right--] = tmp;
	    }
	    return new String(charArray);
	}
	
}








