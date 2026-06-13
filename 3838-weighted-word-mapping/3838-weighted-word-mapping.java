class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n=words.length;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            String a = words[i];
            int sum=0;
            for(int j=0;j<a.length();j++){
                char ch=a.charAt(j);
                sum+=weights[ch-'a'];   }
                sum%=26;
                char c =(char)('z'-sum);
            sb.append(c);
        }
        return sb.toString();
    }
}