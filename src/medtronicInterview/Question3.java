package medtronicInterview;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Question3 {

//	String = sanjay - permutation
	
	@Test
	public void example1() {
		String input = "ABC";
		method2(input);
	}
	//ABC BAC ACB CAB CBA BCA
	//pseudo
	//
	
//	public void method1(String input) {
//		char inp[] = input.toCharArray();
//		for(int i = 0; i<inp.length; i++) {
//			for (int j = 0; j < inp.length; j++) {
//				char temp = inp[i];
//				inp[i] = inp[j];
//				inp[j] = temp;
//				System.out.println(Arrays.toString(inp));
//				char temp2 = inp[i];
//				inp[i] = inp[j];
//				inp[j] = temp2;
//			}
//		}
//	}
	//ABC BAC ACB CAB CBA BCA
	List<String> lst = new ArrayList<String>();
	public void method2(String input) {
		permutaion(input, 0);
		System.out.println(lst);
	}
	
	public void permutaion(String input, int start) {
		if(start == input.length()) {
			lst.add(input);
			return;
		}
		for(int i = start; i<input.length(); i++) {
			input = swap(input, i, start);
			permutaion(input, start+1);
			input = swap(input, i,start);
		}
	}
	
	public String swap(String input, int i, int j) {
		char[] inp = input.toCharArray();
		char temp = inp[i];
		inp[i] = inp[j];
		inp[j] = temp;
		StringBuilder str = new StringBuilder();
		for(char a : inp) {
			str.append(a);
		}
		return str.toString();
	}
	
	
}
