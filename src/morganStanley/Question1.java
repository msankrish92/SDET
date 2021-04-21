package morganStanley;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Question1 {

	@Test
	public void example() {
		String inp = "sanjay";
		method1(inp);
		
	}
	
	//Pseudo
	// using HashMap
	
	public void method1(String inp) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i<inp.length(); i++) {
			map.put(inp.charAt(i), map.getOrDefault(inp.charAt(i), 0)+1);
		}
		
		System.out.println(map);
		
	}
	
//	update table set  co where contion
	
	//select columname from table1 innerjoin table2 on table1.col = table2.col
	
	
}
