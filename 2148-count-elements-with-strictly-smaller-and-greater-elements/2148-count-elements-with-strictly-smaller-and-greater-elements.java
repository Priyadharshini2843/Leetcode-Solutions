class Solution {
    public int countElements(int[] nums) {
        int min=nums[0], max=nums[0];
        for(int x:nums){
            min=Math.min(min,x);
            max=Math.max(max,x);
        }
        int cnt = 0;
        for(int x:nums){
            if(x>min && x<max) cnt++;
        }
        return cnt;
    }
}