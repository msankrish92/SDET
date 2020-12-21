package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Question2 {

	public static void main(String[] args) {
		
		String s = "RUDRL";
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		System.out.println(map);
		int step = 0;
		for (int i = 0; i < map.size(); i++) {
			if (map.containsKey('L') && map.containsKey('R')) {
				if(map.get('R')>map.get('L')) {
					map.put('R', map.get('R') - map.get('L'));
					map.put('L', 0);
				}else if(map.get('R')<map.get('L')) {
					map.put('L', map.get('L') - map.get('R'));
					map.put('R', 0);
				}else {
					map.put('L',0);
					map.put('R',0);
				}
			}

			if (map.containsKey('U') && map.containsKey('D')) {
				if(map.get('U')>map.get('D')) {
					map.put('U', map.get('U') - map.get('D'));
					map.put('D', 0);
				}else if(map.get('U')<map.get('D')) {
					map.put('D', map.get('D') - map.get('U'));
					map.put('D', 0);
				}else {
					map.put('U',0);
					map.put('D',0);
				}
			}
		}

		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			step = step + entry.getValue();
		}
		if(step == s.length()) {
			System.out.println(step);
		}else {
			System.out.println(s.length()-step);
		}
	}

}
