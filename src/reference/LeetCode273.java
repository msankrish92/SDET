package reference;

import org.junit.Test;

public class LeetCode273 {

	@Test
	public void example1() {
		int input = 23456;
		System.out.println(numberToWords(input));
	}
	
	String[] ones ={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","Thirteen","fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};

    String[] tens = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
    
    
    public String numberToWords(int nums) {
        return recursiveFunction(nums);
    }
    
    private String recursiveFunction(int nums){

    	
    	if(nums>20000 && nums<100000){
            return tens[nums/10000] + " thousand " + recursiveFunction(nums%10000);
        }
    	if(nums>999 && nums<20000){
            return ones[nums/1000] + " thousand " + recursiveFunction(nums%1000);
        }
        if(nums>99 && nums<1000){
            return ones[nums/100] + " hundred " + recursiveFunction(nums%100);
        }
        if(nums>19){
            return tens[nums/10] + " " + recursiveFunction(nums%10);
        }
        return ones[nums];
        
        
    }
	
	
}
