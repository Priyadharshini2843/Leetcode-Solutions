class Solution {
    public String reverseWords(String s) {
        StringBuilder sb1 = new StringBuilder();
        String[] words=s.split("\\s");
        int n=words.length;
        for(int i=0;i<n;i++){
            String w = words[i];
            String sb = new StringBuilder(w).reverse().toString();
            sb1.append(sb);
            if(i != n-1)
            sb1.append(" ");
        }
        return sb1.toString();
    }
}