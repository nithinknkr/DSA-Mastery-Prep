// Rotate Array

// https://leetcode.com/problems/rotate-array/description/

class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int r = k%n;
        change(nums , 0 , n-1);
        change(nums , r , n-1);
        change(nums , 0 , r-1);
    }
    public static void change(int[] nums , int s , int e){
        int start = s;
        int end = e;
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}