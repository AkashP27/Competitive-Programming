import java.util.*;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] frequencyCount = new int[nums.length+1];
        List<List<Integer>> ans = new ArrayList<>();

        for (int val: nums) {
            frequencyCount[val]++;
            int freq = frequencyCount[val];
            if(ans.size() < freq) {
                ans.add(new ArrayList<>());
            }
            ans.get(freq-1).add(val);
        }
        
        return ans;
    }
}