package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class GenerateParentheses {

//	static List<String> lst = new ArrayList<String>();
//	static Set<String> validlst = new HashSet<String>();

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		String input = "((((()))))";
		List<String> permutation = permutation(input, 0, input.length() - 1,lst);
		System.out.println(permutation);
		validParantheses(lst);
	}

	public static List<String> permutation(String input, int l, int r,List<String> lst) {

		if (l == r) {
			lst.add(input);
		}
		for (int i = l; i <= r; i++) {
			input = swap(input, l, i);
			permutation(input, l + 1, r,lst);
			input = swap(input, l, i);

		}

		return lst;

	}

	public static String swap(String input, int l, int r) {
		char[] in = input.toCharArray();
		char temp = in[l];
		in[l] = in[r];
		in[r] = temp;
		return String.valueOf(in);

	}

	public static void validParantheses(List<String> inp) {
		Set<String> validlst = new HashSet<String>();
		for (int i = 0; i < inp.size(); i++) {
			if (inp.get(i).charAt(0) == ')') {
				continue;
			}
			Stack<Character> stack = new Stack<>();
			for(int j = 0; j<inp.get(i).length(); j++) {
				if(inp.get(i).charAt(j) == '(') {
					stack.push(inp.get(i).charAt(j));
				}else if(!stack.isEmpty() && inp.get(i).charAt(j) == ')'){
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				validlst.add(inp.get(i));
			}
		}
		System.out.println(validlst);
	}

}
