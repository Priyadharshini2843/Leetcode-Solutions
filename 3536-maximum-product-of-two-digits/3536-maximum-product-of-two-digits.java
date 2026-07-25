class Solution {
    public int maxProduct(int n) {

        int l = Integer.MIN_VALUE;
        int sl = -1;
        

        while(n>0){
            int digit = n%10;
            n=n/10;

      if(digit >=l){
        sl=l;
 l = digit;
      }
      else if(digit>sl){
        sl = digit;
      }
       
    }
     return sl * l; 
}
}