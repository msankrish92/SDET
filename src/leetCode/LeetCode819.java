package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class LeetCode819 {

	// Pseudo
	// Convert the paragraph into a list of string
	// Loop through and remove all the banned words
	// And get the occurance of the words

	@Test
	public void example1() {
		String paragraph = "Bob ball, the hit BALL flew far after it was hit.";
		String[] banned = { "hit" };
//		System.out.println(commonWord(paragraph, banned));
		commonWord3(paragraph, banned);
	}

	

//	@Test
	public void example2() {
		String paragraph = "a.";
		String[] banned = {  };
//		System.out.println(commonWord(paragraph, banned));
		commonWord2(paragraph, banned);
	}
	
//	@Test
	public void example3() {
		String paragraph = "bob";
		String[] banned = {  };
//		System.out.println(commonWord(paragraph, banned));
		commonWord2(paragraph, banned);
	}
	private void commonWord(String paragraph, String banned[]) {

		String[] par = paragraph.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase().split("\\s+");

		List<String> bannedList = new ArrayList<>(Arrays.asList(banned));
		Map<String, Integer> map = new HashMap<>();
		int max = 0;
		for (int i = 0; i < par.length; i++) {
			if (bannedList.contains(par[i])) {
				continue;
			} else {
				map.put(par[i], map.getOrDefault(par[i], 0) + 1);
				max = Math.max(map.get(par[i]), max);
			}
		}
		System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey());
	}

//	iterate over the paragraph
//	create a stringBuilder
//	if it is character or number add it to the string
//	if it is a space add it map along with count
//	create a max Variable and out string

	private void commonWord2(String paragraph, String banned[]) {
		StringBuilder str = new StringBuilder();
		int max = 0;
		String out = "";
		Set<String> bannedWord = new HashSet<String>();
		Map<String, Integer> map = new HashMap<>();
		for (String word : banned)
			bannedWord.add(word);
		for (int i = 0; i < paragraph.length(); i++) {
			if (Character.isAlphabetic(paragraph.charAt(i)) || Character.isDigit(paragraph.charAt(i))) {
				str.append(paragraph.charAt(i));
			}else if(bannedWord.contains(str.toString().toLowerCase())) {
				str.setLength(0);
			}
			if ((Character.isSpace(paragraph.charAt(i)) || paragraph.charAt(i) == '!'
					|| paragraph.charAt(i) == '?' || paragraph.charAt(i) == '\'' || paragraph.charAt(i) == ','
					|| paragraph.charAt(i) == ';' || paragraph.charAt(i) == '.' || i == paragraph.length()-1) &&  str.length() != 0) {
				map.put(str.toString().toLowerCase(), map.getOrDefault(str.toString().toLowerCase(), 0) + 1);
				if (max <= map.get(str.toString().toLowerCase())) {
					max = map.get(str.toString().toLowerCase());
					out = str.toString().toLowerCase();
				}
				str.setLength(0);
			}

		}

		System.out.println(out);

	}
	
	private void commonWord3(String paragraph, String banned[]) {
		  Set<String> bannedWords = new HashSet();
	        for (String word : banned)
	            bannedWords.add(word);

	        String ans = "";
	        int maxCount = 0;
	        Map<String, Integer> wordCount = new HashMap();
	        StringBuilder wordBuffer = new StringBuilder();
	        char[] chars = paragraph.toCharArray();

	        for (int p = 0; p < chars.length; ++p) {
	            char currChar = chars[p];

	            // 1). consume the characters in a word
	            if (Character.isLetter(currChar)) {
	                wordBuffer.append(Character.toLowerCase(currChar));
	                if (p != chars.length - 1)
	                    // skip the rest of the processing
	                    continue;
	            }

	            // 2). at the end of one word or at the end of paragraph
	            if (wordBuffer.length() > 0) {
	                String word = wordBuffer.toString();
	                // identify the maximum count while updating the wordCount table.
	                if (!bannedWords.contains(word)) {
	                    int newCount = wordCount.getOrDefault(word, 0) + 1;
	                    wordCount.put(word, newCount);
	                    if (newCount > maxCount) {
	                        ans = word;
	                        maxCount = newCount;
	                    }
	                }
	                // reset the buffer for the next word
	                wordBuffer = new StringBuilder();
	            }
	        }
	        System.out.println(ans);

	}

}
