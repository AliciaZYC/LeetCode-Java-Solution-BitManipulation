class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[]=new int[2];
        int x=0;
        for (int i=0; i<nums.length; i++) x^=nums[i];
        int lowbit=x&(~x+1);
        for(int i=0;i<nums.length;i++){
            if((nums[i]&lowbit)==lowbit) ans[0]^=nums[i];
            else ans[1]^=nums[i];
        }
        return ans;
    }
}