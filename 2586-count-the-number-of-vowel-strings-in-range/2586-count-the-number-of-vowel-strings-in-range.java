class Solution {
    public int vowelStrings(String[] words, int left, int right) {
            int count =0;
            for(int i=left; i<=right; i++) {
            String s = words[i];
            int start = s.charAt(0);
            int end = s.charAt(s.length()-1);

            if((start=='a'||start=='e'||start=='i'||start=='o'||start=='u') && (end=='a'||end=='e'||end =='i'||end=='o'||end=='u')){
                 count++;
            }
    }
    return count;
}
}