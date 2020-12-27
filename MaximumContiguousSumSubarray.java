
import java.util.Arrays; 
import java.util.stream.IntStream;

public class MaximumContiguousSumSubarray {
    /***
     * This class will have two methods one will retunr max sum and other will return array
     * this program is build using kadane's algorithm
     * 
     * */
    public static void main (String[] args) 
    { 
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Maximum contiguous sum is " + 
                                       maxSubArraySum(a)); 
                                       
       System.out.println("Maximum sum contiguous subarray is " + 
       Arrays.toString(maxSumSubArray(a))); 
    }
    
    public static int maxSubArraySum(int[] numbers) {
        int max_sum = Integer.MIN_VALUE;
        int max_at_point = 0;
        int length = numbers.length;
        for(int index = 0 ; index < length ; index++){
            max_at_point = max_at_point + numbers[index]; 
            if (max_at_point < 0) 
                max_at_point = 0;
            else if (max_sum < max_at_point) 
                max_sum = max_at_point; 
        }
        return max_sum;
    } 
    
    public static int[] maxSumSubArray(int[] numbers) {
        int max_sum = Integer.MIN_VALUE;
        int max_at_point = 0;
        int length = numbers.length;
        int startIndex = 0; 
        int endIndex = 0;
        int s = 0;
        for(int index = 0 ; index < length ; index++){
            max_at_point = max_at_point + numbers[index]; 
            if (max_at_point < 0) {
                max_at_point = 0; 
                s = index + 1;
            } else if (max_sum < max_at_point) {
                max_sum = max_at_point; 
                startIndex = s;
                endIndex = index;
            }
        }
        
         // Get the slice of the Array 
        int[] slice = IntStream  
                          .range(startIndex, endIndex+1) 
                          .map(i -> numbers[i]) 
                          .toArray(); 
  
        // return the slice 
        return slice; 
    }
}
