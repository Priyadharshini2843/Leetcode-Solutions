class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int copy=n;
        int digit=0;
        int prod=1;
        while(n>0){
         digit=n%10;
         sum+=digit;
         prod*=digit;
         n/=10;
        }
        int t=0;
        t=sum+prod;
        if(copy%t==0) return true;
        return false;
    }
}