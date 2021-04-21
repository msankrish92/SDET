package ls.list;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Lst {

	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(3);
		lst.add(2);
		lst.add(1);
		lst.add(0);
		lst.remove(0);
		List<Integer> lst1 = new LinkedList<>();
		lst1.add(3);
		lst1.add(2);
		lst1.add(1);
		lst1.add(0);

		new IOException();
		
		lst1.remove(lst1.get(3));
		System.out.println(lst);
		System.out.println(lst1);
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		List<Entry<Integer,Integer>> lst2 = new ArrayList<>(map.entrySet());
		
		
		
		Set<Integer> st = new HashSet<Integer>();
		Set<Integer> st2 = new LinkedHashSet<Integer>();
		Set<Integer> st3 = new TreeSet<Integer>();
		
//		Collections.sort(lst,Map.Entry.comparingByValue(Collections.reverseOrder()));
		
		
	}

}
