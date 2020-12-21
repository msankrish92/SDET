package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GroupAnagrams {

//Pseudo
//	Create a Map with Integer as key and List of String as value
//	Loop through the string array and find the total ascii value of the characters of the string
//	add it to Map along with String value
//	return 
	
	@Test
	public void example1() {
		String strs[] = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagram(strs));
	}
//	@Test
	public void example2() {
		String strs[] = {""};
		System.out.println(groupAnagram(strs));
	}
//	@Test
	public void example3() {
		String strs[] = {"ddddddddddg","dgggggggggg"};
		System.out.println(groupAnagram(strs));
	}
	//Method 1
//	private List<List<String>> groupAnagram(String strs[]){
//		HashMap<HashMap<Character,Integer>,List<String>> map = new HashMap<>();
//		
//		for (int i = 0; i < strs.length; i++) {
//			HashMap<Character,Integer> charCount = new HashMap<Character, Integer>();
//			for (int j = 0; j < strs[i].length(); j++) {
//				charCount.put(strs[i].charAt(j), charCount.getOrDefault(strs[i].charAt(j), 0)+1);
//			}
//			if(map.containsKey(charCount)) {
//				map.get(charCount).add(strs[i]);
//			}else {
//				List<String> temp = new ArrayList<String>();
//				temp.add(strs[i]);
//				map.put(charCount, temp);
//			}
//		}
//		
//		return new ArrayList<List<String>>(map.values());
//		
//	}
	
	//Method 2
	private List<List<String>> groupAnagram(String strs[]){
		  List<List<String>> result = new ArrayList<>();
	        Map<Integer, List<String>> map = new HashMap<>();
	        
	        for(String str: strs){
	            int sum = 1;
	            int total = 0;
	            for(int i=0; i < str.length(); i++){
	                int intVal = str.charAt(i);
	                sum = sum *intVal;
	                total = total + intVal;
	            }
	            sum = sum + total;
	            
	            if(map.containsKey(sum)){
	                map.get(sum).add(str);
	            }else{
	                List<String> list = new ArrayList<>();
	                list.add(str);
	                map.put(sum, list);
	                result.add(list);
	            }
	        }
	        return result;
	}
	
	
}
