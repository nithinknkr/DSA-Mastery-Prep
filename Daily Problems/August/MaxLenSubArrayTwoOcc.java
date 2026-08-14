// https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/?envType=daily-question&envId=2026-08-14

// Maximum Length Substring With Two Occurrences

import java.util.HashMap;
import java.util.Map;

class MaxLenSubArrayTwoOcc {
    public int maximumLengthSubstring(String s) {
        int len = 0;
        int ptr = 0;
        Map<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0)+1);
            
            while(map.get(ch) > 2){
                char c = s.charAt(ptr);
                if (map.get(c) > 1) {
                    map.put(c, map.get(c) - 1);
                } else {
                    map.remove(c);
                }
                ptr++;
            }
            len = Math.max(len , i - ptr+1);
        }
        return len;
    }
}
