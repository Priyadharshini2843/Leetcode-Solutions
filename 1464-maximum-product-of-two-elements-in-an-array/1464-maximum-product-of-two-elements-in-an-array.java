class Solution {
    public int maxProduct(int[] nums) {
        int sl=Integer.MIN_VALUE;
        int l = Integer.MIN_VALUE;
int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>l){
                sl=l;
                l=nums[i];
            }
            else if( nums[i]>sl){
                sl=nums[i];
            }
        }
        return (sl-1)*(l-1);
    }
}