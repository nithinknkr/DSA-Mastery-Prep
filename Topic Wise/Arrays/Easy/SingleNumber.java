//Single Number in an Array

// https://leetcode.com/problems/single-number/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int r = 0;
        for(int i = 0 ; i < nums.length ; i++){
            r^=nums[i];
        }
        return r;
    }
    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
        int[] nums = {4,1,2,1,2};
        System.out.println(obj.singleNumber(nums));
    }
    
}
