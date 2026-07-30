class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c1=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
c1++;
ans+=c1;
            }
            else{
                c1=0;
            }
        }
        return ans;
    }
}