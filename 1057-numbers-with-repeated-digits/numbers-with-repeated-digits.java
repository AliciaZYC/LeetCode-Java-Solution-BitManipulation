class Solution {
    Integer[][][][] dp = new Integer[10][1 << 10][2][2];
    public int numDupDigitsAtMostN(int n) {
        String num = Integer.toString(n);
        return helper(num,0,0,0,1);
    }
    private int helper(String num,int idx,int mask,int flag,int tight){
        if(idx == num.length()) return flag;
        if(dp[idx][mask][flag][tight] != null) return dp[idx][mask][flag][tight];
        int max = tight == 1? num.charAt(idx) - '0' : 9;
        int count = 0;
        for (int i = 0; i <= max; i++) {
                if(i == 0 && mask == 0) count += helper(num,idx+1,0,0,0);
                else if((mask & (1 << i)) == 0) count += helper(num,idx+1,mask | (1<<i),flag,tight == 1 && i == max ? 1:0);
                else count += helper(num,idx+1,mask,1,tight==1 && i==max?1:0);
            }
        return dp[idx][mask][flag][tight] = count;
    }
}