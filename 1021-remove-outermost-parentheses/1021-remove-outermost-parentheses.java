class Solution {
    public String removeOuterParentheses(String s) {
        int c=0;

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch==')'){
                c--;
            }
            if(c!=0){
                sb.append(ch);
            }
            if(ch=='(')
            c++;
        }
            return sb.toString();
        
    }
}