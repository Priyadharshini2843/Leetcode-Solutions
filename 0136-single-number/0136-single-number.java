class Solution {
    public int singleNumber(int[] nums) {
        
        int idx=0;
int n=nums.length;
        for(int i=0;i<n;i++){
            idx^=nums[i];
        }
        return idx;
    }
}