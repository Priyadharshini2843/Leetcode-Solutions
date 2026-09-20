class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int freq[] = new int[26];

    

        for(int i=0;i<26;i++){
            freq[i] = 26-i;
        }

int sum=0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
int ch1 = ch-'a';

sum+=freq[ch1]*(i+1);
        }
        return sum;
    }
}