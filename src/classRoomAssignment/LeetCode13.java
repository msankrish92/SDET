package classRoomAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class LeetCode13 {
	
	/*
	 * Pseudo[Time Complexity O[n]]
	 * Store the corresponding integer values in map
	 * Declare a count variable
	 * Iterate over the string (i)
	 * if current value is lesser than next value && i < string.length()-1
	 * in temp variable store the value nextvalue - current value and add it to count
	 * and increment i
	 * else
	 * just add current value to count
	 * 
	 * return count;
	 */

	@Test
	public void example1() {
		String s = "MCMXCIV";
		System.out.println("method1 ->" + romanToInt(s));
		System.out.println("method2 ->" + method2(s));
	}
	
	@Test
	public void example2() {
		String s = "III";
		System.out.println("method1 ->" + romanToInt(s));
		System.out.println("method2 ->" + method2(s));
	}
	

	@Test
	public void example3() {
		String s = "DCIX";
		System.out.println("method1 ->" + romanToInt(s));
		System.out.println("method2 ->" + method2(s));
	}
	
	public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
   
        List<Integer> lst = new ArrayList<>();
        for(char a : s.toCharArray()){
            lst.add(map.get(a));
        }
        int count = 0;
        int i = 0;
        for( i = 0; i<lst.size()-1; i++){
            if(lst.get(i)<lst.get(i+1)){
                int temp = lst.get(i+1) - lst.get(i);
                lst.remove(i);
                lst.set(i,temp);
            }
            count += lst.get(i);
        }
        if(i!=lst.size()) {
        	count+=lst.get(lst.size()-1);
        }
        return count;
    }
	
	public int method2(String s) {
			Map<Character,Integer> map = new HashMap<Character, Integer>();
	        map.put('I',1);
	        map.put('V',5);
	        map.put('X',10);
	        map.put('L',50);
	        map.put('C',100);
	        map.put('D',500);
	        map.put('M',1000);
	        int count = 0;
	        int i = 0;
	        for (i = 0; i < s.length(); i++) {
				if(i<s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))) {
					int temp = map.get(s.charAt(i+1))-map.get(s.charAt(i));
					count += temp;
					i++;
				}else {
					count += map.get(s.charAt(i));
				}
			}
	        
	        return count;
	}
	
}
