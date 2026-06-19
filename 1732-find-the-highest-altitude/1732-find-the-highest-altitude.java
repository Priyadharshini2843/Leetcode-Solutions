class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] alti = new int[n+1];
        alti[0] =0;
        for(int i=1;i<=n;i++){
            alti[i]=gain[i-1]+alti[i-1];
        }
        int max=alti[0];
        for(int i=1;i<=n;i++){
            if(alti[i]>max){
                max=alti[i];
            }
        }
        return max;
    }
}