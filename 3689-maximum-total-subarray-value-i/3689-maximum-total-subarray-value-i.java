class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=Long.MIN_VALUE, min =Long.MAX_VALUE;

        for(int x:nums){
            if(x>max) max=x;
            if(x<min) min=x;
        }
        return (max-min) * k;
    }
}