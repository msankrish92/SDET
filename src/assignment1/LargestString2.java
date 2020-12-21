package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class LargestString2 {
//	
//	@Test
//	public void example1() {
//		String s = "zxzuvozyzvzywvxyqxzxzyywyxwyzxxwzwzyzzzzyxzvzxxywx";
//		int k = 4; 
//		method1(s,k);
//	}

//	@Test
//	public void example2() {
//		String s = "azzzzz";
//		int k = 2;
//		method1(s, k);
//	}
	
	@Test
	public void example2() {
		String s = "yuzzvuyzpv";
		int k = 1;
		method1(s, k);
	}
//	@Test
//	public void example3() {
//		String s = "xxzzax";
//		int k = 2; 
//		method1(s,k);
//	}
//	@Test
//	public void example4() {
//		String s = "zzyzzzzzzzzwzzzzzyzzzzzzzyzyzzzzzyzzzzzzzzzzyzzzzzzzyzzzzzzzzzzzzzzzzzzzzzzzzzyzzzzzyzzzzzyzzzzzyzzzzzzyzzyzzzzyzzzzzzzzzzzzyyzxyzzzzyzzzzzzzwzzzzzzyzzzzzzzzzzyzzzzzzzzzzzzyzzyzzzzzzzzyyzzzzzzzzzyzzzzzzzyzyzzzzzzzzzzyzzzzzyzzyzzzzzzzzzyzyzzzzzzzzzzyzzzzzzzzzzzyzyzzzzzzzyyyzzzzzzzyzzyzzzzzyzzzzzzzzzzzyzzzzzzzzzzzzzzzzyzzzyzzzzzzzzzzzzxzzzzzzzzzzzzzzzzzzzzzzzzzzzyzyzyyxzzzzzzzzzzyyzzzzzzyyyzzzzzzzzzzzzzzzzzzzzzzyzzzzzzzzzzzzzzyzzzzzzzzzzzzzzzzzzzzzzzzyxzyzzzzzzzzzzzzzzwyzzzzyzzzzzzyzzzzzyzzzyzzzzzyzzzzzyzzzzzzzzzzyzyzzzzyzzzzzzzzzzzyzzzwzzzyyzzzzzzzzzzzzzzzzzzzyzzzzzzzzzzzzzyzzzzzzzzzzzzzzzzyyzzzzzzyyzzzzzyyzzzzyzzzzzzyzzzzxzzxzyzzzzzzzzzzxzzzyzzzzzzzzzzzzzzzyzyzzzzzzzzyzzzyzzzzzyzzyzzzzzzzzzzzzzyzzzzzxzzzzzzzyzyzzyzzzzyzzzzzzzzzzzzzzzyzzzzzyzzzzzzzxzzzzzzzzzzzzzzzzzzzzzzzzzzzzyzzyxzzzzzzzzzzyzzzzzyzyzzzyzyzzzyzyzzzzzzzzzyzzzxzzzyzzzzzzzyzzzzzxzzzzzxzzzzzzzyzzyzzzzzzzzzzzzzzyzzzzzyxzzzzzzzzzzzzzzzzyzyzxzyzzzzzzzzzzzzzzyzzzzzzyzzyzzzzyzzzxyzzzzzzzzyzzzzzzzzzzzzzzzzzzzyyzzzzzzzyzzzzzzzzzzz";
//		int k = 17; 
//		method1(s,k);
//	}

	public void method1(String s, int k) {
		int[] charArr = new int[256];
		StringBuilder temp = new StringBuilder();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}

		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		List<Entry<Character, Integer>> list = new ArrayList<>(entrySet);

		Collections.sort(list, new Comparator<Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {

				return o2.getKey().compareTo(o1.getKey());
			}
		});

		list.forEach(a -> temp.append(a.getKey()));
		String uniqueString = temp.toString();

		for (int i = 0; i < s.length(); i++) {
			charArr[s.charAt(i)]++;
		}
		System.out.println(list);
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int length = s.length();
		int used = 1;
		for (int i = 0; i < uniqueString.length(); i++) {
			int k1 = i;
			int added = 0;
			
			for (int j = charArr[uniqueString.charAt(k1)]; j > 0; j--) {
				
				if(used<length-1 ) {
				sb.append(uniqueString.charAt(k1));
				count++;
				charArr[uniqueString.charAt(k1)]--;
				used++;
				}

				if (i + 1 < uniqueString.length() && charArr[uniqueString.charAt(i + 1)] == 0) {
					i++;
				}

				if (i + 1 < uniqueString.length() && count == k) {

					sb.append(uniqueString.charAt(i + 1));
					charArr[uniqueString.charAt(i + 1)]--;
					added++;

				}
				if (j == 1) {
					count = added;
				} else if (count == k) {
					count = 0;
					added = 0;
				}

			}
		}

		System.out.println(sb.toString());

	}

}
