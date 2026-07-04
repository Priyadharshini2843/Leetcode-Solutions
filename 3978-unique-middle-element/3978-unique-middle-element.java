class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int x=nums[n/2];
        int c=0;
        for(int num:nums){
            if(x==num){
                c++;
            }
        }
        return c==1?true:false;
    }
}