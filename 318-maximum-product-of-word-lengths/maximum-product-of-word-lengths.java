class Solution {
    public int maxProduct(String[] words) {
        int n=words.length;
        int mask[]=new int[n];
        for (int i=0; i<n; i++){
            for(char c:words[i].toCharArray()){
                mask[i]|=(1<<(c-'a'));
            }
        }
        int res=0;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if((mask[i]&mask[j])==0)
                res=Math.max(res,words[i].length() * words[j].length());
            }
        }
        return res;
    }
}