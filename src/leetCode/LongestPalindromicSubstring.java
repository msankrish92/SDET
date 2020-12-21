package leetCode;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LongestPalindromicSubstring {
	
	@Test
	public void example1() {
		String s = "babad";
		System.out.println(method1(s));
	}
	
	
	public String method1(String s) {
		List<StringBuilder> subList = new ArrayList<StringBuilder>();
	    List<String> palinList = new ArrayList<String>();
	        
	    for(int i = 0; i<s.length(); i++){
	        for(int j = i+1; j<=s.length(); j++)
	        {
	            subList.add(new StringBuilder(s.substring(i,j)));
	        }
	    }    
	    StringBuilder temp = new StringBuilder();
	    for(int i = 0; i<subList.size(); i++){
	        System.out.println(subList.get(i));
	          temp = subList.get(i).reverse();
	        if(subList.get(i).equals(temp)){
	            palinList.add(subList.get(i).toString());
	        }
	    }    
	        System.out.println(palinList);
	        System.out.println(subList);
	        return "";
	}
}
