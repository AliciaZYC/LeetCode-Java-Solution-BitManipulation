class Solution {
    public int binaryGap(int n) {
        int indexOne = -1, longestDistance = 0;
        for (int i = 0; i < 32; ++i) { 
            if (((n >> i) & 1) == 1) { 
                if (indexOne != -1){
                    longestDistance = Math.max(longestDistance, i - indexOne);
                }
                indexOne = i; 
            }
        }
        return longestDistance;
    }
}