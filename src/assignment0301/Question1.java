package assignment0301;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Question1 {

	@Test
	public void example1() {
		String s = "aazzza";
		int k = 2;
		System.out.println(getLargestString(s, k));
		
	}
	
	@Test
	public void example2() {
		String s = "aazzzza";
		int k = 3;
		System.out.println(getLargestString(s, k));
		
	}
	
	@Test
	public void example3() {
		String s = "aazzzzaa";
		int k = 2;
		System.out.println(getLargestString(s, k));
		
	}
	 public static String getLargestString(String s, int k) {
		    // Write your code here
		    
		  int[] counter = new int[26];

		        for(Character eachch : s.toCharArray()) {
		            counter[eachch - 'a']++;
		        }

		        List<Character> characters = new ArrayList<>();

		        for(int i= 25; i> -1; i--) {

		            if(counter[i] > 0) characters.add((char)('a'+i));
		        }

		        StringBuilder build = new StringBuilder();
		        while(!characters.isEmpty()){
		            char currentChar = characters.get(0);
		            int numberOfTimes = Math.min(k, counter[currentChar-'a']);

		            while(numberOfTimes-- > 0){
		                build.append(currentChar);
		                counter[currentChar-'a']--;
		            } 
		            if(counter[currentChar-'a'] != 0 && characters.size() > 1){
		                build.append(characters.get(1));
		                counter[characters.get(1)-'a']--;  
		                if(counter[characters.get(1)-'a'] ==0) characters.remove(1);
		            }else{
		                characters.remove(0);
		            }
		        }


		        return build.toString();
		    }
}
