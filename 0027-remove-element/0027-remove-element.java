class Solution {
    public int removeElement(int[] nums, int val) {
        int idx=0;

        int n=nums.length;

        for(int i=0;i<n;i++){
            if(val!=nums[i]){
                nums[idx] =nums[i];
                idx++;
            }
        }
        return idx;
    }
}