package ds.arrays;

import org.junit.Test;

public class Question35 {

	@Test
	public void example1() {
		String arrival[] = {"9:00","9:40","9:50","11:00","15:00","18:00"};
		String departure[] = {"9:10","12:00","11:20","11:30","19:00","20:00"};
		platFormRequired(arrival, departure);
	}

	private void platFormRequired(String[] strArrival, String[] strDeparture) {
		int[] arrival = new int[strArrival.length];
		int[] departure = new int[strDeparture.length];
		int maxPlaxFrom = 0;
		int FinMaxPlaxFrom = 0;
		for (int i = 0; i < arrival.length; i++) {
			arrival[i] = Integer.parseInt(strArrival[i].replace(":", ""));
		}

		for (int i = 0; i < departure.length; i++) {
			departure[i] = Integer.parseInt(strDeparture[i].replace(":", ""));
		}

		for (int i = 0; i < arrival.length; i++) {
			maxPlaxFrom = 0;
			for (int j = 0; j < arrival.length; j++) {
				if(arrival[j]>=arrival[i] && arrival[j] <= departure[i]) {
					maxPlaxFrom++;
				}
			}
			if(FinMaxPlaxFrom<maxPlaxFrom) {
				FinMaxPlaxFrom = maxPlaxFrom;
			}
			
		}
		
		
		
		System.out.println(FinMaxPlaxFrom);
	}
}
