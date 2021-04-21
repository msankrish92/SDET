package assignment0301;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GetLargestString {
	@Test
	public void example1() {
		String s = "aazzza";
		int k = 2;
		System.out.println(getLargestString(s, k));

	}

	@Test
	public void example2() {
		String s = "aazzzza";
		int k = 3;
		System.out.println(getLargestString(s, k));

	}

	@Test
	public void example3() {
		String s = "aazzzzaa";
		int k = 2;
		System.out.println(getLargestString(s, k));

	}

	private String getLargestString(String s, int k) {

		int charArr[] = new int[26];
		for(char a : s.toCharArray()) {
			charArr[a-'a']++;
		}
		List<Character> lst = new ArrayList<>();
		
		for(int i = 25; i>=0; i--) {
			if(charArr[i]>0) {
				lst.add((char)('a'+i));
			}
		}
		StringBuilder str = new StringBuilder();
		while(!lst.isEmpty()) {
			char curr = lst.get(0);
			int minCount = Math.min(k,charArr[curr-'a']);
			while(minCount>0) {
				str.append(curr);
				charArr[curr-'a']--;
				minCount--;
			}
			if(charArr[curr-'a'] !=0 && lst.size()>1) {
				str.append(lst.get(1));
				charArr[lst.get(1)-'a']--;
				if(charArr[lst.get(1)-'a'] == 0)
					lst.remove(lst.get(1));
			}else {
				lst.remove(0);
			}
		}
		
		return str.toString();
		
	}
}
