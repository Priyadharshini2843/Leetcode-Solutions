class Solution {
    public int rob(int[] nums) {
        int prev2=0;
        int prev = nums[0];
        int curr =0;
int n=nums.length;
        for(int i=1;i<n;i++){
            int take=nums[i];

            if(i>1){
                take+=prev2;
            }
            int nontake=0+prev;

            curr=Math.max(take,nontake);

            prev2=prev;
            prev=curr;
        }
        return prev;

    }
}