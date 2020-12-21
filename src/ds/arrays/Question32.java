package ds.arrays;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.After;
import org.junit.Test;

public class Question32 {

	@Test
	public void testData1() {
		int input = 909091;
		callingImplementation(input);
	}

	@Test
	public void testData2() {
		int input = 1015073;
		callingImplementation(input);
	}

	@Test
	public void testData3() {
		int input = 4804686;
		callingImplementation(input);
	}


	@Test
	public void testData4() {
		int input = 23;
		callingImplementation(input);
	}
	
	private void callingImplementation(int input) {
		bruteForce(input);
		System.out.println("--------");
		bruteForce_V2(input);
	}
	
	@After
	public void afterMethod() {
		System.out.println("--------------------------");
	}


	private void bruteForce(int input) {
		char[] inputArray = new char[Integer.toString(input).length()];
		for (int i = 0; i < Integer.toString(input).length(); i++) {
			inputArray[i] = Integer.toString(input).charAt(i);
		}

		HashSet<Integer> allPossibleCombinations = new HashSet<Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			allPossibleCombinations.add(i);
			for (int j = i+1; j < inputArray.length; j++) {
				allPossibleCombinations.add(Integer.parseInt(new String(Arrays.copyOfRange(inputArray, i, j+1))));
			}
		}

		HashSet<Integer> nonPrimeNumber = new HashSet<Integer>();
		for (Integer integer : allPossibleCombinations) {
			for (int i = 2; i <= Math.sqrt(integer); i++) {
				if(integer%i == 0) {
					nonPrimeNumber.add(integer);
					break;
				}
			}
		}
//		System.out.println(allPossibleCombinations.size());
		allPossibleCombinations.removeAll(nonPrimeNumber);
		System.out.println(allPossibleCombinations);

	}

	private void bruteForce_V2(int input) {
		char[] inputArray = new char[Integer.toString(input).length()];
		for (int i = 0; i < Integer.toString(input).length(); i++) {
			inputArray[i] = Integer.toString(input).charAt(i);
		}

		HashSet<Integer> allPossibleCombinations = new HashSet<Integer>();
		for (int i = 0; i < inputArray.length; i++) {
			allPossibleCombinations.add(i);
			for (int j = i+1; j < inputArray.length; j++) {
				int number = Integer.parseInt(new String(Arrays.copyOfRange(inputArray, i, j+1)));
				if(number ==2 || number==3 || (number+1)%6==0|| (number-1)%6==0)
					allPossibleCombinations.add(number);
			}
		}

		HashSet<Integer> nonPrimeNumber = new HashSet<Integer>();
		for (Integer integer : allPossibleCombinations) {
			for (int i = 2; i <= Math.sqrt(integer); i++) {
				if(integer%i == 0) {
					nonPrimeNumber.add(integer);
					break;
				}
			}
		}
//		System.out.println(allPossibleCombinations.size());
		allPossibleCombinations.removeAll(nonPrimeNumber);
		System.out.println(allPossibleCombinations);

	}
}

	

