package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;



public class LeetCode30 {

	@Test
	public void example1() {
		String input = "barfoothefoobarman";
		String words[] = { "foo", "bar" };
		method1(input, words);
	}

	@Test
	public void example2() {
		String input = "wordgoodgoodgoodbestword";
		String words[] = { "word", "good", "best", "word" };
		method1(input, words);
	}

	@Test
	public void example3() {
		String input = "barfoofoobarthefoobarman";
		String words[] = { "bar", "foo", "the" };
		method1(input, words);
	}

	@Test
	public void example4() {
		String input = "wordgoodgoodgoodbestword";
		String words[] = { "word", "good", "best", "good" };
		method1(input, words);
	}

	@Test
	public void example5() {
		String input = "aaaaaaaaaaaaaa";
		String words[] = { "aa", "aa" };
		method1(input, words);
	}
	
	@Test
	public void example6() {
		String input = "ababaab";
		String words[] = { "ab","ba","ba" };
		method1(input, words);
	}
	
	@Test
	public void example7() {
		String input = "ababababab";
		String words[] = { "ababa","babab" };
		method1(input, words);
	}
	@Test
	public void example8() {
		String input = "abababab";
		String words[] = { "ab","ba" };
		method1(input, words);
	}

	public void method1(String input, String words[]) {
		List<Integer> out = new ArrayList<>();
		List<Integer> index = new ArrayList<>();
		int length = words[0].length();
		for (int i = 0; i < words.length; i++) {
			int j = 0;
			while (j < input.length()) {
				int ind = input.indexOf(words[i], j);
				if (ind != -1) {
					if (!index.contains(ind))
						index.add(ind);
				}
				j++;
			}
		}

		for (int i = 0; i < index.size(); i++) {
			if ((index.get(i) + (words[0].length() * words.length)) <= input.length()) {
				StringBuilder temp = new StringBuilder(
						input.substring(index.get(i), index.get(i) + (words[0].length() * words.length)));
				List<String> lst = new ArrayList<>(Arrays.asList(words));
				for (int j = 0; j < lst.size(); j++) {
					boolean flag = false;
					for (int j2 = 0; j2 <= temp.length()-length; j2=j2+length) {
						String com = temp.substring(j2,j2+length);
						if(com.equals(lst.get(j))) {
							temp.delete(j2, j2+length);
							lst.remove(lst.get(j));
							j--;
							flag = true;
							break;
						}
					}
					if(!flag) {
						break;
					}
				}
				if (temp.length() == 0) {
					out.add(index.get(i));
				}
			}
		}
		System.out.println(out);

	}

}
