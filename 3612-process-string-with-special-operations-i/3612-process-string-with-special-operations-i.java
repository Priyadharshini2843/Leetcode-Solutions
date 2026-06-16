class Solution {
    public String rev(String s){
        char[] arr = s.toCharArray();
        int l=0;
        int e = arr.length-1;
          while(l<=e){
          char temp= arr[l];
          arr[l] = arr[e];
          arr[e] = temp;
          l++;
          e--;
    }
    return new String(arr);
    }
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
            result.append(ch);
            else if(ch == '*'){
                if(result.length()>0)
                result.deleteCharAt(result.length()-1);
            }
            else if(ch == '#'){
                result.append(result);
            }
            else{
                String curr =result.toString();
                String r =rev(curr);
                result = new StringBuilder(r);
        }
    }
    return result.toString();
}
}