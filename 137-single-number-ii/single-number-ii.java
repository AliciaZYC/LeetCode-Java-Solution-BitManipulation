class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for (final int num : nums) {
            ones ^= (num & ~twos);//(a^b) & (~c) : (a XOR b) AND (NOT c)
            twos ^= (num & ~ones);
        }
        return ones;
    }
}
/* 
When a number appears

the first time: add to once
the second time: remove from once and add to twice
the third time: remove from twice and won’t add to once because of ~twice
*/