class Solution {
    public boolean isPalindrome(int x) {
       if(x<0) return false;
       int copy=x;
       int rev=0;
       while(x>0){
        int digits=x%10;
        rev = rev*10 +digits ;
        x/=10;
       }
     return (copy==rev);
 }
}