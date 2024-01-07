class Solution {
    public int numberOfBeams(String[] bank) {
        int ans = 0;
        int prevCount = 0;

        for(String row: bank) {
            int currentCount = 0;
            for(char ch: row.toCharArray()) {
                if(ch == '1') {
                    currentCount++;
                }
            }

            if(currentCount > 0) {
                ans += prevCount * currentCount;
                prevCount = currentCount;
            }
        }
        
        return ans;
    }
}