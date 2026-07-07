class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder sb = new StringBuilder();
        String x=String.valueOf(n);

        for(int i=0;i<x.length();i++){
            int digit = x.charAt(i)-'0';
            if(digit>0)
            sb.append(digit);
        }

        if(sb.length()==0){
            return 0;
        }
        long y=Long.parseLong(sb.toString());
        long copy=y;
        long sum=0;
        while(copy>0){
sum+=(copy%10);
copy/=10;
        }
        return y*sum;
    }
}