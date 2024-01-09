import java.util.*;

class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int ans = 0;

        for(int val: nums) 
            frequency.put(val, frequency.getOrDefault(val, 0) + 1);

        for(Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int val = entry.getValue();

            if(val == 1) 
                return -1;

            ans += val/3;
            if(val % 3 != 0) 
                ans++;
        }
        return ans;
    }
}