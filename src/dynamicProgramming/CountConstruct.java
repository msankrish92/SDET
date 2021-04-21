package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CountConstruct {

	@Test
	public void example1() {
		String target = "abcdef";
		String wordBank[] = {"ab","abc","cd","def","abcd"};
		System.out.println(cc(target, wordBank,new HashMap<String, Integer>()));
	}
	
	@Test
	public void example2() {
		String target = "skateboard";
		String wordBank[] = {"bo","rd","ate","t","ska","sk","boar"};
		System.out.println(cc(target, wordBank,new HashMap<String, Integer>()));
	}
	
	@Test
	public void example3() {
		String target = "enterpotentpot";
		String wordBank[] = {"a","p","ent","enter","ot","o","t"};
		System.out.println(cc(target, wordBank,new HashMap<String, Integer>()));
	}
	
	@Test
	public void example4() {
		String target = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef";
		String wordBank[] = {"e","ee","eee","eeeee","eeeeee","eeeeeee","eeeeeeeee"};
		System.out.println(cc(target, wordBank,new HashMap<String, Integer>()));
	}
	
	private int cc(String target, String wordBank[],Map<String,Integer> map) {
		if(map.containsKey(target)) {
			return map.get(target);
		}
		if(target.length()==0) {
			return 1;
		}
		
		int count = 0;
		
		for (int i = 0; i < wordBank.length; i++) {
			if(target.indexOf(wordBank[i])==0) {
				int numways = cc(target.substring(wordBank[i].length()), wordBank,map);
				count+=numways;
			}
		}
		map.put(target, count);
		return count;
	}
	
}
