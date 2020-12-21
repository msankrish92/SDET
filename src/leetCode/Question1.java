package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

	
	public static void main(String[] args) {
		List<Integer> scheduleStart = new ArrayList<Integer>();
		List<Integer> scheduleEnd = new ArrayList<Integer>();
		scheduleStart.add(3);
		scheduleStart.add(3);
		scheduleStart.add(7);
		scheduleStart.add(2);
		scheduleStart.add(3);
		scheduleStart.add(5);
		scheduleEnd.add(7);
		scheduleEnd.add(6);
		scheduleEnd.add(15);
		scheduleEnd.add(4);
		scheduleEnd.add(7);
		scheduleEnd.add(8);
		
		int max = 0;
        for(int i = 0; i<scheduleStart.size(); i++){
            int count = 0;
            for(int j = 0; j<scheduleStart.size(); j++){
                if(i!=j){
                    if(scheduleStart.get(i)<scheduleStart.get(j) && scheduleStart.get(i)<scheduleEnd.get(j) && scheduleEnd.get(i)<scheduleStart.get(j) && scheduleEnd.get(i)<scheduleEnd.get(j)){
                        count++;
                    }
                }
                max = Math.max(count, max);
            }
        }
        System.out.println(max);
	}
	
}
