class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        int c=0;
        int len = nums.length;

        for(int i=0;i<len;i++){
            if(nums[i] ==0){
        boolean leftEmpty = (i==0) || (nums[i-1] == 0);
        boolean rightEmpty = (i==nums.length -1) || (nums[i+1] == 0);
            if(leftEmpty && rightEmpty){
                nums[i] = 1;
                c++;
            }}
        }
        return n<=c;
    }
}