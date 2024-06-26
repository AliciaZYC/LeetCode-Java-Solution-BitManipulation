class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length; 
        int res=0;
        for (int i=1; i<=n; i++){
            res^=i;
        }
        for (int i=0; i<nums.length; i++){
            res^=nums[i];
        }
        return res;
    }
}