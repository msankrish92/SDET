package ds.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.After;
import org.junit.Test;

public class Question31 {
	
	
/*	Write a program that tells all the words containing same letters(anagram)
	Input  : "Stale are there in tesla and you can steal the pears"
	Output : [Stale, tesla, steal]*/

	@Test // Positive
	public void example1() {
		String input = "stale are there in tesla and you can steal the pears";
		stringAnagram(input);
	}

	@Test // No Match
	public void example2() {
		String input = "stale are there in and you can the pears";
		stringAnagram(input);
	}

	@Test // Partial Match
	public void example3() {
		String input = "stale are sta there in and you can the pears";
		stringAnagram(input);
	}

	@Test // single word
	public void example4() {
		String input = "stale";
		stringAnagram(input);
	}

	@After
	public void after() {
		System.out.println("=======");
	}

	// Method 1 (Time Complexity O[N^3]
	private void stringAnagram(String input) {
		//Convert the string intp array
		String inp[] = input.split(" ");
		//Make a copy of it
		String out[] = new String[inp.length];
		for (int i = 0; i < out.length; i++) {
			out[i] = inp[i];
		}
		//To load index of the anagrams
		Set<Integer> anaSet = new HashSet<Integer>();
		
		//Reverse the string in inp array
		for (int i = 0; i < inp.length; i++) {
			char[] temp = inp[i].toCharArray();
			Arrays.sort(temp);
			inp[i] = new String(temp);
		}

		//To select single word
		for (int i = 0; i < inp.length; i++) {
			String temp = inp[i];
			//To compare all the word against above selected word
			for (int j = i + 1; j < inp.length; j++) {
				String temp2 = inp[j];
				//To Compare temp1 and temp2 by characters
				for (int k = 0; k < temp.length(); k++) {
					//If each character is same and length of word is same break
					//Else add it to the set
					if (!(temp.charAt(k) == temp2.charAt(k) && temp.length() == temp2.length())) {
						break;
					}
					if (k == temp.length() - 1) {
						anaSet.add(i);
						anaSet.add(j);
					}

				}

			}
		}
		//To print the result
		Iterator iterator = anaSet.iterator();
		System.out.print("[");
		while (iterator.hasNext()) {
			System.out.print(out[(int) iterator.next()] + ",");
		}
		System.out.println("]");
	}

}
