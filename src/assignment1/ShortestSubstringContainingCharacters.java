package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class ShortestSubstringContainingCharacters {

	@Test
	public void example() {
		String s = "dabbcabcd";
		method1(s);
	}

	public void method1(String s) {
		Set<Character> st = new HashSet<Character>();
		List<String> lst = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			st.add(s.charAt(i));
		}
		StringBuilder str = new StringBuilder();
		Iterator itr = st.iterator();
		while (itr.hasNext()) {
			str.append(itr.next());
		}

		String temp = str.toString();

		int[] charArray = new int[256];
//		Arrays.fill(charArray, -1);

		for (int i = 0; i < temp.length(); i++) {
			charArray[temp.charAt(i)]++;
		}

		int i = 0;
		int j = 0;
		int count = 0;
		while (j < s.length()) {
			if (++charArray[s.charAt(j)] == 2) {
				count++;

			}
			while (count == temp.length()) {
				lst.add(s.substring(i, j + 1));

				if (--charArray[s.charAt(i)] == 1) {

					count--;
				}
				i++;
			}
			j++;
		}
		
		String max = Collections.min(lst,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});
		
		System.out.println(max);

	}
	
	

}
