package classRoomAssignment;

import org.junit.Test;

public class MatchesCount {

	/*
	 * Pseudo
	 * recursion(num of team, count)
	 * if(team == 1){
	 * return count
	 * if(n%2 == 0)
	 * 		recursion(num of team - 1, count++)
	 * if(n%2 == 1)
	 * 		recursion(num of - 1, count+2)
	 */
	
	
	@Test
	public void example1() {
		int n = 6;
		matches(n, 0);
	}
	
	
	private void matches(int n, int count) {
		if(n < 2) {
			System.out.println(count);
			return;
		}
		if(n%2 == 0) 
			matches(n/2, count + n/2);
		else
			matches(((n-1)/2)+1, count + (n-1)/2);
	}
	
}
