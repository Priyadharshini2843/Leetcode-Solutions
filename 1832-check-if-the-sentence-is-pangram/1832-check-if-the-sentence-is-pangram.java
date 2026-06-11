class Solution {
    public boolean checkIfPangram(String sentence) {
        int cnt[] = new int[26];
        int n=sentence.length();

        for(int i=0;i<n;i++){
            char ch = sentence.charAt(i);
            cnt[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(cnt[i] == 0){
             return false;
            }
        }
        return true;
       
    }
}