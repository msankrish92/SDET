package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CanConstruct {

	@Test
	public void example1() {
		String target = "abcdef";
		String wordBank[] = {"ab","abc","cd","def","abcd"};
//		System.out.println("topDown" + " -> " +cc(target, wordBank, new StringBuilder()));
		System.out.println("BottomUp" + "->" +ccBp(target, wordBank, new HashMap<String, Boolean>()));
	}
	
	@Test
	public void example2() {
		String target = "skateboard";
		String wordBank[] = {"bo","rd","ate","t","ska","sk","boar"};
//		System.out.println(cc(target, wordBank, new StringBuilder()));
		System.out.println("BottomUp" + "->" +ccBp(target, wordBank, new HashMap<String, Boolean>()));
	}
	
	@Test
	public void example3() {
		String target = "enterpotentpot";
		String wordBank[] = {"a","p","ent","enter","ot","o","t"};
//		System.out.println(cc(target, wordBank, new StringBuilder()));
		System.out.println("BottomUp" + "->" +ccBp(target, wordBank, new HashMap<String, Boolean>()));
	}
	
	@Test
	public void example4() {
		String target = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef";
		String wordBank[] = {"e","ee","eee","eeeee","eeeeee","eeeeeee","eeeeeeeee"};
		System.out.println("BottomUp" + "->" +ccBp(target, wordBank, new HashMap<String, Boolean>()));
	}
	
	private boolean cc(String target, String wordBank[], StringBuilder str) {
		if(str.toString().equals(target)) {
			return true;
		}
		if(str.toString().length()>target.length()) {
			return false;
		}
		
		for (int i = 0; i < wordBank.length; i++) {
			str.append(wordBank[i]);
			if(cc(target, wordBank, str)) {
				return true;
			}
			str.setLength(str.length()-wordBank[i].length());
		}
		return false;
	}
	
	private boolean ccBp(String target, String wordBank[],Map<String,Boolean> map) {
		if(map.containsKey(target))
			return map.get(target);
		if(target.length() == 0) {
			return true;
		}
		
		for (int i = 0; i < wordBank.length; i++) {
			if(target.indexOf(wordBank[i])==0) {
				String temp = target.substring(wordBank[i].length());
				if(ccBp(temp, wordBank,map)) {
					map.put(temp, true);
					return true;
				}
			}
		}
		map.put(target, false);
		return false;
	}
	
}
