// Longest subarray with sum K

// https://takeuforward.org/plus/dsa/problems/longest-subarray-with-sum-k?source=strivers-a2z-dsa-track
public class LongestSubarrayWithSumK {

    public int longestSubarray(int[] nums, int k) {
       int sum = 0;
       int max = 0;  
       int n = nums.length;
       int left = 0;
       int right = 0;
       while(right < n){
        sum+=nums[right];
        if(sum > k){
            while(sum > k){
            sum-=nums[left];
            left++;
            }
        }
        if(sum == k){
            max = Math.max(max , right-left+1);
        }
        right++;
       }
       return max;
    }
     public static void main(String[] args) {
        LongestSubarrayWithSumK obj = new LongestSubarrayWithSumK();
        int[] nums = {1,2,3,4,5};
        int k = 5;
        System.out.println(obj.longestSubarray(nums , k));
     }
}
