class Solution {
    public int numberOfSubstrings(String s) {
        int l=0,n=s.length(),count=0;
        
        int[] freq = new int[26];
        for(int r=0;r<n;r++){
           freq[s.charAt(r)-'a']++;
           while(freq[0]>0 && freq[1]>0 && freq[2]>0){
            count+= (n-r);
            freq[s.charAt(l)-'a']--;
            l++;
           }
        }
        return count;
    }
}