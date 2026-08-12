// Smallest Missing Integer Greater Than Sequential Prefix Sum

// https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/?envType=daily-question&envId=2026-08-11

// 11 - 08 - 2026

import java.util.*;
public class MissingInteger {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        if(nums.length == 1){
            return sum+1;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
            set.add(num);
        }
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == nums[i-1]+1){
                sum+=nums[i];
            }else{
                break;
            }
        }
        while(set.contains(sum)){
            sum++;
        }
        return sum;
    }
    
}
