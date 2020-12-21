package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class question3 {

	public static void main(String[] args) {
		
		List<String> transactions = new ArrayList<String>();
		transactions.add("notebook");
		transactions.add("notebook");
		transactions.add("mouse");
		transactions.add("keyboard");
		transactions.add("mouse");
		
		 Map<String,Integer> tranMap = new HashMap<>();
	        
	        for(int i = 0; i<transactions.size(); i++){
	            tranMap.put(transactions.get(i), tranMap.getOrDefault(transactions.get(i), 0)+1);
	        }
	        
	        // System.out.println(tranMap);
	        
	        Set<Entry<String,Integer>> entrySet = tranMap.entrySet();
	        List<Entry<String,Integer>> list = new ArrayList<>(entrySet);
	        
	        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
	            @Override
	            public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2){
	                return o2.getValue().compareTo(o1.getValue());
	            }
	        });
	        
	        System.out.println(list);
		
	}
	
}
