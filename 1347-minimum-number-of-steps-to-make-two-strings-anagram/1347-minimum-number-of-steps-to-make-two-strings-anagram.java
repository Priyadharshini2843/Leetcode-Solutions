class Solution {
    public int minSteps(String s, String t) {
        int f1[] = new int[26];
        int f2[] = new int[26];
        for(char ch:s.toCharArray()){
         f1[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
         f1[ch-'a']--;
        }
        int cnt=0;
        for(int i=0;i<26;i++){
            if(f1[i]>0)
            cnt+=f1[i];
        }
        return cnt;


    }
}