class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int preFix = 1;
       for(int i=0; i<n;i++){
            answer[i]  = preFix;
            preFix = nums[i]*preFix;
        }

        int  postFix=1;
        for(int j=n-1; j>=0;j--){
            int x = answer[j];
            answer[j] = x*postFix;
            postFix = nums[j]*postFix;
        }

        return answer;
    }
}


