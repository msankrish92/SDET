package leetCode;

public class TrappingRainWater {

	public static void main(String[] args) {
//		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//		int arr[] = {4,2,0,3,2,5};
		int arr[] = {4,2,3};
		
		int highestValue = arr[0];
        int lastHighestIndexValue = 0;
        int count = 0;
        int index = 1;
        int tempCount = 0;
        while(lastHighestIndexValue<arr.length-1){
            
            if(index<arr.length && arr[index]<highestValue){
                count = highestValue - arr[index] + count; 
                tempCount = highestValue - arr[index] + tempCount;
                index++;
                
            }else if(index<arr.length && arr[index]>=highestValue){
                highestValue = arr[index];
                lastHighestIndexValue = index;
                index++;
                tempCount = 0;
            }else {
                lastHighestIndexValue++;
                highestValue = arr[lastHighestIndexValue];
                index = lastHighestIndexValue + 1;
                count = count - tempCount;
                tempCount = 0;
            }
        }
        System.out.println(count);
    }

	}


