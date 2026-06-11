class Solution {
    public boolean halvesAreAlike(String s){
       
         StringBuilder sb1 = new StringBuilder();
         StringBuilder sb2 = new StringBuilder();
       for(int i=0;i<s.length()/2;i++){
        sb1.append(s.charAt(i));
       }
       for(int i=s.length()/2;i<s.length();i++){
        sb2.append(s.charAt(i));
       }
       int i=0,cnt1=0;
       while(i<sb1.length()){
        char ch=sb1.charAt(i);
        boolean a = isV(ch);
        if(a)
        cnt1++;
        i++;
       }
       int j=0,cnt2=0;
       while(j<sb2.length()){
        char ch=sb2.charAt(j);
        boolean b = isV(ch);
        if(b)
        cnt2++;
        j++;
       }
       return cnt1==cnt2;
    }

       public boolean isV(char ch){
        if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch =='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        return true;
        return false;
     }

    }

     