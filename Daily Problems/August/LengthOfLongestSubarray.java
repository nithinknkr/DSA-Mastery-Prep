import java.util.HashMap;

// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/?envType=daily-question&envId=2026-08-12
class LengthOfLongestSubarray {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int len = 0;
        for (int right = 0; right < nums.length; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            while (freq.get(nums[right]) > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                left++;
            }
            len = Math.max(len, right - left + 1);
        }

        return len;
    }
    public static void main(String[] args) {
        LengthOfLongestSubarray obj = new LengthOfLongestSubarray();
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        System.out.println(obj.maxSubarrayLength(nums, k));
    }
}