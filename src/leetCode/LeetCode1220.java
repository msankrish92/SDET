package leetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class LeetCode1220 {

	@Test
	public void example1() {
		int n = 2;
		System.out.println(method2(n));
	}
	
	@Test
	public void example2() {
		int n = 3;
		System.out.println(method2(n));
	}

	@Test
	public void example3() {
		int n = 144;
		System.out.println(method2(n));
	}
	
	List<String> lst;

//	public List<String> method1(String input[], int n) {
//		lst = new ArrayList<>(Arrays.asList(input));
//		if(n == 1) return lst;
//		for (int i = 1; i < n; i++) {
//			lst = permutation(input,lst);
//		}
//		return lst;
//	}
//
//	public List<String> permutation(String input[],List<String> lst) {
//		List<String> inMethodList = new ArrayList<String>();
//		for(int i = 0; i<lst.size(); i++) {
//			for(int j = 0; j<input.length; j++) {
//				if(lst.get(i).charAt(lst.get(i).length()-1) == 'a') {
//					if(input[j].equals("e")) {
//						inMethodList.add(lst.get(i) + input[j]);
//					}else {
//						continue;
//					}
//				}else if(lst.get(i).charAt(lst.get(i).length()-1) == 'e') {
//					if(input[j].equals("a") || input[j].equals("i")) {
//						inMethodList.add(lst.get(i) + input[j]);
//					}else {
//						continue;
//					}
//				}else if(lst.get(i).charAt(lst.get(i).length()-1) == 'i') {
//					if(!input[j].equals("i")) {
//						inMethodList.add(lst.get(i) + input[j]);
//					}else {
//						continue;
//					}
//				}else if(lst.get(i).charAt(lst.get(i).length()-1) == 'o') {
//					if(input[j].equals("i") || input[j].equals("u")) {
//						inMethodList.add(lst.get(i) + input[j]);
//					}else {
//						continue;
//					}
//				}else if(lst.get(i).charAt(lst.get(i).length()-1) == 'u') {
//					if(input[j].equals("a")) {
//						inMethodList.add(lst.get(i) + input[j]);
//					}else {
//						continue;
//					}
//				}
//				
//			}
//		}
//		return inMethodList;
//	}
	
	public int method2(int n) {
		if(n == 1) return 5;
		Map<Character,Long> map = new HashMap<>();
		map.put('a', 1L);
		map.put('e', 1L);
		map.put('i', 1L);
		map.put('o', 1L);
		map.put('u', 1L);
		
		for(int i = 1; i<n; i++) {
			Map<Character,Long> tempMap = new HashMap<>();
			Iterator<Character> it = map.keySet().iterator();
			while(it.hasNext()) {
				char key = it.next();
				if(key == 'a') {
					tempMap.put('e', tempMap.getOrDefault('e', 0L)+(map.get('a')%1000000007));
				}else if(key == 'e') {
					tempMap.put('a', tempMap.getOrDefault('a', 0L)+(map.get('e')%1000000007));
					tempMap.put('i', tempMap.getOrDefault('i', 0L)+(map.get('e')%1000000007));

				}else if(key == 'i') {
					tempMap.put('a', tempMap.getOrDefault('a', 0L)+(map.get('i')%1000000007));
					tempMap.put('e', tempMap.getOrDefault('e', 0L)+(map.get('i')%1000000007));
					tempMap.put('o', tempMap.getOrDefault('o', 0L)+(map.get('i')%1000000007));
					tempMap.put('u', tempMap.getOrDefault('u', 0L)+(map.get('i')%1000000007));

				}else if(key == 'o') {
					tempMap.put('i', tempMap.getOrDefault('i', 0L)+(map.get('o')%1000000007));
					tempMap.put('u', tempMap.getOrDefault('u', 0L)+(map.get('o')%1000000007));

				}else if(key == 'u') {
					tempMap.put('a', tempMap.getOrDefault('a', 0L)+(map.get('u')%1000000007));
				}
				
			}
			map = new HashMap<>(tempMap);
		}

		long sum = (map.values().stream().reduce(0L,(a,b) -> a+b))%1000000007;

			
		return (int)sum;
	
	}
	

}

















