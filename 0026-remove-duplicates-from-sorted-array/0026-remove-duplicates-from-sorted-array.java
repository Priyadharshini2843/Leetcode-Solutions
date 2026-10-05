class Solution {
    public int removeDuplicates(int[] num) {
       int i=0;
       for(int j=1;j<num.length;j++){
        if(num[j] != num[i]){
            num[i+1] = num[j];
            i++;
        }
       }
       return i+1; 
    }
}