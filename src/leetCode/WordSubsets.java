package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class WordSubsets {

	@Test
	public void example1() {
		String[] A = {"amazon","apple","facebook","google","leetcode"};
		String[] B = {"lo","eoo"};
		method(A,B);
	}
	
	/*
	 * private void method(String A[], String B[]) { HashMap<Character, Integer> bkp
	 * = new HashMap<>(); HashMap<Character, Integer> b = null; for(int i = 0;
	 * i<B.length; i++){ b = new HashMap<>(); for(int j = 0; j<B[i].length(); j++){
	 * b.put(B[i].charAt(j),b.getOrDefault(B[i].charAt(j),0)+1); } for(char x :
	 * b.keySet()) { if(!bkp.containsKey(x)) { bkp.put(x, b.get(x)); }else {
	 * if(bkp.get(x)<b.get(x)) { bkp.put(x, b.get(x)); } } } }
	 * System.out.println(b); System.out.println(bkp); List<String> out = new
	 * ArrayList<String>(); for(int i = 0; i<A.length; i++){ boolean flag = true;
	 * HashMap<Character, Integer> a = new HashMap<>(); for(int j = 0;
	 * j<A[i].length(); j++){
	 * a.put(A[i].charAt(j),a.getOr	Default(A[i].charAt(j),0)+1); } for(char x :
	 * bkp.keySet()) { if(a.get(x)==null || bkp.get(x) > a.get(x)) { flag = false; }
	 * } if(flag) { out.add(A[i]); } } System.out.println(out); }
	 */
	
	private void method(String A[], String B[]) {
		int dic[] = new int[26];
		for(String word : B) {
			int temp[] = new int[26];
			for(char a : word.toCharArray()) {
				temp[a-'a']++;
				if(temp[a-'a']>dic[a-'a']) {
					dic[a-'a'] = temp[a-'a'];
				}
			}
		}
		List<String> out = new ArrayList<String>();
		for(String word: A) {
			int temp[] = new int[26];
			for(char a : word.toCharArray()) {
				temp[a-'a']++;
			}
			int i = 0;
			for(; i<26; i++) {
				if(temp[i]<dic[i]) 
					break;
			}
			if(i==26) {
				out.add(word);
			}
			
		}
		System.out.println(out);
	}
	
}
