package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Permutation {

	@Test
	public void example1() {
		String input = "abc";
		method1(input);

	}

	List<String> lst = new ArrayList<String>();

	public void method1(String input) {
		perum(0, input);
		System.out.println(lst);
	}

	private void perum(int start, String input) {
		if (start >= input.length()) {
			lst.add(input);
			return;
		}
		for (int i = start; i < input.length(); i++) {
			input = swap(start, i, input);
			perum(start + 1, input);
			input = swap(start, i, input);
		}
	}

	public String swap(int i, int j, String input) {
		char[] ch = input.toCharArray();
		char a = ch[i];
		ch[i] = ch[j];
		ch[j] = a;
		StringBuilder str = new StringBuilder();
		for (int k = 0; k < ch.length; k++) {
			str.append(ch[k]);
		}
		return str.toString();

	}

}
