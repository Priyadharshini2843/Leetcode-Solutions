class Solution {
    public int pivotIndex(int[] nums) {
        int ls=0;
        int ts=0;
        for(int x:nums){
            ts+=x;
        }
        for(int i=0;i<nums.length;i++){
            if(ls*2 == ts-nums[i])
            return i;
            
            ls+=nums[i];
        }
        return -1;
    }
}