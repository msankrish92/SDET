package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class LeetCode17 {

	//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
	
	@Test
	public void example1() {
		String input = "234";
		System.out.println(letterCombinations(input));
	}
	
	@Test
	public void example2() {
		String input = "789";
		System.out.println(letterCombinations(input));
	}
	
	public List<String> letterCombinations(String input) {
        if(input.length() == 0){
            return new ArrayList<String>();
        }
       Map<Character, String> map = new HashMap<>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		List<String> lst = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			lst.add(map.get(input.charAt(i)));
		}
		System.out.println(lst);
		return recursiveFunction(lst, 0, new ArrayList<String>());
    }
    StringBuilder str = new StringBuilder();
    private List<String> recursiveFunction(List<String> lst, int start, List<String> out) {

		if (start == lst.size()) {
			out.add(str.toString());
		} else {
			for (int i = 0; i < lst.get(start).length(); i++) {
				str.append(lst.get(start).charAt(i));
				recursiveFunction(lst, start + 1, out);
				str.deleteCharAt(str.length()-1);
			}
		}
		return out;
	}
	
}
