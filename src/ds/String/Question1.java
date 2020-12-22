package ds.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class Question1 {

	
	@Test
	public void example1() {
		String k = "eceba";
		method2(k);
	}
	
	@Test
	public void example2() {
		String k = "ccaabbb";
		method2(k);
	}
	
	
	public void method1(String k) {
		List<String> lst = new ArrayList<String>();
		for(int i = 0; i<k.length(); i++) {
			for(int j = i; j<k.length(); j++) {
				lst.add(k.substring(i, j+1));
			}
		}
		
		System.out.println(lst);
		int count = 0;
		for(String s : lst) {
			char[] charArray = s.toCharArray();
			Map<Character, Integer> map = new HashMap<>();
			for(Character a : charArray) {
				map.put(a, map.getOrDefault(a, 0)+1);
			}
			if(map.size()>2) {
				continue;
			}
			Iterator<Entry<Character, Integer>> iterator = map.entrySet().iterator();
			int temp = 0;
			while(iterator.hasNext()) {
				temp += iterator.next().getValue();
			}
			if(temp>count) {
				count = temp;
			}
		}
		System.out.println(count);
	}
	
	public void method2(String k) {
		Map<Character, Integer> map = new HashMap<>();
		List<String> lst = new ArrayList<String>();
		int i = 0;
		int j = 0;
		while(i<k.length()) {
			map.put(k.charAt(i), map.getOrDefault(k.charAt(i), 0)+1);
			if(map.size()<2) {
				lst.add(k.substring(i, j+1));
			}if(map.size()>2) {
				if(map.get(k.charAt(i)) == 1) {
					map.remove(map.get(k.charAt(i)));
				}else {
//					map.put(k.charAt(i),)
				}
			}
		
		}
		
	}
	
}
