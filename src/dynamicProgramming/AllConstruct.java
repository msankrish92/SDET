package dynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class AllConstruct {

	@Test
	public void example1() {
		String target = "abcdef";
		String wordBank[] = { "ab", "abc", "cd", "def", "abcd", "ef", "c" };
		ac(target, wordBank, new ArrayList<String>(), new HashMap<String, List<String>>());
		System.out.println(out);
	}

	@Test
	public void example2() {
		String target = "skateboard";
		String wordBank[] = { "bo", "rd", "ate", "t", "ska", "sk", "boar" };
		ac(target, wordBank, new ArrayList<String>(), new HashMap<String, List<String>>());
		System.out.println(out);
	}

	@Test
	public void example3() {
		String target = "enterpotentpot";
		String wordBank[] = { "a", "p", "ent", "enter", "ot", "o", "t" };
		ac(target, wordBank, new ArrayList<String>(), new HashMap<String, List<String>>());
		System.out.println(out);
	}

	@Test
	public void example4() {
		String target = "eeeeeeeeeeeeeeeeeeeeeeeeeee";
		String wordBank[] = { "e", "ee", "eee", "eeeee", "eeeeee", "eeeeeee", "eeeeeeeee" };
		ac(target, wordBank, new ArrayList<String>(), new HashMap<String, List<String>>());
		System.out.println(out);
	}

	List<List<String>> out = new ArrayList<List<String>>();

	private List<String> ac(String target, String wordBank[], List<String> lst,Map<String,List<String>> map) {
		if(map.containsKey(target)) {
			return map.get(target);
		}
		if (target.length() == 0) {
			map.put(target, lst);
			return lst;
		}

		for (int i = 0; i < wordBank.length; i++) {
			if (target.indexOf(wordBank[i]) == 0) {
				lst.add(wordBank[i]);
				String temp = target.substring(wordBank[i].length());
				List<String> tempList = new ArrayList<String>(ac(temp, wordBank, lst,map));
				if(!tempList.isEmpty())
					out.add(tempList);
				lst.remove(lst.size() - 1);
			}
		}
		map.put(target, new ArrayList<String>());
		return new ArrayList<String>();

	}

}
