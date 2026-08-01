class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] result = new int[n];
        Arrays.fill(result,-1);

        if(k==0){
            return nums;
        }
        if(2*k+1 > n){
            return result;
        }
       
        int windowSize=2*k+1;
        long sum=0;
        for(int i=0;i<windowSize;i++){
         sum+=nums[i];
        }
         result[k] = (int) (sum/windowSize);


       int left=0;
       int right =windowSize-1; 
        while(right<n-1){
         sum-= nums[left];
         left++;
         right++;

         sum+= nums[right];

        result[left+k] = (int) (sum/windowSize);

        }
        return result;
    }
}