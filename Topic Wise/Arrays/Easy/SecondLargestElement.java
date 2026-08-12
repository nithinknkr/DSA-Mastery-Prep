//Second Largest Element in an Array

// https://takeuforward.org/plus/dsa/problems/second-largest-element?source=strivers-a2z-dsa-track

public class SecondLargestElement {

    public int secondLargestElement(int[] nums) {
        int lar = Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            lar = Math.max(lar , nums[i]);
            if(lar != nums[i]){
                seclar = Math.max(seclar , nums[i]);
            }
        }
        if(seclar == Integer.MIN_VALUE) return -1;
        return seclar;
    }
    
}
