// Largest Element

// https://takeuforward.org/plus/dsa/problems/largest-element?source=strivers-a2z-dsa-track

public class LargestElement {
    public int largestElement(int[] nums) {
        int lar = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            lar = Math.max(lar , nums[i]);
        }
        return lar;
    }
}
