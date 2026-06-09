class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int n = word1.length();
        int cnt1[] = new int[26];
        int cnt2[] = new int[26];

        for(int i=0; i<word1.length(); i++){
        char ch1 = word1.charAt(i);
        char ch2 = word2.charAt(i);

        cnt1[ch1-'a']++;
        cnt2[ch2-'a']++; }
        
        for(int i=0;i<26;i++){
            if((cnt1[i]-cnt2[i])>3) return false;
        }
        
        return true;

    }
}