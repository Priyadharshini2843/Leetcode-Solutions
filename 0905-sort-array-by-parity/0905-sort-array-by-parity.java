class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];

        int evenIndex = 0;
        int oddIndex = nums.length-1;
      
        for(int num:nums){
            if(num%2 == 0){
                res[evenIndex] = num;
                evenIndex++;
            }
            else {
                res[oddIndex] = num;
                oddIndex--;
            }
        }
return res;
    }
}