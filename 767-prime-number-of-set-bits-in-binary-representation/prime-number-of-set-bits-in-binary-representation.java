class Solution {
    public int countPrimeSetBits(int left, int right) {
        int[] prime = {
            0,0,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0
        };
        int res=0;
        for (int start = left; start <= right; ++start){
            int v = start;
            v = ((v & 0x00055555) + ((v >> 1) & 0x00055555));
            v = ((v & 0x00033333) + ((v >> 2) & 0x00033333));
            v = ((v & 0x000f0f0f) + ((v >> 4) & 0x000f0f0f));
            v = ((v & 0x000f00ff) + ((v >> 8) & 0x000f00ff));
            res += prime[((v & 0x0000ffff) + ((v >> 16) & 0x0000ffff))];
        }
        return res;
    }
}