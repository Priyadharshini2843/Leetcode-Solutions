class Solution {
    public int countValidPrefixes(String s) {
        int count=0,zero=0,one=0;

        for(int c:s.toCharArray()){
            if(c=='0'){
                zero++;
            }
            else{
                one++;
            }
            if(Math.abs(zero-one)<=1){
                count++;
            }
        }
        return count;
    }
}