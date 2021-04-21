package classRoomAssignment;

import org.junit.Test;

public class NoOfOccurance {

	@Test
	public void example1() {
		String input1 = "Welcome to the world to do something great";
		String input2 = "to";
		method2(input1, input2);
	}
	int count = 0;
	
	private void method1(String input1, String input2) {
		String[] inp = input1.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase().split("\\s+");
		for (int i = 0; i < inp.length; i++) {
			recFunction(inp[i],input2);
		}
		System.out.println(count);
	}
	private void recFunction(String inp1, String inp2) {
		if (inp1.equals(inp2)) {
			count++;
		}
	}
	
	private void method2(String input1, String input2) {
		recFunction2(input1,input2, new String());
		System.out.println(count);
	}
	
	private void recFunction2(String input1, String input2,String comp) {
		if(input1.length() == 0)
			return;
		if(!Character.isAlphabetic(input1.charAt(0)) ){
			if(comp.trim().equals(input2))
				count++;
			else
				comp = new String();
		}
		comp = comp + input1.charAt(0);
		recFunction2(input1.substring(1, input1.length()), input2, comp);
	}
}
