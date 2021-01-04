package assignment0301;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Question3 {
	
	@Test
	public void example1() {
		List<String> lst = new ArrayList<String>(Arrays.asList("notepad","mouse","notepad","mouse","keyboard"));
		System.out.println(groupTransactions(lst));
	}
	
	@Test
	public void example2() {
		List<String> lst = new ArrayList<String>(Arrays.asList("bin","sin","can","an","sin"));
		System.out.println(groupTransactions(lst));
	}
	
	 public static List<String> groupTransactions(List<String> transactions) {
		    // Write your code here
		    
		    int maxoccurance =0;
		        HashMap<String, Integer> Occurance =new HashMap<>();
		        for(String eachWord: transactions){
		            Occurance.put(eachWord, Occurance.getOrDefault(eachWord, 0)+1);
		            maxoccurance = Math.max(maxoccurance, Occurance.get(eachWord));
		        } 
		        

		       HashMap<Integer, List<String>> occuranceGrouMap =new HashMap<>();
		        
		        for(Map.Entry<String, Integer> entrySet: Occurance.entrySet()){
		            List<String> tempSet = occuranceGrouMap.getOrDefault(maxoccurance-entrySet.getValue(), new ArrayList<>());
		            tempSet.add(entrySet.getKey() +" "+entrySet.getValue());
		            occuranceGrouMap.put(maxoccurance-entrySet.getValue(), tempSet);
		        }
		        
		        
		        List<String> output = new ArrayList<>();
		        for (List<String> entrySet: occuranceGrouMap.values()) {
		            Collections.sort(entrySet);
		            output.addAll(entrySet);
		        }
		      return output;  
		    }


}
