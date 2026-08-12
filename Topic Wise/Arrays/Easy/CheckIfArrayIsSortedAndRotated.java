// check-if-array-is-sorted-and-rotated 
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/


public class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count  = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > nums[(i+1)%n]){
                count++;
                if(count > 1){
                    return false;
                }
            }
        }
        return true;
    }
    
}
