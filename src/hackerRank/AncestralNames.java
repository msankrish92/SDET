package hackerRank;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class AncestralNames {
	
	@Test
	public void example() {
		String names[] = {"Steven XL", "Steven XVI", "David IX", "Mary XV", "Masy XIII", "Mary XX"};
		method1(names);
	}
	
	public void method1(String names[]) {
		Map<String,String> map = new TreeMap<String,String>();
		for (int i = 0; i < names.length; i++) {
			String split[] = names[i].split(" ");
			int age = romanToInt(split[1]);
			map.put(names[i], split[0] + " " + age);
		}
	}
	 
	
	public int romanToInt(String roman) {
	
		Map<Character,Integer> map = new HashMap<Character,Integer>();	
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L', 50);
		int out  = map.get(roman.charAt(0));
		for (int i = 1; i < roman.length(); i++) {
			if(map.get(roman.charAt(i))<map.get(roman.charAt(i-1))) {
				out += map.get(roman.charAt(i));
			}else {
				out -= map.get(roman.charAt(i));
			}
		}
		return out;
	}
}
