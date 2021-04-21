package leetCode;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

public class LintCode892 {

	@Test
	public void example1() {
		String input[] = { "wrt", "wrf", "er", "ett", "rfttrftz" };
		method1(input);
	}

	private void method1(String input[]) {
		int n = 0;
		for (int i = 0; i < input.length; i++) {
			if (n < input[i].length()) {
				n = input[i].length();
			}
		}
		Set<Character> st = new LinkedHashSet<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[j].length() > i) {
					st.add(input[j].charAt(i));
				}
			}

		}
		StringBuilder out = new StringBuilder();
		st.stream().forEach(a -> out.append(a));
		System.out.println(out.toString());

	}

}
