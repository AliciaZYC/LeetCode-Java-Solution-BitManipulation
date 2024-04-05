public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res=0;
        for (int i=0; i<32; i++){
            int nBit=0;
            if (((n>>i)&1)==1){
                nBit=1<<31-i;
                res=res|nBit;
            }
        }
        return res;
    }
}