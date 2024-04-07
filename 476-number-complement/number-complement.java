class Solution {
    public int findComplement(int num) {
        return num^(Integer.highestOneBit(num)*2-1);
    }
}