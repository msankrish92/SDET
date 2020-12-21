package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class TheLargestString {

//	@Test
//	public void example1() {
//		String s = "cbaaa";
//		int k = 2;
//		method1(s, k);
//	}
	
//	@Test
//	public void example2() {
//		String s = "zzzzb";
//		int k = 2;
//		method1(s, k);
//	}
	
	@Test
	public void example3() {
		String s = "zuvypzuvyz";
		int k = 2;
		method1(s, k);
	}
//	
//	@Test
//	public void example4() {
//		String s = "zzzzzzxxxzzaabbazza";
//		int k = 5;
//		method1(s, k);
//	}
//	
//	@Test
//	public void example5() {
//		String s = "Xzzzzzzzz";
//		int k = 4;
//		method1(s, k);
//	}
//	@Test
//	public void example6() {
//		String s = "cbcbac";
//		int k = 2;
//		method1(s, k);
//	}

	public void method1(String s, int k) {
		StringBuilder str = new StringBuilder();
		Set<Character> ch = new HashSet<Character>();
		Map<Character, Integer> chMap = new HashMap<>();
		int charArr[] = new int[256];

		for (int i = 0; i < s.length(); i++) {
			charArr[s.charAt(i)]++;
		}

		for (int i = 0; i < s.length(); i++) {
			chMap.put(s.charAt(i), chMap.getOrDefault(s.charAt(i), 0) + 1);
		}

		Set<Entry<Character, Integer>> entrySet = chMap.entrySet();
		List<Entry<Character, Integer>> list = new ArrayList<>(entrySet);
		Collections.sort(list, new Comparator<Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {

				return o2.getValue().compareTo(o1.getValue());
			}
		});
		Collections.sort(list, new Comparator<Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {

				return o2.getKey().compareTo(o1.getKey());
			}
		});
		
		StringBuilder uniqueString = new StringBuilder();
		list.forEach(a -> {
			uniqueString.append(a.getKey());
//			System.out.println(a.getKey() + "->" + a.getValue());

		});
		System.out.println(uniqueString.toString());
		for (int i = 0; i < s.length(); i++) {
			ch.add(s.charAt(i));
		}

//		System.out.println(uniqueString);

		int j = 0;
		while (j < ch.size()) {
			for (int i = 0; i < uniqueString.length(); i++) {
				if (charArr[uniqueString.charAt(i)] == 0) {
					j++;
				} else {
					if (charArr[uniqueString.charAt(i)] >= k) {
						for (int l = 0; l < k; l++) {
							str.append(uniqueString.substring(i, i + 1));
							charArr[uniqueString.charAt(i)]--;
						}

					} else {
						str.append(uniqueString.substring(i, i + 1));
						charArr[uniqueString.charAt(i)]--;

					}
				}
			}
		}
		

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int l = i; l < i + k + 1 && i + k + 1 <= str.length(); l++) {
				if (str.charAt(i) == str.charAt(l)) {
					count++;
					if (count == k + 1) {
						str.deleteCharAt(l);
					}
				}

			}
		}
		System.out.println(str.toString());
	}

}
