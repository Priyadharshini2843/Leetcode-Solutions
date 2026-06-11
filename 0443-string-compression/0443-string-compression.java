class Solution {
    public int compress(char[] chars) {
          int i = 0;
          int write = 0;
          int n = chars.length;
          while(i<n){
            char curr = chars[i];
            int count = 0;
            while(i<n && chars[i] == curr){
                count++;
                i++;
            }
            chars[write++]=curr;
            if(count > 1){
                String s= String.valueOf(count);
                for(char c:s.toCharArray())
                chars[write++] = c;
            }

          }
          return write;         
    }
}