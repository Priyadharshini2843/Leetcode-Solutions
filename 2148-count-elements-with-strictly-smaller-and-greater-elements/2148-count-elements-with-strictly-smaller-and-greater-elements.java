class Solution {
    public int countElements(int[] nums) {
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int f=0, f1=0;
         for(int j=0;j<n;j++){
            if(nums[i]<nums[j]){
                f=1;
            }
            if(nums[i]>nums[j]){
                f1=1;
            }
         }
         if(f==1 && f1==1) cnt++;
        }
        return cnt;
    }
}