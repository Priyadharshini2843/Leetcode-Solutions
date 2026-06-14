class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0, squareSum =0;
        int copy=n;
        while(copy>0){
            digitSum +=copy%10;
            copy/=10;
        }
        
        while(n>0){
            int s =n%10;
            int ns = s*s;
            squareSum+=ns;
            n/=10;
        }
        if(squareSum-digitSum >= 50)
            return true;
        return false;
    }
}