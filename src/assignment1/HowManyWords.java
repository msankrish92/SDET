package assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class HowManyWords {

	@Test
	public void example1() {
		String s = "jds dsaf lkdf kdsa fkldsf, adsbf ldka ads? asd bfdal ds bf[l. akf dhj ds 878 dwa WE DE 7475 dsfh ds RAMU 748 dj.";
		method1(s);
	}

	@Test
	public void example2() {
		String s = "he is a good programmer, he won 865 competitions, but sometimes he dont. What do you think? All test-cases should pass. Done-done?";
		method1(s);
	}

	@Test
	public void example3() {
		String s = "How many eggs are in a half-dozen, 13?";
		method1(s);
	}

	public void method1(String s) {
		StringBuilder str = new StringBuilder();
		List<String> words = new ArrayList<String>();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == '-' || s.charAt(i) == '[') {
				str.append(s.charAt(i));
			} else if (Character.isSpace(s.charAt(i)) && str.length() != 0) {
				if (!(str.toString().contains("["))) {
					words.add(str.toString());
				}
				str.setLength(0);

			} else if (i == s.length() - 1) {
				if (str.length() > 0)
					words.add(str.toString());
			}
		}

		System.out.println(words);
		System.out.println(words.size());
	}

}
