class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int x:nums){
        max=Math.max(x,max);
        }
         int moves=0;
        for(int i=0;i<n;i++){
            moves += (max-nums[i]);
        }
        return moves;
    }
}